import React from "react";
import "./home.css";
import AddIcon from "@mui/icons-material/Add";
import { Link } from "react-router-dom";
import Title from "../../Title/Title";

function Home() {
  return (
    <div className="home">
      <div className="content">
        <div className="user-panel">
          <div className="user-content">
            <div className="modal-header">
              <Link to="/" className="close-modal">
                <i>
                  {" "}
                  <AddIcon />{" "}
                </i>
              </Link>
              <Title titulo="Tus Clientes" description="Consulta información sobre tus clientes"/>
            </div>
          </div>
        </div>
        <div className="estadisticas"></div>
      </div>
    </div>
  );
}

export default Home;
