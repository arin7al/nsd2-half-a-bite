import React from 'react'
import { Nav } from 'react-bootstrap';
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";
import Login from './Login'


export default function NavBar() {
    return (
        <Nav
        activeKey="/home"
        onSelect={(selectedKey) => alert(`selected ${selectedKey}`)}
      >
        <Nav.Item>
          <Nav.Link>
          <Link to="/login">Login</Link>
          </Nav.Link>
        </Nav.Item>
        <Nav.Item>
          <Nav.Link>
          <Link to="/profile">Profile</Link>
          </Nav.Link>
        </Nav.Item>
        <Nav.Item>
          <Nav.Link> Тута все транзакции </Nav.Link>
        </Nav.Item>
      </Nav> 
    )
}
