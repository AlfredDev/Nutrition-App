import Title from "../../Title/Title";
import "./agenda.css";
import format from "date-fns/format";
import getDay from "date-fns/getDay";
import parse from "date-fns/parse";
import startOfWeek from "date-fns/startOfWeek";
import React, { useEffect, useState } from "react";
import { Calendar, dateFnsLocalizer } from "react-big-calendar";
import "react-big-calendar/lib/css/react-big-calendar.css";
// import DatePicker from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";
import BasicModal from "./AgendarModal";
import AnimatedPage from "../../AnimationPage";

const locales = {
  "es-US": require("date-fns/locale/en-US"),
};
const localizer = dateFnsLocalizer({
  format,
  parse,
  startOfWeek,
  getDay,
  locales,
});




// const events = [
//   {
//       title: "Big Meeting",
//       start: new Date(2022, 6, 6),
//       end: new Date(2022, 6, 5),
//   },
//   {
//       title: "Vacation",
//       start: new Date("2022-06-21T14:19:35.926Z"),
//       end:new Date("2022-06-21T14:20:35.926Z"),
//   },
//   {
//       title: "Conference",
//       start: new Date("2022-06-21T11:19:35.926Z"),
//       end:new Date("2022-06-21T12:20:35.926Z"),
//   },
// ];


function Agenda() {

  const [consultas,setConsultas] = useState([]);


  function enventos () {
    var events = [];
    consultas.forEach(function (elemento){
      events.push({title:elemento.paciente.nombre,allDay: false,start:elemento.inicio_consulta,end:elemento.fin_consulta});
    })
    return events;
  }

  useEffect(() => {
    fetch("http://localhost:8080/consulta/getAllConsultas")
      .then((res) => res.json())
      .then((result) => {
        setConsultas(result);
      });
  }, []);

  return (
    <AnimatedPage>
    <div className="agenda">
      <div className="container-agenda">
        <div className="con-agenda">
          <BasicModal/>
          <Title
            titulo="Agenda"
            description="Consulta informacion sobre tu agenda"
          ></Title>
        </div>

        <div className="agenda-cita">
          <div className="calendar">
            <Calendar events={enventos()} localizer={localizer} startAccessor="start" endAccessor="end" style={{ height: 500, margin: "30px" }}/>
          </div>
        </div>

      </div>
    </div>
    </AnimatedPage>
  );
}

export default Agenda;
