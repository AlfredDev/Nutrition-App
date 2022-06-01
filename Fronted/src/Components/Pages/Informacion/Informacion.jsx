import React, { useEffect, useState } from "react";
import { useParams } from "react-router-dom";

export default function Informacion() {
  const { id } = useParams();
  const [paciente, setPaciente] = useState([]);

  useEffect(() => {
    fetch(`http://localhost:8080/paciente/findById/${id}`)
      .then((res) => res.json())
      .then((result) => {
        setPaciente(result);
      });
  }, [id]);

  return (
    <div>
      Cliente id: {id}
      <h2> {paciente.nombre}</h2>
    </div>
  );
}