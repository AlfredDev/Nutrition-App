import React from "react";
import Title from "../../Title/Title";
import TextField from "@mui/material/TextField";
import axios from "axios";

class HistoryClinnic extends React.Component {
// eslint-disable-next-line
  constructor(props) {
    super(props);
  }

  state = {
    info: [],
    form: {
      patalogias: "",
      medicacion: "",
      antecedentePersonal: "",
      antecedenteFamiliar: "",
      otraInformacion: "",
    },
  };

  componentDidMount() {
    this.getInfo();
  }


  getInfo = async () => {
    let res = await axios.get(
      `http://localhost:8080/expediente/historiafindById/${this.props.id}`
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
    const res = await fetch(`http://localhost:8080/expediente/editarHistoria/${this.state.info.id}`, {
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
        {" "}
        <div className="form-section-consulta">
          <div className="icono-titulo">
          <Title
          titulo="Historia clínica"
          description="Patologías, medicación y antecedentes personales y familiares
          "
        />
          </div>
          <form onSubmit={this.manejadorSubmit}>
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Patalogias"
              name="patalogias"
              onChange={this.manejadorChange}
              value={this.state.form.patalogias}
              //   helperText="Please enter your name"
            />
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Medicacion"
              name="medicacion"
              onChange={this.manejadorChange}
              value={this.state.form.medicacion}
            />
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Antecedentes personales"
              name="antecedentePersonal"
              onChange={this.manejadorChange}
              value={this.state.form.antecedentePersonal}
            />
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Antecedentes familiares"
              name="antecedenteFamiliar"
              onChange={this.manejadorChange}
              value={this.state.form.antecedenteFamiliar}
            />
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Otras Informaciones"
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

export default HistoryClinnic;
