import React from "react";
import Title from "../../Title/Title";
import TextField from "@mui/material/TextField";
function Gestacion() {
  return (
    <>
      {" "}
      <div className="form-section-consulta">
        <div className="icono-titulo">
          <Title
            titulo="Historia personal y social"
            description="Informaciones y hábitos fisiológicos y sociales del cliente
          "
          />
        </div>
        <form action="">
          <TextField
            className="input-txt"
            id="outlined-name"
            label="Patalogias"
            //   helperText="Please enter your name"
          />
          <TextField
            className="input-txt"
            id="outlined-name"
            label="Medicacion"
          />
          <TextField
            className="input-txt"
            id="outlined-name"
            label="Antecedentes personales"
          />
          <TextField
            className="input-txt"
            id="outlined-name"
            label="Antecedentes familiares"
          />
          <TextField
            className="input-txt"
            id="outlined-name"
            label="Otras Informaciones"
          />
        </form>
      </div>
    </>
  );
}

export default Gestacion;
