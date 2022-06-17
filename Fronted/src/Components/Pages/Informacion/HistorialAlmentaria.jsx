import React from "react";
import Title from "../../Title/Title";
import TextField from "@mui/material/TextField";

function HistorialAlmentaria() {
  return (
    <>
      <div className="form-section-consulta">
        <Title
          titulo="Historia alimentaria"
          description="Hábitos y preferencias alimentarias del cliente"
        />
        <form action="">
          <TextField
            className="input-txt"
            id="outlined-name"
            label="Hora habitual para levantarse"
            //   helperText="Please enter your name"
          />
          <TextField
            className="input-txt"
            id="outlined-name"
            label="Hora habitual para acostarse"
          />
          <TextField
            className="input-txt"
            id="outlined-name"
            label="Tipos de dieta"
          />
          <TextField
            className="input-txt"
            id="outlined-name"
            label="Alimentos favoritos"
          />
          <TextField
            className="input-txt"
            id="outlined-name"
            label="Alimentos rechazados"
          />
          <TextField
            className="input-txt"
            id="outlined-name"
            label="Alergias"
          />
          <TextField
            className="input-txt"
            id="outlined-name"
            label="Intolerancis alimentarias"
          />
          <TextField
            className="input-txt"
            id="outlined-name"
            label="Deficiencias nutricionales"
          />
          <TextField
            className="input-txt"
            id="outlined-name"
            label="Ingesta de agua"
          />
          <TextField
            className="input-txt"
            id="outlined-name"
            label="Otas informaciones"
          />
        </form>
      </div>
    </>
  );
}

export default HistorialAlmentaria;
