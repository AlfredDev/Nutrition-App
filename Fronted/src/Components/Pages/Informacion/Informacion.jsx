import React, { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import AnimatedPage from "../../AnimationPage";
import Title from "../../Title/Title";
import BarExpediente from "./BarExpediente";
import Gestacion from "./Gestacion";
import HistoriaClinica from "./HistoriaClinica";
import HistorialAlmentaria from "./HistorialAlmentaria";
import Iconsulta from "./Iconsulta";
import "./informacion.css";
import TextField from "@mui/material/TextField";

export default function Informacion() {
  const { id } = useParams();
  const [paciente, setPaciente] = useState([]);

  useEffect(() => {
    fetch(`http://localhost:8080/paciente/findById/${id}`)
      .then((res) => res.json())
      .then((result) => {
        setPaciente(result);
      });
  }, [id]);

  return (
    <AnimatedPage>
      <div className="informacion">
        <div className="informacion-content">
          <div className="static-header">
            {" "}
            <Title
              titulo="Perfil del Cliente"
              description="Consulta y cambia informacion de tu cliente"
            />
            <div className="name-cliente">
              Cliente <h2> {paciente.nombre}</h2>
            </div>
          </div>
          <BarExpediente id={id} />
          <div className="section">
            <div className="section-left">
              <Iconsulta />
              <Gestacion />
              <HistorialAlmentaria />
            </div>
            <div className="section-right">
              <HistoriaClinica />
              <div className="form-section-consulta">
                <Title
                  titulo="Observaciones"
                  description="Otras informaciones relevantes del cliente
                  "
                />
                <form action="">
                  <TextField 
                    id="outlined-multiline-flexible"
                    label="Obervaciones"
                    multiline
                    maxRows={5}
                  />
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </AnimatedPage>
  );
}
