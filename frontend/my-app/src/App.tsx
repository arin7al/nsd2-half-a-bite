import React from 'react';
import { BrowserRouter, Switch, Route } from "react-router-dom";
import Footer from './components/Footer';
import Login from './components/Login'
import NavBar from './components/NavBar';
import Profile from './components/Profile'
import BuyToken from './components/BuyToken'

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <NavBar />
        <main className="content">
          <Switch>
            <Route path="/login">
              <Login />
            </Route>
            <Route path="/profile">
              <Profile />
            </Route>
            <Route path='/'>
              <BuyToken />
            </Route>
          </Switch>
        </main>
        <Footer />
      </BrowserRouter>
    </div>
  );
}

export default App;
