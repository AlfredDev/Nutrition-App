import React from "react";
import Title from "../../../Title/Title";
import { useParams } from "react-router-dom";
import BarExpediente from "../BarExpediente";
import AnimatedPage from "../../../AnimationPage";

function Mediciones() {
  const { id } = useParams();

  return (
    <AnimatedPage>
      <div className="static-header">
        <Title
          titulo="Perfil del Cliente"
          description="Consulta y cambia informacion de tu cliente"
        />
      </div>
      <BarExpediente id={id}/>
      {id}
    </AnimatedPage>
  );
}

export default Mediciones;
