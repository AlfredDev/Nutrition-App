import React from "react";
import Title from "../../../Title/Title";
import TextField from "@mui/material/TextField";
function DatosAnaliticos() {
  return (
    <>
      <div className="form-section-consulta">
        <Title titulo="Datos analiticos" />
        <form action="">
          <div className="imput-cont">
            <h3>Colestetol HDL:</h3>
            <TextField
              className="TextField"
              id="standard-basic"
              variant="standard"
              type="number"
            />
          </div>
          <div className="imput-cont">
            <h3>Colestetol LDL:</h3>
            <TextField
              className="TextField"
              id="standard-basic"
              label="(LDL)"
              variant="standard"
              type="number"
            />
          </div>
          <div className="imput-cont">
            <h3>Colestetol total:</h3>
            <TextField
              className="TextField"
              id="standard-basic"
              label="Total"
              variant="standard"
              type="number"
            />
          </div>
          <div className="imput-cont">
            <h3>Presion alterial diastolica:</h3>
            <TextField
              className="TextField"
              id="standard-basic"
              variant="standard"
              type="number"
            />
          </div>
          <div className="imput-cont">
            <h3>Presion alterial sistólica:</h3>
            <TextField
              className="TextField"
              id="standard-basic"
              variant="standard"
              type="number"
            />
          </div>
          <div className="imput-cont">
            <h3>Triglicéridos:</h3>
            <TextField
              className="TextField"
              id="standard-basic"
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

export default DatosAnaliticos;
