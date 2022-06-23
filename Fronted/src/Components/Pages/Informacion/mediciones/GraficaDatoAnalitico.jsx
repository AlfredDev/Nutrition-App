import React from "react";
import Title from "../../../Title/Title";
import axios from "axios";
import { Line } from "react-chartjs-2";
import { Chart, registerables } from "chart.js";
Chart.register(...registerables);
class GraficaDatoAnalitico extends React.Component {
  state = {
    info: [],
  };

  componentDidMount() {
    this.getInfo();
  }
  getInfo = async () => {
    let res = await axios.get(
      `http://localhost:8080/datoAnalitico/getDatoAnalitico/${this.props.id}/datoAnalitico`
    );
    let data = res.data;
    this.setState({
      info: data,
    });
    //console.log(this.state.info);
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

   getColesterolHDL() {
     var colesterol = [];
     this.state.info.forEach((info) => {
          colesterol.push(info.hdlcolesterol);
     });
     return colesterol;
   }

   getColesterolLDL() {
     var colesterol = [];
     this.state.info.forEach((info) => {
          colesterol.push(info.ldlcolesterol);
     });
     return colesterol;
   }

   getColesterolTotal() {
     var colesterol = [];
     this.state.info.forEach((info) => {
          colesterol.push(info.colesterolTotal);
     });
     return colesterol;
   }

   getColesterolPresionDiastolica() {
     var colesterol = [];
     this.state.info.forEach((info) => {
          colesterol.push(info.presionDiastolica);
     });
     return colesterol;
   }

   getColesterTrigliceridos() {
     var colesterol = [];
     this.state.info.forEach((info) => {
          colesterol.push(info.trigliceridos);
     });
     return colesterol;
   }


  render() {
    const data = {
      labels: this.getalf(),
      datasets: [
        {
          label: "Colesterol HDL",
          data: this.getColesterolHDL(),
          fill: false,
          backgroundColor: "rgba(75,192,192,0.2)",
          borderColor: "rgba(75,192,192,1)",
        },
        {
          label: "Colesterol LDL",
          data: this.getColesterolLDL(),
          fill: false,
          borderColor: "#742774",
        },
        {
          label: "Colesterol total",
          data: this.getColesterolTotal(),
          fill: false,
          borderColor: "#C85E41",
        },
        {
          label: "Presion arterial diastolica",
          data: this.getColesterolPresionDiastolica(),
          fill: false,
          borderColor: "#698837",
        },
        {
          label: "Trigliceridos",
          data: this.getColesterTrigliceridos(),
          fill: false,
          borderColor: "#092F34",
        },
      ],
    };

    return (
      <>
        <div className="form-section-consulta std">
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

export default GraficaDatoAnalitico;
