import React from 'react';
import { BrowserRouter, Switch, Route } from "react-router-dom";
// import Login from "./components/login.page";
// import Profile from "./components/profile.page";
// import Registration from "./components/registration.page";
function App() {
  return (
    <div className="App">
      <BrowserRouter>
        {/* <Nav/> */}
        <main className="content">
          <Switch>
            <Route path="/">
              hi
            </Route>
          </Switch>
        </main>
        {/* <Footer/> */}
      </BrowserRouter>
    </div>
  );
}

export default App;
