import React from "react";
import "./title.css";

function Title(props) {
  return (
    <>
      <div className="modal-header">
        <div className="modal-title">
          <div className="title">{props.titulo}</div>
        </div>
        <div className="modal-description">
          <div class="description">
            {props.description}
          </div>
        </div>
      </div>
    </>
  );
}

export default Title;
