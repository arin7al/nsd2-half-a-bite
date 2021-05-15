import React from 'react';
import { BrowserRouter, Switch, Route } from "react-router-dom";
import Login from './components/Login'

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <main className="content">
          <Switch>
            <Route path="/login">
              <Login/>
            </Route>
          </Switch>
        </main>
      </BrowserRouter>
    </div>
  );
}

export default App;
