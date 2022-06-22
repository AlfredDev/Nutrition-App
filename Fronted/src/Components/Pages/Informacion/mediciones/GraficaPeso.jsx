import { Line } from "react-chartjs-2";
import { Chart, registerables } from "chart.js";
import Title from "../../../Title/Title";
import React from "react";
import axios from "axios";

Chart.register(...registerables);

class GraficaPeso extends React.Component {
  // useEffect(() => {
  //   fetch(`http://localhost:8080/datoAntro/getDatoantro/${props.id}/datoAntro`)
  //   .then((res) => res.json())
  //   .then((result) => {
  //     setRegistros(result);
  //   });
  //   console.log(registros);
  // }, [props.id]);
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
          backgroundColor: "rgba(75,192,192,0.2)",
          borderColor: "rgba(75,192,192,1)",
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
      ],
    };
    return (
      <>
        <div className="form-section-consulta">
          <Title
            titulo="Historia Antropométrica"
            description="Consulta la Historia antropométrica del cliente"
          />
          <div className="chart-container-line">
            <Line data={data} />
          </div>
        </div>
        <div className="form-section-consulta"></div>
      </>
    );
  }
}

export default GraficaPeso;
