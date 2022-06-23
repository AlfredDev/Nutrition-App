import React from "react";
import Title from "../../../Title/Title";
import TextField from "@mui/material/TextField";
class DatosAnaliticos extends React.Component {
  state = {
    info: [],
    form: {
      hdlcolesterol: 0,
      ldlcolesterol: 0,
      colesterolTotal: 0,
      presionDiastolica: 0,
      presionSistolica: 0,
      trigliceridos: 0,
      fecha_registro: this.getFecha_registro() + "",
    },
  };

  manejadorChange = async (e) => {
    await this.setState({
      form: {
        ...this.state.form,
        [e.target.name]: e.target.value,
      },
    });
    // console.log(this.state.form);
  };

  handlerButton = async () => {
    const res = await fetch(
      `http://localhost:8080/datoAnalitico/addDatoAnalitico/${this.props.id}/data`,
      {
        method: "post",
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

  getFecha_registro() {
    var dateObj = new Date().toLocaleDateString("en-CA", {
      year: "numeric",
      month: "2-digit",
      day: "2-digit",
    }); // 08/19/2020 (month and day with two digits)
    return dateObj;
  }

  render() {
    return (
      <>
        <div className="form-section-consulta">
          <Title titulo="Datos analiticos" />
          <form onSubmit={this.manejadorSubmit}>
            <div className="imput-cont">
              <h3>Colesterol HDL:</h3>
              <TextField
                className="TextField"
                id="standard-basic"
                variant="standard"
                label="(MG/DL)"
                type="number"
                name="hdlcolesterol"
                onChange={this.manejadorChange}
              />
            </div>
            <div className="imput-cont">
              <h3>Colesterol LDL:</h3>
              <TextField
                className="TextField"
                id="standard-basic"
                label="(MG/DL)"
                variant="standard"
                type="number"
                name="ldlcolesterol"
                onChange={this.manejadorChange}
              />
            </div>
            <div className="imput-cont">
              <h3>Colesterol total:</h3>
              <TextField
                className="TextField"
                id="standard-basic"
                label="(MG/DL)"
                variant="standard"
                type="number"
                name="colesterolTotal"
                onChange={this.manejadorChange}
              />
            </div>
            <div className="imput-cont">
              <h3>Presion arterial diastolica:</h3>
              <TextField
                className="TextField"
                id="standard-basic"
                variant="standard"
                label="(mmHg)"
                type="number"
                name="presionDiastolica"
                onChange={this.manejadorChange}
              />
            </div>
            <div className="imput-cont">
              <h3>Presion arterial sistólica:</h3>
              <TextField
                className="TextField"
                id="standard-basic"
                variant="standard"
                label="(mmHg)"
                type="number"
                name="presionSistolica"
                onChange={this.manejadorChange}
              />
            </div>
            <div className="imput-cont">
              <h3>Triglicéridos:</h3>
              <TextField
                className="TextField"
                id="standard-basic"
                variant="standard"
                type="number"
                label="(MG/DL)"
                name="trigliceridos"
                onChange={this.manejadorChange}
              />
            </div>
          </form>
          <button type="submit" className="btn guardar" onClick={this.handlerButton}>
            Registrar
          </button>
        </div>
      </>
    );
  }
}

export default DatosAnaliticos;
