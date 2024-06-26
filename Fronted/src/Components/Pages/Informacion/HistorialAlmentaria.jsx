import React from "react";
import Title from "../../Title/Title";
import TextField from "@mui/material/TextField";
import axios from "axios";

class HistorialAlmentaria extends React.Component {
  // eslint-disable-next-line
  constructor(props) {
    super(props);
  }

  state = {
    info: [],
    form: {
      horaLevantarse: "",
      horaAcostarse: "",
      tipoDieta: "",
      alimentoFavorito: "",
      alimentoRechazado: "",
      alergia: "",
      intoleranciaAlimentaria: "",
      deficienciasNutricionales: "",
      ingestaAgua: "",
      otraInformacion: "",
    },
  };

  componentDidMount() {
    this.getInfo();
  }

  getInfo = async () => {
    let res = await axios.get(
      `http://localhost:8080/expediente/historiaAliementariGetby/${this.props.id}`
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
    const res = await fetch(
      `http://localhost:8080/expediente/editarHistoriaAlimento/${this.state.info.id}`,
      {
        method: "put",
        headers: {
          "Content-Type": "application/json",
          "x-access-token": "token-value",
        },
        body: JSON.stringify(this.state.form),
      }
    );
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
            titulo="Historia alimentaria"
            description="Hábitos y preferencias alimentarias del cliente"
          />
          <form onSubmit={this.manejadorSubmit}>
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Hora habitual para levantarse"
              name="horaLevantarse"
              onChange={this.manejadorChange}
              value={this.state.form.horaLevantarse}
              //   helperText="Please enter your name"
            />
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Hora habitual para acostarse"
              name="horaAcostarse"
              onChange={this.manejadorChange}
              value={this.state.form.horaAcostarse}
            />
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Tipo de dieta"
              name="tipoDieta"
              onChange={this.manejadorChange}
              value={this.state.form.tipoDieta}
            />
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Alimentos favoritos"
              name="alimentoFavorito"
              onChange={this.manejadorChange}
              value={this.state.form.alimentoFavorito}
            />
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Alimentos rechazados"
              name="alimentoRechazado"
              value={this.state.form.alimentoRechazado}

              onChange={this.manejadorChange}
            />
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Alergias"
              name="alergia"
              onChange={this.manejadorChange}
              value={this.state.form.alergia}
            />
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Intolerancis alimentarias"
              name="intoleranciaAlimentaria"
              onChange={this.manejadorChange}
              value={this.state.form.intoleranciaAlimentaria}
            />
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Deficiencias nutricionales"
              name="deficienciasNutricionales"
              onChange={this.manejadorChange}
              value={this.state.form.deficienciasNutricionales}
            />
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Ingesta de agua"
              name="ingestaAgua"
              onChange={this.manejadorChange}
              value={this.state.form.ingestaAgua}
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

export default HistorialAlmentaria;
