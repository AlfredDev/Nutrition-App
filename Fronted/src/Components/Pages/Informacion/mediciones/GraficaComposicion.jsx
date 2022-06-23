import React from "react";
import Title from "../../../Title/Title";
import { Line } from "react-chartjs-2";
import { Chart, registerables } from "chart.js";
import axios from "axios";
Chart.register(...registerables);

class GraficaComposicion extends React.Component {
  state = {
    info: [],
  };

  componentDidMount() {
    this.getInfo();
  }

  getInfo = async () => {
    let res = await axios.get(
      `http://localhost:8080/Composicion/getComposicion/${this.props.id}/composicion`
    );
    let data = res.data;
    this.setState({
      info: data,
    });
    // console.log(this.state.info);
  };

  getalf() {
    var fecha = [];
    this.state.info.forEach((info) => {
      var fechas = new Date(info.fecha_registro);
      var options = {
        year: "numeric",
        month: "short",
        day: "numeric",
      };

      fecha.push(fechas.toLocaleDateString("es-ES", options));
    });
    return fecha;
  }


  getMasaGrasa() {
     var masa = [];
     this.state.info.forEach((info) => {
          masa.push(info.masaGrasa);
     });
     return masa;
   }

   getMasaMuscular() {
     var masa = [];
     this.state.info.forEach((info) => {
          masa.push(info.masaMuscular);
     });
     return masa;
   }

   getPorcentajeGrasa() {
     var masa = [];
     this.state.info.forEach((info) => {
          masa.push(info.porcentajeMasaGrasa);
     });
     return masa;
   }

   getPorcentajeMasaMuscular() {
     var masa = [];
     this.state.info.forEach((info) => {
          masa.push(info.porcentajeMasaMuscular);
     });
     return masa;
   }

  render() {
    const data = {
      labels: this.getalf(),
      datasets: [
        {
          label: "Masa Grasa",
          data: this.getMasaGrasa(),
          fill: true,
          backgroundColor: "rgba(150,167,37,0.2)",
          borderColor: "#FCD2A8",
        },
        {
          label: "Masa muscular",
          data: this.getMasaMuscular(),
          fill: false,
          borderColor: "#EC6778",
        },
        {
          label: "Porcentaje de masa grasa (%)",
          data: this.getPorcentajeGrasa(),
          fill: false,
          borderColor: "#007D75",
        },
        {
          label: "Porcentaje de masa muscular (%)",
          data: this.getPorcentajeMasaMuscular(),
          fill: false,
          borderColor: "#529A86",
        },
      ],
    };

    return (
      <>
        <div className="form-section-consulta stds">
          <Title
            titulo="Progreso"
            description="Consulta el progreso de tu cliente a lo largo del tiempo"
          />
          <div className="chart-container-line">
            <Line data={data} />
          </div>
        </div>
      </>
    );
  }
}

export default GraficaComposicion;
