import React, { useState } from "react";
import AddAlarmIcon from "@mui/icons-material/AddAlarm";
import AddAlertIcon from "@mui/icons-material/AddAlert";
import AddLocationAltIcon from "@mui/icons-material/AddLocationAlt";
import { Person } from "@mui/icons-material";
import ImagenMujer from "../home/ImagenMujer";
import ImagenHombre from "../home/ImagenHombre";
import VideocamIcon from "@mui/icons-material/Videocam";
// import axios from "axios";

function FormAgenda(props) {
  const [inicio_consulta, setInicio_consulta] = useState("");
  const [fin_consulta, setfin_consulta] = useState("");
  const [estatus, setEstatus] = useState("");
  const [lugarConsulta, setLugar] = useState("");
  const [liga_video, setLiga] = useState("");
  const [idPacient,setIdpacient] = useState();

const {modelo} = props;

  //  function getDate(){
  //      var today = new Date();
  //      var dd = String(today.getDate()).padStart(2, '0');
  //      var mm = String(today.getMonth() + 1).padStart(2, '0'); //January is 0!
  //      var yyyy = today.getFullYear();

  //      today = mm + '/' + dd + '/' + yyyy;
  //      console.log(today);
  //      return today;
  //  }

function getId(){
  setIdpacient(modelo.id);
}

  function Genero(gender) {
    if (gender === "Femenino") {
      return <ImagenMujer />;
    }
    return <ImagenHombre />;
  }

  const handleClick = (e) => {
    e.preventDefault();
    // alert(getId())
   getId();


    const consulta = {
      inicio_consulta,
      fin_consulta,
      estatus,
      lugarConsulta,
      liga_video,
      idPacient
    };

        console.log(consulta);


    fetch("http://localhost:8080/consulta/addConsulta",{
      method: "POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(consulta)
    }).then(() => {
      alert("Student added successfully")
    })
  };

  return (
    <div>
      <form action="">
        <div className="content-side">
          <div className="side-left">
            <div className="content-input">
              <label htmlFor="">
                <span></span>Inicio de consulta
              </label>
              <div className="input name">
                <i className="icono">
                  <AddAlarmIcon />
                </i>
                <input
                  type="datetime-local"
                  value={inicio_consulta}
                  onChange={(e) => setInicio_consulta(e.target.value)}
                />
              </div>
            </div>
            <div className="content-input">
              <label htmlFor="">
                <span></span>Estado de la consulta
              </label>
              <div className="input name">
                <i className="icono">
                  <AddAlertIcon />
                </i>
                <select
                  className="select"
                  name=""
                  aria-invalid="false"
                  onChange={(e) => setEstatus(e.target.value)}
                >
                  <optgroup label="Estatus">
                  <option value="sin confirmar">No confirmada</option>

                    <option value="confirmada" defaultValue={"Confirmada"}>
                      Confirmada
                    </option>
                  </optgroup>
                </select>{" "}
              </div>
            </div>

            <div className="content-input">
              <div className="card">
                <div className="foto">{Genero(modelo.genero)}</div>
                <div className="detalles">
                  <h3 className="name">{modelo.nombre}</h3>
                  <i className="mdi">
                    <Person />
                  </i>
                  <div className="occupation">{modelo.ocupacion}</div>
                </div>
              </div>
            </div>
          </div>
          <div className="side-right">
            <div className="content-input">
              <label htmlFor="">
                <span></span>Fin de consulta
              </label>
              <div className="input name">
                <i className="icono">
                  <AddAlarmIcon />
                </i>
                <input
                  type="datetime-local"
                  value={fin_consulta}
                  onChange={(e) => setfin_consulta(e.target.value)}
                />
              </div>
            </div>

            <div className="content-input">
              <label htmlFor="">
                <span></span>Lugar de la consulta
              </label>
              <div className="input name">
                <i className="icono">
                  <AddLocationAltIcon />
                </i>
                <input
                  type="text"
                  value={lugarConsulta}
                  onChange={(e) => setLugar(e.target.value)}
                />
              </div>
            </div>
            <div className="content-input">
              <label htmlFor="">
                <span></span>Videoconerencia (link)
              </label>
              <div className="input name">
                <i className="icono">
                  <VideocamIcon />
                </i>
                <input
                  type="text"
                  value={liga_video}
                  onChange={(e) => setLiga(e.target.value)}
                />
              </div>
            </div>
            <div className="btn-section">
              <button className="save" onClick={handleClick}>
                {" "}
                Guardar
              </button>
            </div>
          </div>
        </div>
      </form>
      <br />
    </div>
  );
}

export default FormAgenda;
