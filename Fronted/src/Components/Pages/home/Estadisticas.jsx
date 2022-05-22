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
            <li class="stat">
              <h2 class="value">0 de 1</h2>
              <div class="description">
                <div class="text">Clientes activos sobre el total</div>
                <div class="percentage">0%</div>
              </div>
            </li>
            <li class="stat">
              <h2 class="value">0</h2>
              <div class="description">
                <div class="text">Nuevos clientes este mes</div>
                <div class="percentage">
                  <div class="material-icons">
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
      </div>
    </>
  );
}
