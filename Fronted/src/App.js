import './App.css';
import Header from './Components/Header/header';
import Home from './Components/Pages/home/Home';
import Sidebar from './Components/Sidebar/Sidebar';
import {
  BrowserRouter,
  Routes,
  Route,
} from "react-router-dom";
import Agenda from './Components/Pages/agenda/Agenda';
import Clientes from './Components/Pages/clientes/Clientes';
import Recetas from './Components/Pages/recetas/Recetas';
import Consultas from './Components/Pages/consultas/Consultas';

function App() {
  return (
    <>

    <BrowserRouter>

        <Header></Header>

      <div className='container'>
        <Sidebar></Sidebar>
        <Routes>
        <Route path="/" exact element={<Home/>}/>
        <Route path="/agenda" exact element={<Agenda/>}/>
        <Route path="/clientes" exact element={<Clientes/>}/>
        <Route path="/recetas" exact element={<Recetas/>}/>
        <Route path="/appointments" exact element={<Consultas/>}/>

        </Routes>
      </div>

      </BrowserRouter>

    </>
  );
}

export default App;
