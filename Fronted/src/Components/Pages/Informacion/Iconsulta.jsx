import React from "react";
import TextField from "@mui/material/TextField";
import "./informacion.css";
import Title from "../../Title/Title";

function Iconsulta() {
  return (
    <>
      <div className="form-section-consulta">
        <Title
          titulo="Informacion de la consulta"
          description="Motivacion y expectativas para el seguimiento"
        />
        <form action="">
          <TextField
            className="input-txt"
            id="outlined-name"
            label="Motivo de la consulta"
          //   helperText="Please enter your name"
          />
          <TextField
            className="input-txt"
            id="outlined-name"
            label="Expectativas"
          />
          <TextField
            className="input-txt"
            id="outlined-name"
            label="Objetivos clinicos"
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

export default Iconsulta;
