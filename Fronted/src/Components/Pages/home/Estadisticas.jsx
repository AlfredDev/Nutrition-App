import React from "react";
import Title from "../../Title/Title";
import "./home.css";
import RemoveIcon from "@mui/icons-material/Remove";




export default function Estadisticas() {
  return (
    <>
      <div className="informacion-general">
        <Title
          titulo="Informacion General"
          description="Consulta la actividad general"
        />
        <div className="widget-content">
          <ul className="stats">
            <li className="stat">
              <h2 className="value">0 de 1</h2>
              <div className="description">
                <div className="text">Clientes activos sobre el total</div>
                <div className="percentage">0%</div>
              </div>
            </li>
            <li className="stat">
              <h2 className="value">0</h2>
              <div className="description">
                <div className="text">Nuevos clientes este mes</div>
                <div className="percentage">
                  <div className="material-icons">
                    <RemoveIcon />
                  </div>
                </div>
              </div>
            </li>{" "}
          </ul>
        </div>
      </div>

      <div className="informacion-general nuevo_c">
        <Title
          titulo="Nuevos clientes"
          description="Evolucion de los clientes en las utimas 6 semanas"
        />
      </div>

      <div className="informacion-general edad">
        <Title
          titulo="Distribucion por edad"
          description="Distribucion de los clientes por edad"
        />
        <div className="chart-container">
              
        </div>
      </div>
    </>
  );
}
