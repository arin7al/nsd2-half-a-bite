import React from 'react'
import { Button, Card, Container, Row, Col, Nav, ListGroup } from 'react-bootstrap';

const OperatorControl = () => {
    return (
        // тута нужен профиль
        // и для каждого нового эмитера
<Container>
    <Row>

        <Col>
                <Card>
                    <Card.Body>
                        <Card.Header>Новый эмиттер</Card.Header>
                          <Card.Text>
                                Данные о новом Эмитере
                          </Card.Text>
                          <Button variant="primary" type="submit">Allow</Button>
                        <Button variant="danger">Cancel</Button>

                    </Card.Body>
                </Card>
        </Col>
    </Row>

    <Row>
        <Col>
            <Card>
                <Card.Header>
                    <Nav variant="tabs" defaultActiveKey="#first">
                    <Nav.Item>
                        <Nav.Link href="#first">Users</Nav.Link>
                    </Nav.Item>
                    <Nav.Item>
                        <Nav.Link href="#link">Transactions</Nav.Link>
                    </Nav.Item>
                    <Nav.Item>
                        <Nav.Link href="#disabled">Emitters</Nav.Link>
                    </Nav.Item>
                    </Nav>
                </Card.Header>
                <Card.Body>
                    <Card.Title>Special title treatment</Card.Title>
                    <ListGroup variant="flush">
                        <ListGroup.Item>Cras justo odio</ListGroup.Item>
                        <ListGroup.Item>Dapibus ac facilisis in</ListGroup.Item>
                        <ListGroup.Item>Vestibulum at eros</ListGroup.Item>
                    </ListGroup>
                </Card.Body>
                </Card>
        </Col>
    </Row>
</Container>
    )
};

export default OperatorControl
