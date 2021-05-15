import React from 'react';
import { BrowserRouter, Switch, Route, Redirect } from "react-router-dom";
import Footer from './components/Footer';
import Login from './components/Login'
import NavBar from './components/NavBar';
import { useLogged } from "./utils/userService";

function App() {

  const logged = useLogged();
  return (
    <div className="App">
      <BrowserRouter>
        <NavBar />
        <main className="content">
          <Switch>
            <Route path="/login">
              {logged ? <Redirect to="/" /> : <Login />}
            </Route>
            <Route path="/investorProfile">

            </Route>
          </Switch>
        </main>
        <Footer />
      </BrowserRouter>
    </div>
  );
}

export default App;
