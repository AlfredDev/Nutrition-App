import React from "react";
import "./sidebar.css";
import { FaSpa } from "react-icons/fa";
import HomeIcon from "@mui/icons-material/Home";
import EventIcon from "@mui/icons-material/Event";
import GroupIcon from "@mui/icons-material/Group";
import RestaurantMenuIcon from "@mui/icons-material/RestaurantMenu";
import AlarmOnIcon from "@mui/icons-material/AlarmOn";
import PersonAddIcon from "@mui/icons-material/PersonAdd";
import { Link } from "react-router-dom";

function Sidebar() {
  return (
    <div className="sidebar">
      <div className="apple">
        <FaSpa></FaSpa>
      </div>

      <div className="sidebarWrapper">
        <div className="sidebarMenu">
          <ul className="sidebarList">
            <Link to="/" style={{ textDecoration: "none" }}>
              <li className="sidebarListItem active">
                <span className="icon-side">
                  <HomeIcon />
                </span>
                Pagina Inicial
              </li>
            </Link>
            <Link to="/agenda" style={{ textDecoration: "none" }}>
              <li className="sidebarListItem">
                <span className="icon-side">
                  <EventIcon />
                </span>
                Agenda
              </li>
            </Link>
            <Link to="/clientes" style={{ textDecoration: "none" }}>
              <li className="sidebarListItem">
                <span className="icon-side">
                  <GroupIcon />
                </span>
                Clientes
              </li>
            </Link>
            <Link to="/recetas" style={{ textDecoration: "none" }}>
              <li className="sidebarListItem">
                <span className="icon-side">
                  <RestaurantMenuIcon />
                </span>
                Recetas
              </li>
            </Link>
            <Link to="/appointments" style={{ textDecoration: "none" }}>
              <li className="sidebarListItem">
                <span className="icon-side">
                  <AlarmOnIcon />
                </span>
                Programar Consulta
              </li>
            </Link>

            <li className="sidebarListItem">
              <span className="icon-side">
                <PersonAddIcon />
              </span>
              Registrar Cliente
            </li>
          </ul>
        </div>
      </div>
    </div>
  );
}

export default Sidebar;
