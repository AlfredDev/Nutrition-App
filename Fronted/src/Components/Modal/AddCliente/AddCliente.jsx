import React from "react";
// import { useState } from "react";
import ExitToAppIcon from "@mui/icons-material/ExitToApp";
import "./addmodal.css";
import { Link } from "react-router-dom";
import { Person } from "@mui/icons-material";
import WcIcon from "@mui/icons-material/Wc";
import DateRangeIcon from "@mui/icons-material/DateRange";
import PublicIcon from "@mui/icons-material/Public";
import ContactPhoneIcon from "@mui/icons-material/ContactPhone";
import DomainIcon from "@mui/icons-material/Domain";
import AssignmentIndIcon from "@mui/icons-material/AssignmentInd";
import ApprovalIcon from "@mui/icons-material/Approval";
import ContactMailIcon from "@mui/icons-material/ContactMail";
import axios from "axios";

class AddCliente extends React.Component {
  // const [modal] = useState(false);
  // const toggleModal = () => {
  //   setModal(!modal);
  // };

  state = {
    form: {
      nombre: "",
      genero: "",
      lugarConsulta: "",
      fechaNacimiento: "",
      ocupacion: "",
      paisResidencia: "",
      codigoPostal: "",
      telefono: "",
      correo: "",
    },
    errors: {},
    modal: false,
  };

  manejadorSubmit = (e) => {
    e.preventDefault();
  };

  validation() {
    let valid = true;

    if (this.state.form.nombre === "") {
      valid = false;
    }

    if (this.state.form.fechaNacimiento === "") {
      valid = false;
    }

    if (this.state.form.paisResidencia === "") {
      valid = false;
    }

    if (this.state.form.telefono === "") {
      valid = false;
    }

    return valid;
  }

  cancelCourse() { document.getElementById("form").reset(); }


  handlerButton = () => {
    if (this.validation()) {
      let url = "http://localhost:8080/paciente/addPaciente";
      axios.post(url, this.state.form).then((response) => {
        console.log(response);
      });
      alert("Paciente Agregado");
      this.cancelCourse();
    } else {
      alert("Campo Obligatorio");
    }
  };

  manejadorChange = async (e) => {
    await this.setState({
      form: {
        ...this.state.form,
        [e.target.name]: e.target.value,
      },
    });
    console.log(this.state.form);
  };

  render() {
    return (
      <>
        {!this.modal && (
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
                <form
                  className="input-container"
                  onSubmit={this.manejadorSubmit}
                  id="form"
                >
                  <div className="content-input">
                    <label htmlFor="">
                      <span>*</span> Nombre Completo
                    </label>
                    <div className="input name">
                      <i className="icono">
                        <Person />
                      </i>
                      <input
                        type="text"
                        onChange={this.manejadorChange}
                        name="nombre"
                      />
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
                            name="genero"
                            aria-invalid="false"
                            onChange={this.manejadorChange}
                          >
                            <optgroup label="Genero">
                              <option value="Masculino" defaultValue={"Maculino"}>
                                Masculino
                              </option>
                              <option value="Femenino">Femenino</option>
                            </optgroup>
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
                          <input
                            type="date"
                            onChange={this.manejadorChange}
                            name="fechaNacimiento"
                          ></input>
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
                          <input
                            type="text"
                            required
                            onChange={this.manejadorChange}
                            name="paisResidencia"
                          />
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
                          <input
                            type="text"
                            onChange={this.manejadorChange}
                            name="telefono"
                          />
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
                          <input
                            type="text"
                            onChange={this.manejadorChange}
                            name="lugarConsulta"
                          />
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
                          <input
                            type="text"
                            onChange={this.manejadorChange}
                            name="ocupacion"
                          />
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
                          <input
                            type="text"
                            onChange={this.manejadorChange}
                            name="codigoPostal"
                          />
                        </div>
                      </div>
                      <div className="content-input">
                        <label htmlFor="">
                          <span></span>Correo
                        </label>
                        <div className="input name">
                          <i className="icono">
                            <ContactMailIcon />
                          </i>
                          <input
                            type="text"
                            onChange={this.manejadorChange}
                            name="correo"
                          />
                        </div>
                      </div>
                    </div>
                  </div>
                </form>
                <div className="footer">
                  <Link to="/">
                    <button className="btn cancelar">Cancelar</button>
                  </Link>
                  <button
                    type="submit"
                    className="btn guardar"
                    onClick={this.handlerButton}
                  >
                    Guardar
                  </button>
                </div>
              </div>
            </div>
          </div>
        )}
      </>
    );
  }
}

export default AddCliente;
