import React from "react";
import { useState } from "react";
import ExitToAppIcon from '@mui/icons-material/ExitToApp';
import "./addmodal.css";
import { Link } from "react-router-dom";

function AddCliente() {
  const [modal, setModal] = useState(false);
  const toggleModal = () => {
    setModal(!modal);
  };

  return (
    <>
      {!modal && (
        <div className="modal">
          <div className="overlay">
            <div className="modal-content">
            <Link to="/" className="close-modal">
                <i><ExitToAppIcon/></i>
              </Link>
              <br/>
              <h2>Hello Model</h2>
              <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Culpa, fugit. Quae delectus aspernatur quibusdam, accusamus non tempora obcaecati necessitatibus ducimus magni natus deleniti dicta laborum ipsa, ea repudiandae, iste vitaesssssssssssss.</p>
             
            </div>
          </div>
        </div>
      )}
    </>
  );
}

export default AddCliente;
