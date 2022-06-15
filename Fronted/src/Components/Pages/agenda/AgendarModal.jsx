import * as React from "react";
import Box from "@mui/material/Box";
import Typography from "@mui/material/Typography";
import Modal from "@mui/material/Modal";
import AddIcon from "@mui/icons-material/Add";
import { Person } from "@mui/icons-material";
import { useState, useEffect } from "react";
import ImagenMujer from "../home/ImagenMujer";
import ImagenHombre from "../home/ImagenHombre";
import FormAgenda from "./FormAgenda";
const style = {
  position: "absolute",
  top: "50%",
  left: "50%",
  transform: "translate(-50%, -50%)",
  width: 900,
  bgcolor: "background.paper",
  border: "2px solid #000",
  boxShadow: 24,
  p: 4,
};

export default function BasicModal() {
  const [open, setOpen] = React.useState(false);
  const handleOpen = () => setOpen(true);
  const handleClose = () => setOpen(false);
  const [active, setActive] = useState("FIRST");
  const [pacientes, setPacientes] = useState([]);
  const [busqueda, setBusqueda] = useState("");
  const [tablaUsuarios, setTablaUsuarios] = useState([]);
  const [modelo, setModelo] = useState([]);

  function Genero(gender) {
    if (gender === "Femenino") {
      return <ImagenMujer />;
    }
    return <ImagenHombre />;
  }

  const handleChange = (e) => {
    setBusqueda(e.target.value);
    filtrar(e.target.value);
  };

  const filtrar = (terminoBusqueda) => {
    // eslint-disable-next-line
    var resultadosBusqueda = tablaUsuarios.filter((elemento) => {
      if (
        elemento.nombre
          .toString()
          .toLowerCase()
          .includes(terminoBusqueda.toLowerCase()) ||
        elemento.ocupacion
          .toString()
          .toLowerCase()
          .includes(terminoBusqueda.toLowerCase())
      ) {
        return elemento;
      }
    });
    setPacientes(resultadosBusqueda);
  };

  useEffect(() => {
    fetch("http://localhost:8080/paciente/getAllPacientes")
      .then((res) => res.json())
      .then((result) => {
        setPacientes(result);
        setTablaUsuarios(result);
      });
  }, []);

  return (
    <div>
      <div className="add-btn" onClick={handleOpen}>
        <i>
          <AddIcon />
        </i>
      </div>
      <Modal
        open={open}
        onClose={handleClose}
        aria-labelledby="modal-modal-title"
        aria-describedby="modal-modal-description"
      >
        <Box sx={style}>
          <Typography id="modal-modal-title" variant="h6" component="h1">
            Programar nueva consulta
          </Typography>
          <div className="description">Seleccionar al paciente</div>
          <div className="btn-section">
            <button onClick={() => setActive("FIRST")}>
              1. Selecciona el cliente
            </button>
            <button onClick={() => setActive("SECOND")}>
              2. Confirma los datos de la consulta
            </button>
          </div>

          {active === "FIRST" ? (
            <div>
              <form action="">
                <div className="form-buscar">
                  <input
                    className="form-control"
                    type="text"
                    value={busqueda}
                    onChange={handleChange}
                    placeholder="Buscar paciente por nombre o ocupacion"
                  />
                </div>
              </form>

              <div className="search-result pacientes">
                <div className="container-pacientes scroll">
                  {pacientes.map((paciente) => (
                    <div
                      className="paciente-card"
                      key={paciente.id}
                      onClick={() => setModelo(paciente)}
                    >
                      <div className="foto"> {Genero(paciente.genero)}</div>
                      <div className="detalles">
                        <h3 className="name">{paciente.nombre}</h3>
                        <i className="mdi">
                          <Person />
                        </i>
                        <div className="occupation">{paciente.ocupacion}</div>
                      </div>
                    </div>
                  ))}
                </div>
              </div>
              <br />
            </div>
          ) : active === "SECOND" ? (
            <div>
              <FormAgenda
                modelo={modelo} 
              />
            </div>
          ) : null}

          <button className="btn cancelar" onClick={handleClose}>
            Cancelar
          </button>
        </Box>
      </Modal>
    </div>
  );
}
