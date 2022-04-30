import React, { useEffect } from "react";
import CheckBox from './CheckBox'
import '../App.css';

const TaskList = props => {

    const {list,setList} = props;
    
    const onChangeStatus = e => {
        const {name,checked} = e.target;
        const updateList = list.map(item =>({
            ...item,
            done: item.id === name ? checked: item.done
        }));

        

        setList(updateList);
    };
    
    useEffect(() => {
        fetch("http://localhost:8080/todo/getAll")
          .then((res) => res.json())
          .then((result) => {
            setList(result);
          });
      }, []);
    

    const onClickRemoveItem = e => {
        const updateList = list.filter(item => !item.done);
        setList(updateList);
      };

    const chk = list.map(item => (
     <CheckBox key={item.id} data={item} onChange={onChangeStatus} />
    ));

  return (
    <div className="todo-list">
        {list.length ? chk : "No Tasks"}
        {list.length ? (
            <p>
                <button className="btn blue" onClick={onClickRemoveItem}>
                    Delete All Done
                </button>
            </p>
        ):null}
    </div>
  )
}

export default TaskList