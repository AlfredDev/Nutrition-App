import React, { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import AnimatedPage from "../../AnimationPage";
import Title from "../../Title/Title";
import BarExpediente from "./BarExpediente";
import HistoryClinnic from "./Gestacion";
import HistoriaPersonal from "./HistoriaPersonal";
import HistorialAlmentaria from "./HistorialAlmentaria";
import Iconsulta from "./Iconsulta";
import "./informacion.css";
import Observaciones from "./Observaciones";

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

  function calcularEdad(fecha) {
    var hoy = new Date();
    var cumpleanos = new Date(fecha);
    var edad = hoy.getFullYear() - cumpleanos.getFullYear();
    var m = hoy.getMonth() - cumpleanos.getMonth();

    if (m < 0 || (m === 0 && hoy.getDate() < cumpleanos.getDate())) {
      edad--;
    }

    return edad;
  }

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
              <div>
                Cliente: <h2> {paciente.nombre}</h2>
              </div>
              <div>
                Edad: <h2>{calcularEdad(paciente.fechaNacimiento)}</h2>
              </div>
            </div>
          </div>
          <BarExpediente id={id} />
          <div className="section">
            <div className="section-left">
              <Iconsulta id={id} />
              <HistoriaPersonal id={id} />

              <HistorialAlmentaria id={id} />
            </div>
            <div className="section-right">
              <HistoryClinnic id={id} />
              <Observaciones id={id} />
            </div>
          </div>
        </div>
      </div>
    </AnimatedPage>
  );
}
