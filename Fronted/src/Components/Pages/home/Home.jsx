import React, { useEffect, useState } from "react";
import "./home.css";
import AddIcon from "@mui/icons-material/Add";
import { Link } from "react-router-dom";
import Title from "../../Title/Title";
// import PersonIcon from '@mui/icons-material/Person';
import EventAvailableIcon from '@mui/icons-material/EventAvailable';
import { Person } from "@mui/icons-material";
import Estadisticas from "./Estadisticas";
import ImagenMujer from "./ImagenMujer";
import ImagenHombre from "./ImagenHombre";

export default function Home() {

  const [pacientes, setPacientes] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/paciente/getAllPacientes")
      .then((res) => res.json())
      .then((result) => {
        setPacientes(result);
      });
  }, []);

  function Genero(gender){
      if(gender === "Femenino"){
        return <ImagenMujer/>;
      }
      return <ImagenHombre/>;
  }

  return (
    <div className="home">
      <div className="content">
        <div className="user-panel">
          <div className="user-content">
            <div className="modal-header">
              <Link to="/addmodal" className="close-modal">
                <i>
                  {" "}
                  <AddIcon />{" "}
                </i>
              </Link>
              <Title
                titulo="Tus Clientes"
                description="Consulta información sobre tus clientes"
              />
            </div>
            <form action="">
              <div className="form-buscar">
                <input
                  className="form-control"
                  type="text"
                  placeholder="Buscar paciente por nombre"
                />
              </div>
            </form>
            <div className="search-result pacientes">
              <div className="container-pacientes">

                {pacientes.map((paciente) =>(
                   <div className="paciente-card" key={paciente.id}>
                   <div className="foto">
                     {Genero(paciente.genero)}
                   </div>
                   <div className="detalles">
                     <h3 className="name">{paciente.nombre}</h3>
                     <i className="mdi">
                       <Person />
                     </i>
                     <div className="occupation">{paciente.ocupacion}</div>
                     <div className="infos">
                       <div className="info small">
                         <i className="icon-agenda"><EventAvailableIcon/> </i>
                         Última consulta  17 de mayo
                       </div>
                     </div>
                   </div>
                 </div>
                ))}             
              </div>
            </div>
          </div>
        </div>
        <div className="estadisticas">
            <Estadisticas/>
        </div>
      </div>
    </div>
  );
}

