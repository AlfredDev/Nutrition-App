import React from "react";
import Title from "../../Title/Title";
import TextField from "@mui/material/TextField";
import axios from "axios";

class Observaciones extends React.Component {
     // eslint-disable-next-line
  constructor(props) {
    super(props);
  }

  state = {
    info: [],
    form: {
     observaciones: "",
    },
  };

  componentDidMount() {
    this.getInfo();
  }

  getInfo = async () => {
    let res = await axios.get(
      `http://localhost:8080/expediente/observaciongetByid/${this.props.id}`
    );
    let data = res.data;
    //console.log(data);
    this.setState({
      info: data,
      form: data, //Se establece para mostrar un valor por defecto al textField
    });
    // console.log(this.state.form);
  };

  manejadorChange = async (e) => {
     await this.setState({
       form: {
         ...this.state.form,
         [e.target.name]: e.target.value,
       },
     });
     // console.log(this.state.form);
     this.updateNote(); // Hace un metodo put cada vez que se telcea en el input
   };
 
   updateNote = async () => {
     const res = await fetch(`http://localhost:8080/expediente/editObservacion/${this.state.info.id}`, {
       method: "put",
       headers: {
         "Content-Type": "application/json",
         "x-access-token": "token-value",
       },
       body: JSON.stringify(this.state.form),
     });
     if (!res.ok) {
       const message = `An error has occured: ${res.status} - ${res.statusText}`;
       throw new Error(message);
     }
   };
 
   manejadorSubmit = (e) => {
     e.preventDefault();
   };
 

  render() {
    return (
      <>
        <div className="form-section-consulta">
          <Title
            titulo="Observaciones"
            description="Otras informaciones relevantes del cliente
                  "
          />
          <form onSubmit={this.manejadorSubmit}>
            <TextField
              id="outlined-multiline-flexible"
              label="Obervaciones"
              multiline
              maxRows={5}
              name="observaciones"
              onChange={this.manejadorChange}
              value={this.state.form.observaciones}
            />
          </form>
        </div>
      </>
    );
  }
}

export default Observaciones;
