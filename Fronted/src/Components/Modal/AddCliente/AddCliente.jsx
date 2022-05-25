import React from "react";
import { useState } from "react";
import ExitToAppIcon from "@mui/icons-material/ExitToApp";
import "./addmodal.css";
import { Link } from "react-router-dom";
import { Person } from "@mui/icons-material";
import WcIcon from "@mui/icons-material/Wc";
import DateRangeIcon from "@mui/icons-material/DateRange";
import PublicIcon from "@mui/icons-material/Public";
import ContactPhoneIcon from "@mui/icons-material/ContactPhone";
import DomainIcon from '@mui/icons-material/Domain';
import AssignmentIndIcon from '@mui/icons-material/AssignmentInd';
import ApprovalIcon from '@mui/icons-material/Approval';
import ContactMailIcon from '@mui/icons-material/ContactMail';
function AddCliente() {
  const [modal] = useState(false);
  // const toggleModal = () => {
  //   setModal(!modal);
  // };

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
                  <div className="description">
                    Registra tu cliente y sigue programando la cita
                  </div>
                </div>
              </div>
              <form className="input-container">
                <div className="content-input">
                  <label htmlFor="">
                    <span>*</span> Nombre Completo
                  </label>
                  <div className="input name">
                    <i className="icono">
                      <Person />
                    </i>
                    <input type="text" />
                  </div>
                </div>

                <div className="content-side">
                  <div className="side-left">
                    <div className="content-input">
                      <label htmlFor="">
                        <span>*</span>Genero
                      </label>
                      <div className="input name">
                        <i className="icono">
                          <WcIcon />
                        </i>
                        <select
                          className="select"
                          name="patient[gender]"
                          aria-invalid="false"
                        >
                          <option value="0">Masculino</option>
                          <option value="1">Femenino</option>
                        </select>{" "}
                      </div>
                    </div>
                    <div className="content-input">
                      <label htmlFor="">
                        <span>*</span> Fecha de nacimiento
                      </label>
                      <div className="input name">
                        <i className="icono">
                          <DateRangeIcon />
                        </i>
                        <input type="date"></input>
                      </div>
                    </div>
                    <div className="content-input">
                      <label htmlFor="">
                        <span>*</span>Pais de residencia
                      </label>
                      <div className="input name">
                        <i className="icono">
                          <PublicIcon />
                        </i>
                        <input type="text" />
                      </div>
                    </div>
                    <div className="content-input">
                      <label htmlFor="">
                        <span>*</span>Telefono
                      </label>
                      <div className="input name">
                        <i className="icono">
                          <ContactPhoneIcon />
                        </i>
                        <input type="text" />
                      </div>
                    </div>
                  </div>

                  <div className="side-right">
                  <div className="content-input">
                      <label htmlFor="">
                        <span></span>Lugar de consulta
                      </label>
                      <div className="input name">
                        <i className="icono">
                          <DomainIcon />
                        </i>
                        <input type="text" />
                      </div>
                    </div>
                    <div className="content-input">
                      <label htmlFor="">
                        <span></span>Ocupacion
                      </label>
                      <div className="input name">
                        <i className="icono">
                          <AssignmentIndIcon />
                        </i>
                        <input type="text" />
                      </div>
                    </div>
                    <div className="content-input">
                      <label htmlFor="">
                        <span></span>Codigo Postal
                      </label>
                      <div className="input name">
                        <i className="icono">
                          <ApprovalIcon />
                        </i>
                        <input type="text" />
                      </div>
                    </div>
                    <div className="content-input">
                      <label htmlFor="">
                        <span></span>Correo
                      </label>
                      <div className="input name">
                        <i className="icono">
                          <ContactMailIcon  />
                        </i>
                        <input type="text" />
                      </div>
                    </div>
                  </div>
                </div>
              </form>
              <div className="footer">
                <Link to="/" ><button className="btn cancelar" >Cancelar</button></Link>
                <button className="btn guardar">Guardar</button>
              </div>
            </div>
          </div>
        </div>
      )}
    </>
  );
}

export default AddCliente;
