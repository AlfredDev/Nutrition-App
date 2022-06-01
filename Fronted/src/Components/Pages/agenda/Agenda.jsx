import Title from "../../Title/Title";
import "./agenda.css";
import format from "date-fns/format";
import getDay from "date-fns/getDay";
import parse from "date-fns/parse";
import startOfWeek from "date-fns/startOfWeek";
import React from "react";
import { Calendar, dateFnsLocalizer } from "react-big-calendar";
import "react-big-calendar/lib/css/react-big-calendar.css";
// import DatePicker from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";
import BasicModal from "./AgendarModal";

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

const events = [
  {
      title: "Big Meeting",
      allDay: true,
      start: new Date(2022, 6, 0),
      end: new Date(2022, 6, 0),
  },
  {
      title: "Vacation",
      start: new Date(2022, 6, 7),
      end: new Date(2022, 6, 10),
  },
  {
      title: "Conference",
      start: new Date(2022, 6, 20),
      end: new Date(2022, 6, 23),
  },
];


function Agenda() {




  return (
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
            <Calendar events={events} localizer={localizer} startAccessor="start" endAccessor="end" style={{ height: 500, margin: "30px" }}/>
          </div>
        </div>

      </div>
    </div>
  );
}

export default Agenda;
