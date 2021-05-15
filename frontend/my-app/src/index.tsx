import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import reportWebVitals from './reportWebVitals';
import 'bootstrap/dist/css/bootstrap.min.css';
import Registration from './components/Registration'
import NavBar from './components/NavBar'
import Login from './components/Login'
import Footer from './components/Footer'
import Profile from './components/Profile'
import BuyToken from './components/BuyToken'
import TradeOffer from './components/TradeOffer'
import OperatorControl from './components/OperatorControl'
import TradeOfferFromUser from './components/TradeOfferFromUser'

ReactDOM.render(
  <React.StrictMode>
    <NavBar/>
    <App />
    <Registration />
    <Login />
    <Profile/>
    <BuyToken />
    <TradeOffer />
    <OperatorControl />
    <TradeOfferFromUser />
    <Footer />
  </React.StrictMode>,
  document.getElementById('root')
);

reportWebVitals();
