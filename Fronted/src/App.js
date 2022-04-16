import './App.css';
import Header from './Components/Header/header';
import Home from './Components/Pages/home/Home';
import Sidebar from './Components/Sidebar/Sidebar';

function App() {
  return (
    <>
        <Header></Header>

      <div className='container'>
        <Sidebar></Sidebar>
        <Home></Home>
      </div>

    </>
  );
}

export default App;
