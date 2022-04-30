import React, { useState } from 'react';
import '../App.css';

const FormTodo = props => {
    const [description, setDescription] = useState("");
    const { handleAddItem } = props; //(C-1)

    const handleSubmit = e => {
        e.preventDefault();
        console.log(description);

        handleAddItem({
            done:false,
            id:(+new Date()).toString(),
            description
        });

        setDescription("");
    }

  return(
  <form onSubmit={handleSubmit}>
      <div className="todo-list">
          <div className="file-input">
              <input type="text"
                className="text"
                value={description}
                onChange={e => setDescription(e.target.value)}
                />
                <button
                className="btn pink"
                disabled={description ? "" : "disabled"}
                >Add</button>
          </div>
      </div>
  </form>
  );
}

export default FormTodo;
