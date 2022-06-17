import React from "react";
import EmojiEmotionsIcon from "@mui/icons-material/EmojiEmotions";
import SquareFootIcon from "@mui/icons-material/SquareFoot";
import GrassIcon from '@mui/icons-material/Grass';
import RestaurantIcon from '@mui/icons-material/Restaurant';
import TipsAndUpdatesIcon from '@mui/icons-material/TipsAndUpdates';
import AnalyticsIcon from '@mui/icons-material/Analytics';
import { Link } from "react-router-dom";
export default function BarExpediente(props) {
  const Items = [
    {
      display: "1. Informaciones",
      description: "Habitos e informaciones",
      icon: EmojiEmotionsIcon,
      to: `/informacion/${props.id}`,
      active: true,
    },
    {
      display: "2. Mediciones",
      description: "Mediciones y  progreso del cliente",
      icon: SquareFootIcon,
      to: `/mediciones/${props.id}`,
      section: "",
    },
    {
     display: "3. Planificacion",
     description: "Planificacion del plan alimenticio",
     icon: GrassIcon,
     to: "/mediciones/:id",
     section: "",
   },
   {
     display: "4. Plan alimenticio",
     description: "Definicion de las comidas",
     icon: RestaurantIcon,
     to: "/mediciones/:id",
     section: "",
   },
   {
     display: "5. Recomendacion",
     description: "Ejercicios, agua ,etc",
     icon: TipsAndUpdatesIcon,
     to: "/mediciones/:id",
     section: "",
   },
   {
     display: "6. Analisis",
     description: "Analisis en relacion al plan",
     icon: AnalyticsIcon,
     to: "/mediciones/:id",
     section: "",
   },
  ];

  return (
    <div>
      <div className="steps">
        {Items.map((intem, index) => (
          <Link key={index} to={intem.to}>
          <div className="opciones">
            <div className="content">
              <div className="resume">
                <div className="title">{intem.display}</div>
                <div className="description">{intem.description}</div>
              </div>
              <div className="icon">
                <intem.icon />
              </div>
            </div>
          </div>
          </Link>
        ))}
      </div>
    </div>
  );
}
