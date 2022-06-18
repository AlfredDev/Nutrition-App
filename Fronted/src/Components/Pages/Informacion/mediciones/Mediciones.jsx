import React from "react";
import Title from "../../../Title/Title";
import { useParams } from "react-router-dom";
import BarExpediente from "../BarExpediente";
import AnimatedPage from "../../../AnimationPage";
import "./Mediciones.css";
import DatosAntropometricos from "./DatosAntropometricos";
import DatosAnaliticos from "./DatosAnaliticos";
import ComposicionCorporal from "./ComposicionCorporal";

function Mediciones() {
  const { id } = useParams();

  return (
    <AnimatedPage>
      <div className="informacion">
        <div className="mediciones-content">
          <div className="static-header">
            <Title
              titulo="Perfil del Cliente"
              description="Consulta y cambia informacion de tu cliente"
            />
          </div>
          <BarExpediente id={id} />

          <div className="section-mediciones">
            <div className="section-left">
              <DatosAntropometricos />
              <DatosAnaliticos/>
              <ComposicionCorporal/>
            </div>
            <div className="section-right">x</div>
          </div>
        </div>
      </div>
    </AnimatedPage>
  );
}

export default Mediciones;
