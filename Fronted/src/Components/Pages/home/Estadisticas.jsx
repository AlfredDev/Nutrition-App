import React from "react";
import Title from "../../Title/Title";
import "./home.css";
import RemoveIcon from "@mui/icons-material/Remove";

import { Bar, Line } from "react-chartjs-2";
import { Chart, registerables } from "chart.js";
Chart.register(...registerables);
export default function Estadisticas(props) {
  const { pacientes } = props;

  var edades = [0, 0, 0, 0, 0];

  const data = {
    labels: ["10 a 15", "15 a 20", "20 a 25", "25 a 45", ">45"],
    datasets: [
      {
        label: "Edades",
        backgroundColor: "#1AB394",
        borderColor: "black",
        borderWidth: 1,
        hoverBackgroundColor: "blue",
        hoverBorderColor: "gray",
        data: edades,
      },
    ],
  };

  const opciones = {
    maintainAspectRatio: false,
    responsive: true,
  };

  const data2 = {
    labels: meses(),
    datasets: [
      {
        label: "Nuevos clientes",
        fill: false,
        lineTension: 0.1,
        backgroundColor: "rgba(75,192,192,0.4)",
        borderColor: "rgba(75,192,192,1)",
        borderCapStyle: "butt",
        borderDash: [],
        borderDashOffset: 0.0,
        borderJoinStyle: "miter",
        pointBorderColor: "rgba(75,192,192,1)",
        pointBackgroundColor: "#fff",
        pointBorderWidth: 1,
        pointHoverRadius: 5,
        pointHoverBackgroundColor: "rgba(75,192,192,1)",
        pointHoverBorderColor: "rgba(220,220,220,1)",
        pointHoverBorderWidth: 2,
        pointRadius: 1,
        pointHitRadius: 10,
        data: pacientesName(),
      },
    ],
  };


  function pacientesName(){
    var paci = [];
    pacientes.forEach((paciente) => {
        paci.push(paciente.id);
    })
    return paci;
  }

    function meses(){
      var meses = [];
      for(var i = 0; i < pacientes.length;i++){
        let dateObj = new Date(pacientes[i].direccionPaciente.incorporacion);
        const monthNameShort = dateObj.toLocaleString("en-US", { month: "short" });
 meses.push(monthNameShort);
      }
      // meses.push("Jul")
      return meses;
    }


  function CargaEdades() {
    pacientes.forEach((paciente) => {
      let i = calcularEdad(paciente.fechaNacimiento);

      if (i <= 15) {
        edades[0] = edades[0] + 1;
      }

      if (i > 15 && i <= 20) {
        edades[1] = edades[1] + 1;
      }

      if (i > 20 && i <= 25) {
        edades[2] = edades[2] + 1;
      }
      if (i > 25 && i <= 45) {
        edades[3] = edades[3] + 1;
      }
      if (i > 45) {
        edades[4] = edades[4] + 1;
      }
    });
  }

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
    <>
      {CargaEdades()}
      <div className="informacion-general">
        <Title
          titulo="Informacion General"
          description="Consulta la actividad general"
        />
        <div className="widget-content">
          <ul className="stats">
            <li className="stat">
              <h2 className="value">
                {pacientes.length} de {pacientes.length}
              </h2>
              <div className="description">
                <div className="text">Clientes activos sobre el total</div>
                <div className="percentage">
                  {(pacientes.length / pacientes.length) * 100}%
                </div>
              </div>
            </li>
            <li className="stat">
              <h2 className="value">{pacientes.length}</h2>
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
      <div className="informacion-general edad">
        <Title
          titulo="Distribucion por edad"
          description="Distribucion de los clientes por edad"
        />
        <div className="chart-container">
          <Bar data={data} options={opciones} />
        </div>
      </div>

      <div className="informacion-general nuevo_c">
        <Title
          titulo="Nuevos clientes"
          description="Evolucion de los clientes"
        />
        <div className="chart-container">
          <Line data={data2} />
        </div>
      </div>
    </>
  );
}
