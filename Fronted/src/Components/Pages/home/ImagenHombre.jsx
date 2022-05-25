import React from "react";

function ImagenHombre() {
  function rnd() {
    return Math.floor(Math.random() * 50);
  }

  return (
    <>
      <img
        alt="Cliente ejemplo"
        src={"https://randomuser.me/api/portraits/men/" + rnd() + ".jpg"}
      />
    </>
  );
}

export default ImagenHombre;
