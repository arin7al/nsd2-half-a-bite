import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import 'bootstrap/dist/css/bootstrap.min.css';
import Registration from './components/Registration'
import NavBar from './components/NavBar'
import Login from './components/Login'


ReactDOM.render(
  <React.StrictMode>
    <NavBar/>
    <App />
    <Registration />
    <Login />
  </React.StrictMode>,
  document.getElementById('root')
);

reportWebVitals();
