import React from "react";
import "./home.css";
import AddIcon from "@mui/icons-material/Add";
import { Link } from "react-router-dom";
import Title from "../../Title/Title";
// import PersonIcon from '@mui/icons-material/Person';
import EventAvailableIcon from '@mui/icons-material/EventAvailable';
import { Person } from "@mui/icons-material";
import Estadisticas from "./Estadisticas";
function Home() {
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
                <div className="paciente-card">
                  <div className="foto">
                    <img
                      alt="Cliente ejemplo"
                      src="https://randomuser.me/api/portraits/women/82.jpg"
                    />
                  </div>
                  <div className="detalles">
                    <h3 className="name">Cliente de ejemplo</h3>
                    <i class="mdi">
                      <Person />
                    </i>
                    <div class="occupation">Profesión ejemplo</div>
                    <div class="infos">
                      <div class="info small">
                        <i class="icon-agenda"><EventAvailableIcon/> </i>
                        Última consulta  17 de mayo
                      </div>
                    </div>
                  </div>
                </div>
                <div className="paciente-card">
                  <div className="foto">
                    <img
                      alt="Cliente ejemplo"
                      src="https://randomuser.me/api/portraits/women/82.jpg"
                    />
                  </div>
                  <div className="detalles">
                    <h3 className="name">Cliente de ejemplo</h3>
                    <i class="mdi">
                      <Person />
                    </i>
                    <div class="occupation">Profesión ejemplo</div>
                    <div class="infos">
                      <div class="info small">
                        <i class="icon-agenda"><EventAvailableIcon/> </i>
                        Última consulta  17 de mayo
                      </div>
                    </div>
                  </div>
                </div>
                <div className="paciente-card">
                  <div className="foto">
                    <img
                      alt="Cliente ejemplo"
                      src="https://randomuser.me/api/portraits/women/82.jpg"
                    />
                  </div>
                  <div className="detalles">
                    <h3 className="name">Cliente de ejemplo</h3>
                    <i class="mdi">
                      <Person />
                    </i>
                    <div class="occupation">Profesión ejemplo</div>
                    <div class="infos">
                      <div class="info small">
                        <i class="icon-agenda"><EventAvailableIcon/> </i>
                        Última consulta  17 de mayo
                      </div>
                    </div>
                  </div>
                </div>
                
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

export default Home;
