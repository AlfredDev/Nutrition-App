import React from "react";
import Title from "../../../Title/Title";
import TextField from "@mui/material/TextField";

function DatosAntropometricos() {
  return (
    <>
      <div className="form-section-consulta">
        <Title titulo="Datos antropométricos" />
        <form action="">
          <div className="imput-cont">
            <h3>Peso:</h3>
            <TextField
              className="TextField"
              id="standard-basic"
              label="(KG)"
              variant="standard"
              type="number"
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

export default DatosAntropometricos;
