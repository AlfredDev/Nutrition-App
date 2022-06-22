import "./header.css";
import { SiDeno } from "react-icons/si";
import {  NotificationsNone, Settings } from "@material-ui/icons";
import React from "react";
import { Link } from "react-router-dom";

class Header extends React.Component{

  constructor(props) {
    super(props);
    this.state = {
        date: new Date()
    };
}



componentWillUnmount() {
  clearInterval(this.timerID);
}

tick() {
  this.setState({date: new Date()});
}

getHours() {
  return this.state.date.getHours();
}
getMinutes() {
  return this.state.date.getMinutes();
}

getSeconds() {
  return this.state.date.getSeconds();
}


componentDidMount() {

 this.timerID = setInterval(() => this.tick(), 1000);
}
  render() {
    return (
      <div className="topbar">
        <div className="topbarWrapper">
          <div className="topLeft">
          <Link to="/" style={{textDecoration:'none'}}>

            <h1 className="logo">
              {" "}      

              <SiDeno></SiDeno> Green <span>Life</span>
            </h1>
            </Link>

          </div>

          <div className="topCenter">
            <span> 
              {new Date().toDateString()} {",  "}
              {this.getHours() + ":"}
              {this.getMinutes() + ":"}
              {this.getSeconds() + " "}
              {this.getHours() >= 12 ? "PM":"AM"}
            </span>
          </div>

          <div className="topRight">
            <div className="topbarIconContainer">
              <span className="icon">
                <NotificationsNone />
              </span>
              <span className="topIconBadge">2</span>
            </div>
          
            <div className="topbarIconContainer">
              <span className="icon">
                <Settings />
              </span>
            </div>
            <img
              src="https://es.web.img3.acsta.net/pictures/17/06/14/13/48/489688.jpg"
              alt=""
              className="topAvatar"
            />
          </div>
        </div>
      </div>
    );
  }
}

export default Header