import { Line } from "react-chartjs-2";
import { Chart, registerables } from "chart.js";
import Title from "../../../Title/Title";
import React from "react";
import axios from "axios";
import Box from "@mui/material/Box";
import Skeleton from "@mui/material/Skeleton";
import Alert from '@mui/material/Alert';

Chart.register(...registerables);

class GraficaPeso extends React.Component {

  state = {
    info: [],
  };

  componentDidMount() {
    this.getInfo();
  }

  

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

  getPeso() {
    var peso = [];
    this.state.info.forEach((info) => {
      peso.push(info.peso);
    });
    return peso;
  }
  getAbdomianl() {
    var pliege = [];
    this.state.info.forEach((info) => {
      pliege.push(info.perimetroCutaneoAbdominal);
    });
    return pliege;
  }

  getPerimetroCadera() {
    var cadera = [];
    this.state.info.forEach((info) => {
      cadera.push(info.perimetroCadera);
    });
    return cadera;
  }

  getPerimetroCintura() {
    var cadera = [];
    this.state.info.forEach((info) => {
      cadera.push(info.perimetroCintura);
    });
    return cadera;
  }

  getInfo = async () => {
    let res = await axios.get(
      `http://localhost:8080/datoAntro/getDatoantro/${this.props.id}/datoAntro`
    );
    let data = res.data;
    this.setState({
      info: data,
    });
    // console.log(this.state.info);
  };

  

  render() {
   

    const data = {
      labels: this.getalf(),
      datasets: [
        {
          label: "Peso (KG)",
          data: this.getPeso(),
          fill: true,
          backgroundColor: "rgba(75,192,192,0.3)",
          borderColor: "#1AB394",
        },
        {
          label: "Perimetro de cadera",
          data: this.getPerimetroCadera(),
          fill: false,
          borderColor: "#742774",
        },
        {
          label: "Perimetro de Cintura",
          data: this.getPerimetroCintura(),
          fill: false,
          borderColor: "yellow",
        },
        {
          label: "Pliegue cutaneo abdominal",
          data: this.getAbdomianl(),
          fill: false,
          borderColor: "pink",
        },
      ],
    };
    return (
      <>
        <div className="form-section-consulta">
          <Title
            titulo="Progreso"
            description="Consulta el progreso de tu cliente a lo largo del tiempo"
          />
          <div className="chart-container-line">
            <Line data={data} />
          </div>
        </div>
        <div className="form-section-consulta">
        <Alert severity="info">En desarrollo</Alert>

          <Box sx={{ width: 800, height: 130 }}>
            <Skeleton />
            <Skeleton animation="wave" />
            <Skeleton animation={false} />
          </Box>
        </div>
      </>
    );
  }
}

export default GraficaPeso;
