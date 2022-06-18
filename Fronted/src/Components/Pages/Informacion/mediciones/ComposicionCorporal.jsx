import React from "react";
import Title from "../../../Title/Title";
import TextField from "@mui/material/TextField";
function ComposicionCorporal() {
  return (
    <>
      <div className="form-section-consulta">
        <Title titulo="Composición corporal" />
        <form action="">
          <div className="imput-cont">
            <h3>Masa grasa:</h3>
            <TextField
              className="TextField"
              id="standard-basic"
              variant="standard"
              type="number"
              label="(KG)"
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
            />
          </div>
        </form>
        <button type="submit" className="btn guardar">
          Registrar
        </button>
      </div>
    </>
  );
}

export default ComposicionCorporal;
