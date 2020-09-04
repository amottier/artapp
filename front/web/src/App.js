import React from 'react';
import {
  BrowserRouter as Router,
  Route,
  Switch
} from "react-router-dom";
import { Nav, Navbar, NavDropdown, Container, Row, Col } from 'react-bootstrap';

import About from './About';
import ArtCollection from './ArtCollection';
import ArtworkForm from './ArtworkForm';
import Home from './Home';


function App() {
  return (
    <Router>

      <Container bg="dark" variant="dark">
        <Row bg="dark" variant="dark">
          <Col>
            {/* The navigation menu */}
            <Navbar expand="lg" bg="dark" variant="dark">
              <Navbar.Brand href="/">ArtApp</Navbar.Brand>
              <Navbar.Toggle aria-controls="basic-navbar-nav" />
              <Navbar.Collapse id="basic-navbar-nav">
                <Nav className="mr-auto">
                  <Nav.Link href="/">Home</Nav.Link>
                  <Nav.Link href="/artworks">Art collection</Nav.Link>
                  <Nav.Link href="/artwork/add">Add artwork</Nav.Link>
                  <NavDropdown title="Others" id="basic-nav-dropdown">
                    <NavDropdown.Item href="/about">About</NavDropdown.Item>
                    <NavDropdown.Item href="#action/3.2">Another action</NavDropdown.Item>
                    <NavDropdown.Item href="#action/3.3">Something</NavDropdown.Item>
                    <NavDropdown.Divider />
                    <NavDropdown.Item href="#action/3.4">Separated link</NavDropdown.Item>
                  </NavDropdown>
                </Nav>
              </Navbar.Collapse>
            </Navbar>
          </Col>
        </Row>
        <Row>
          <Col>
            {/* A <Switch> looks through its children <Route>s and
              renders the first one that matches the current URL. */}
            <Switch>
              <Route path="/about">
                <About />
              </Route>
              <Route path="/artworks">
                <ArtCollection />
              </Route>
              <Route path="/artwork/add">
                <ArtworkForm />
              </Route>
              <Route path="/">
                <Home />
              </Route>
            </Switch>
          </Col>
        </Row>

      </Container>



    </Router>
  );
}

export default App;
