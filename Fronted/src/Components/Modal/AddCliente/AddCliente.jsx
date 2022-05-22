import React from "react";
import { useState } from "react";
import ExitToAppIcon from "@mui/icons-material/ExitToApp";
import "./addmodal.css";
import { Link } from "react-router-dom";

function AddCliente() {
  const [modal, setModal] = useState(false);
  const toggleModal = () => {
    setModal(!modal);
  };

  return (
    <>
      {!modal && (
        <div className="modal">
          <div className="overlay">
            <div className="modal-content">
              <div className="modal-header">
                <Link to="/" className="close-modal">
                  <i>
                    {" "}
                    <ExitToAppIcon />{" "}
                  </i>
                </Link>
                <div className="modal-title">
                  <div className="title">Registrar el cliente</div>
                </div>
                <div className="modal-description">
                  <div class="description">
                    Registra tu cliente y sigue programando la cita
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      )}
    </>
  );
}

export default AddCliente;
