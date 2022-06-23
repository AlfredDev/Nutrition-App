import React from "react";
import Title from "../../../Title/Title";
import TextField from "@mui/material/TextField";
class ComposicionCorporal extends React.Component {
  state = {
    info: [],
    form: {
      masaGrasa: 0,
      masaMuscular: 0,
      porcentajeMasaGrasa: 0,
      porcentajeMasaMuscular: 0,
      fecha_registro: this.getFecha_registro() + "",
    },
  };

  getFecha_registro() {
    var dateObj = new Date().toLocaleDateString("en-CA", {
      year: "numeric",
      month: "2-digit",
      day: "2-digit",
    }); // 08/19/2020 (month and day with two digits)
    return dateObj;
  }
  manejadorChange = async (e) => {
    await this.setState({
      form: {
        ...this.state.form,
        [e.target.name]: e.target.value,
      },
    });
    // console.log(this.state.form);
  };

  manejadorSubmit = (e) => {
    e.preventDefault();
  };

  handlerButton = async () => {
    const res = await fetch(
      `http://localhost:8080/Composicion/addComposicion/${this.props.id}/data`,
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
          <Title titulo="Composición corporal" />
          <form onSubmit={this.manejadorSubmit}>
            <div className="imput-cont">
              <h3>Masa grasa:</h3>
              <TextField
                className="TextField"
                id="standard-basic"
                variant="standard"
                type="number"
                label="(KG)"
                name="masaGrasa"
                onChange={this.manejadorChange}
              />
            </div>
            <div className="imput-cont">
              <h3>Masa muscular:</h3>
              <TextField
                className="TextField"
                id="standard-basic"
                label="(KG)"
                variant="standard"
                type="number"
                name="masaMuscular"
                onChange={this.manejadorChange}
              />
            </div>
            <div className="imput-cont">
              <h3>Porcentaje de masa grasa:</h3>
              <TextField
                className="TextField"
                id="standard-basic"
                label="(%)"
                variant="standard"
                type="number"
                name="porcentajeMasaGrasa"
                onChange={this.manejadorChange}
              />
            </div>
            <div className="imput-cont">
              <h3>Porcentaje de masa muscular:</h3>
              <TextField
                className="TextField"
                id="standard-basic"
                label="(%)"
                variant="standard"
                type="number"
                name="porcentajeMasaMuscular"
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

export default ComposicionCorporal;
