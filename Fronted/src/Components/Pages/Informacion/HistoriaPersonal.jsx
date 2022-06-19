import React from "react";
import Title from "../../Title/Title";
import TextField from "@mui/material/TextField";
import axios from "axios";

class HistoriaPersonal extends React.Component {
// eslint-disable-next-line
  constructor(props) {
    super(props);
  }

  state = {
    info: [],
    form: {
      funcionIntestinal: "",
      calidadSueño: "",
      fumador: "",
      bebeAlcohol: "",
      estadoCivil: "",
      actividadFisica: "",
      otraInformacion: "",
    },
  };

  componentDidMount() {
    this.getInfo();
  }


  getInfo = async () => {
    let res = await axios.get(
      `http://localhost:8080/expediente/historiaSocialgetByid/${this.props.id}`
    );
    let data = res.data;
    //console.log(data);
    this.setState({
      info: data,
      form: data, //Se establece para mostrar un valor por defecto al textField
    });
    // console.log(this.state.form);
  };

  manejadorChange = async (e) => {
    await this.setState({
      form: {
        ...this.state.form,
        [e.target.name]: e.target.value,
      },
    });
    // console.log(this.state.form);
    this.updateNote(); // Hace un metodo put cada vez que se telcea en el input
  };

  updateNote = async () => {
    const res = await fetch(`http://localhost:8080/expediente/editarHistoriaSocial/${this.state.info.id}`, {
      method: "put",
      headers: {
        "Content-Type": "application/json",
        "x-access-token": "token-value",
      },
      body: JSON.stringify(this.state.form),
    });
    if (!res.ok) {
      const message = `An error has occured: ${res.status} - ${res.statusText}`;
      throw new Error(message);
    }
  };

  manejadorSubmit = (e) => {
    e.preventDefault();
  };



  render() {
    return (
      <>
        <div className="form-section-consulta">
          <Title
            titulo="Historia personal y social"
            description="Informaciones y hábitos fisiológicos y sociales del cliente
          "
          />
          <form onSubmit={this.manejadorSubmit}>
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Funcion instestinal"
              name="funcionIntestinal"
              onChange={this.manejadorChange}
              value={this.state.form.funcionIntestinal}
              //   helperText="Please enter your name"
            />
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Calidad del sueño"
              name="calidadSueño"
              onChange={this.manejadorChange}
              value={this.state.form.calidadSueño}
            />
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Fumador"
              name="fumador"
              onChange={this.manejadorChange}
              value={this.state.form.fumador}
            />
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Bebe alchol"
              name="bebeAlcohol"
              onChange={this.manejadorChange}
              value={this.state.form.bebeAlcohol}
            />
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Estado Civil"
              name="estadoCivil"
              onChange={this.manejadorChange}
              value={this.state.form.estadoCivil}
            />
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Actividad fisica"
              name="actividadFisica"
              onChange={this.manejadorChange}
              value={this.state.form.actividadFisica}
            />
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Otas informaciones"
              name="otraInformacion"
              onChange={this.manejadorChange}
              value={this.state.form.otraInformacion}
            />
          </form>
        </div>
      </>
    );
  }
}

export default HistoriaPersonal;
