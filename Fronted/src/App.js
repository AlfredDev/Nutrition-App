import './App.css';
import Header from './Components/Header/header';
import Home from './Components/Pages/home/Home';
import {
  BrowserRouter,
  Routes,
  Route
} from "react-router-dom";
import Agenda from './Components/Pages/agenda/Agenda';
import Clientes from './Components/Pages/clientes/Clientes';
import Recetas from './Components/Pages/recetas/Recetas';
import Consultas from './Components/Pages/consultas/Consultas';
import SidebarEx from "./Components/SideBarAx/SidebarEx";
import AddCliente from './Components/Modal/AddCliente/AddCliente';
// import Login from './Components/Login/Login';
import Informacion from './Components/Pages/Informacion/Informacion';


function App() {

  return (
    <>


      <BrowserRouter>
        <Header></Header>
        <SidebarEx />
        <div className="home_content">


          <Routes >
            <Route path="/" exact element={<Home />} />
            <Route path="/agenda" exact element={<Agenda />} />
            <Route path="/clientes" exact element={<Clientes />} />
            <Route path="/recetas" exact element={<Recetas />} />
            <Route path="/appointments" exact element={<Consultas />} />
            <Route path="/addmodal" exact element={<AddCliente />} />
            <Route path="/informacion/:id" exact element={<Informacion />} />

            <Route>{'404'}</Route>

          </Routes>

        </div>
      </BrowserRouter>
    </>
  );
}

export default App;
