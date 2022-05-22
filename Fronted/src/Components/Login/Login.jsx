import React from "react";
import "./login.css";
import axios from "axios";
class Login extends React.Component {
  state = {
    form: {
      usuario: "",
      password: "",
    },
    error: false,
    errorMsg: "",
  };

  manejadorSubmit = (e) => {
    e.preventDefault();
  }

  manejadorChange = async (e) => {
    await this.setState({
      form: {
        ...this.state.form,
        [e.target.name]: e.target.value,
      },
    });
    // console.log(this.state.form);
  };

  handlerButton = ()=>{
    let url = "http://localhost:8080/usuario/getAll";
    axios.post(url,this.state.form)
    .then(response =>{
      console.log(response);
    })

  //  fetch(url)
  //  .then((res) => res.json())
  //  .then((result) => {
  //   this.setState({form: result});
  //  })

  //  console.log(this.state.form);
  }

  render() {
    return (
      <React.Fragment>
        <div className="wrapper">
          <form onSubmit={this.manejadorSubmit} className="form-signin">
            <h2 className="form-signin-heading">Please login</h2>
            <input
              type="text"
              className="form-control"
              name="usuario"
              placeholder="User"
              required=""
              autofocus=""
              onChange={this.manejadorChange}
            />
            <input
              type="password"
              className="form-control"
              name="password"
              placeholder="Password"
              required=""
              onChange={this.manejadorChange}
            />
            <label className="checkbox">
              <input type="checkbox" value="remember-me" name="rememberMe" />{" "}
              Remember me
            </label>
            <button class="cssbuttons-io-button" onClick={this.handlerButton}>
              {" "}
              Login
              <div class="icon">
                <svg
                  height="24"
                  width="24"
                  viewBox="0 0 24 24"
                  xmlns="http://www.w3.org/2000/svg"
                >
                  <path d="M0 0h24v24H0z" fill="none"></path>
                  <path
                    d="M16.172 11l-5.364-5.364 1.414-1.414L20 12l-7.778 7.778-1.414-1.414L16.172 13H4v-2z"
                    fill="currentColor"
                  ></path>
                </svg>
              </div>
            </button>
          </form>
        </div>
      </React.Fragment>
    );
  }
}

export default Login;
