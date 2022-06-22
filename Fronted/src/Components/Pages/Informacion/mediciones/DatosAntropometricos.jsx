import React from "react";
import Title from "../../../Title/Title";
import TextField from "@mui/material/TextField";

class DatosAntropometricos extends React.Component {
  state = {
    info: [],
    form: {
      peso: 0,
      altura: 0,
      perimetroCadera: 0,
      perimetroCintura: 0,
      perimetroCutaneoAbdominal: 0,
      perimetroCutaneoPectoral: 0,
      pliegeCutaneoMuslo: 0,
      pliegeCutaneoSubecapular: 0,
      fecha_registro: this.getFecha_registro()+"",
    },
  };




  getFecha_registro() {
    var dateObj = new Date().toLocaleDateString('en-CA', {year: 'numeric', month: '2-digit', day: '2-digit'}); // 08/19/2020 (month and day with two digits)
    return dateObj;
  }

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
  handlerButton = async () => {
    const res = await fetch(
      `http://localhost:8080/datoAntro/addDatoantro/${this.props.id}/data`,
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

  render() {
    return (
      <>
        <div className="form-section-consulta">
          <Title titulo="Datos antropométricos" />
          <form onSubmit={this.manejadorSubmit}>
            <div className="imput-cont">
              <h3>Peso:</h3>
              <TextField
                className="TextField"
                id="standard-basic"
                label="(KG)"
                variant="standard"
                type="number"
                name="peso"
                onChange={this.manejadorChange}
              />
            </div>
            <div className="imput-cont">
              <h3>Altura:</h3>
              <TextField
                className="TextField"
                id="standard-basic"
                label="(CM)"
                variant="standard"
                type="number"
                name="altura"
                onChange={this.manejadorChange}
              />
            </div>
            <div className="imput-cont">
              <h3>Perimietro de la cadera:</h3>
              <TextField
                className="TextField"
                id="standard-basic"
                label="(MM)"
                variant="standard"
                type="number"
                name="perimetroCadera"
                onChange={this.manejadorChange}
              />
            </div>
            <div className="imput-cont">
              <h3>Perimietro de la cintura:</h3>
              <TextField
                className="TextField"
                id="standard-basic"
                label="(MM)"
                variant="standard"
                type="number"
                name="perimetroCintura"
                onChange={this.manejadorChange}
              />
            </div>
            <div className="imput-cont">
              <h3>Pliege cutaneo abdominal:</h3>
              <TextField
                className="TextField"
                id="standard-basic"
                label="(MM)"
                variant="standard"
                type="number"
                name="perimetroCutaneoAbdominal"
                onChange={this.manejadorChange}
              />
            </div>
            <div className="imput-cont">
              <h3>Pliege cutaneo pectoral:</h3>
              <TextField
                className="TextField"
                id="standard-basic"
                label="(MM)"
                variant="standard"
                type="number"
                name="perimetroCutaneoPectoral"
                onChange={this.manejadorChange}
              />
            </div>
            <div className="imput-cont">
              <h3>Pliege cutaneo del muslo:</h3>
              <TextField
                className="TextField"
                id="standard-basic"
                label="(MM)"
                variant="standard"
                type="number"
                name="pliegeCutaneoMuslo"
                onChange={this.manejadorChange}
              />
            </div>
            <div className="imput-cont">
              <h3>Pliege cutaneo subescapular:</h3>
              <TextField
                className="TextField"
                id="standard-basic"
                label="(MM)"
                variant="standard"
                type="number"
                name="pliegeCutaneoSubecapular"
                onChange={this.manejadorChange}
              />
            </div>
          </form>
          <button
            type="submit"
            className="btn guardar"
            onClick={this.handlerButton}
          >
            Registrar
          </button>
        </div>
      </>
    );
  }
}

export default DatosAntropometricos;
