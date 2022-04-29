import React from "react";
import HomeIcon from "@mui/icons-material/Home";
import EventIcon from "@mui/icons-material/Event";
import GroupIcon from "@mui/icons-material/Group";
import RestaurantMenuIcon from "@mui/icons-material/RestaurantMenu";
import MenuIcon from "@mui/icons-material/Menu";
import { Link } from "react-router-dom";
import "./style.css";
import { useState } from "react";
import AlarmOnIcon from "@mui/icons-material/AlarmOn";
import GroupAddIcon from '@mui/icons-material/GroupAdd';
const Items = [
  {
    display: "Pagina Inicial",
    icon: HomeIcon,
    to: "/",
    section: "",
  },
  {
    display: "Agenda",
    icon: EventIcon,
    to: "/agenda",
    section: "",
  },
  {
    display: "Clientes",
    icon: GroupIcon,
    to: "/clientes",
    section: "",
  },
  {
    display: "Recetas",
    icon: RestaurantMenuIcon,
    to: "/recetas",
    section: "",
  },
  {
    display: "Programar Consulta",
    icon: AlarmOnIcon,
    to: "/appointments",
    section: "",
  },
  {
    display: "Agregar Cliente",
    icon: GroupAddIcon,
    to: "/",
    section: "",
  }
];

const SidebarEx = () => {
  const [active, setActive] = useState("sidebar");

  return (
    <div className={active}>
      <div class="logo_content">
        <div class="logo">
          <div class="logo_name"> Dashboard </div>
        </div>
        e
        <i
          class="bx"
          id="btn"
          onClick={() =>
            active === "sidebar"
              ? setActive("sidebar active")
              : setActive("sidebar")
          }
        >
          <MenuIcon />
        </i>
      </div>

      <ul className="nav_list">
        {Items.map((item, index) => (
          <li>
            <Link to={item.to} key={index}>
              <i className="bx">
                <item.icon />
              </i>
              <span className="links_name">{item.display}</span>
            </Link>
            <span className="tooltip">{item.display}</span>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default SidebarEx;
