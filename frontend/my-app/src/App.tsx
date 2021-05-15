import React from 'react';
import { BrowserRouter, Switch, Route } from "react-router-dom";
import Footer from './components/Footer';
import Login from './components/Login'
import NavBar from './components/NavBar';

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
          </Switch>
        </main>
        <Footer />
      </BrowserRouter>
    </div>
  );
}

export default App;
