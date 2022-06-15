import AnimatedPage from "../../AnimationPage";
import "./recetas.css";
import React, { useEffect, useState } from "react";
import Title from "../../Title/Title";



function Recetas() {
  const [busqueda, setBusqueda] = useState("pollo");
  const [recetas, setRecetas] = useState([]);

  const handleChange = (e) => {
    setBusqueda(e.target.value);

    if (e.target.value.length === 0) {
      setBusqueda("pollo")
    }
  };

  useEffect(() => {
    fetch(
      `https://api.edamam.com/api/food-database/parser?app_id=4cbd4739&app_key=7b85161ff5adf4be906d65bacbf33396&ingr=${busqueda}`
    )
      .then((res) => res.json())
      .then((result) => {
        setRecetas(result.hints);
      });
  }, [busqueda]);

  return (
    <AnimatedPage>
      <div className="recetas">
        <div className="con-agenda">
          <Title
            titulo="Base de datos de alimentos +700k"
            description="Consulta nutrientes de alimentos"
          ></Title>
        </div>

        <div className="alimentos-container">
          <form action="">
            <div className="form-buscar">
              <input
                className="form-control"
                type="text"
                onChange={handleChange}
                placeholder="Buscar alimento por nombre"
              />
            </div>
          </form>

          <div className="recipes">
            {recetas.map((receta) => (
              <div className="recipe-card" key={receta.food.foodId}>
              <div className="card-header">
                <h3> {receta.food.label} </h3>
                <h4 >  <span translate="yes">{receta.food.category} </span></h4>
              </div>
              <div className="card-body">
                {
                <ul>
                  <li>
                    <b>Calorias: </b>
                    <span >{receta.food.nutrients.ENERC_KCAL} Kcal</span>
                  </li>
                  <li>
                    <b>Carbohidratos: </b>
                    <span>{receta.food.nutrients.CHOCDF}g</span>
                  </li>
                  <li>
                    <b>Proteina: </b>
                    <span>{receta.food.nutrients.PROCNT}g</span>
                  </li>
                  <li>
                    <b>Grasa: </b>
                    <span>{receta.food.nutrients.FAT}g</span>
                  </li>
                  <li>
                    <b>Fibra: </b>
                    <span>{receta.food.nutrients.FIBTG}g</span>
                  </li>
                </ul>
}
              </div>
              <div className="card-footer">
                <b>Marca: </b>
                <span>{receta.food.brand}</span>
              </div>
              </div>
            ))}
          </div>
        </div>
      </div>
    </AnimatedPage>
  );
}

export default Recetas;
