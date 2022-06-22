import React from "react";
import AnimatedPage from "../../../AnimationPage";
import { useParams } from "react-router-dom";
import Title from "../../../Title/Title";
import BarExpediente from "../BarExpediente";

function Plan() {
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
        </div>
      </div>
    </AnimatedPage>
  );
}

export default Plan;
