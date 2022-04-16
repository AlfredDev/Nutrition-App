import "./header.css";
import { SiDeno } from "react-icons/si";
import { Language, NotificationsNone, Settings } from "@material-ui/icons";
import React from "react";

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
            <h1 className="logo">
              {" "}
              <SiDeno></SiDeno> Green <span>Life</span>
            </h1>
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
                <Language />
              </span>

              <span className="topIconBadge">2</span>
            </div>
            <div className="topbarIconContainer">
              <span className="icon">
                <Settings />
              </span>
            </div>
            <img
              src="http://ratingargentina.com/download/multimedia.normal.918abbe1af25a0de.6576612d656c6669652d653176372d313633303831333239383636342d616c6c5f6e6f726d616c2e77656270.webp"
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