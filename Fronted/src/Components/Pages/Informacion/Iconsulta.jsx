import React from "react";
import TextField from "@mui/material/TextField";
import "./informacion.css";
import Title from "../../Title/Title";
import axios from "axios";

class Iconsulta extends React.Component {
  constructor(props) {
    super(props);
  }

  state = {
    info: [],
    form: {
      motivoConsulta: "",
      expectativas: "",
      objetivosClinicos: "",
      otraInformacion: "",
    },
  };

  manejadorChange = async (e) => {
    await this.setState({
      form: {
        ...this.state.form,
        [e.target.name]: e.target.value,
      },
    });
    console.log(this.state.form);
  };

  manejadorSubmit = (e) => {
    e.preventDefault();
  };

  componentDidMount() {
    this.getInfo();
  }

  getInfo = async () => {
    let res = await axios.get(
      `http://localhost:8080/expediente/findById/${this.props.id}`
    );
    let data = res.data;
    //console.log(data);
    this.setState({
      info: data,
    });
    console.log(this.state.info);
  };

  render() {
    return (
      <>
        <div className="form-section-consulta">
          <Title
            titulo="Informacion de la consulta"
            description="Motivacion y expectativas para el seguimiento"
          />

          <form onSubmit={this.manejadorSubmit}>
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Motivo de la consulta"
              name="motivoConsulta"
              onChange={this.manejadorChange}
              defaultValue={this.state.info.motivoConsulta}
              //   helperText="Please enter your name"
            />
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Expectativas"
              name="expectativas"
              onChange={this.manejadorChange}
              defaultValue={this.state.info.expectativas}

            />
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Objetivos clinicos"
              name="objetivosClinicos"
              onChange={this.manejadorChange}
              defaultValue={this.state.form.objetivosClinicos}
            />
            <TextField
              className="input-txt"
              id="outlined-name"
              label="Otras Informaciones"
              name="otraInformacion"
              onChange={this.manejadorChange}
            />
          </form>
        </div>
      </>
    );
  }
}

export default Iconsulta;
