import React from 'react'
import { Button, Card, Container, Row, ListGroup, Col, Form } from 'react-bootstrap';

const BuyToken = () => {
    return (
        <Container>
            <Row className="justify-content-md-center">
                <Card>
                    <Card.Body>
                        <Card.Title> Buying coins </Card.Title>
                        <Form>
                            <Form.Group controlId="TokenId">
                                <Form.Label>Enter name of the token</Form.Label>
                                <Form.Control type="token" placeholder="Token Indetfier" />
                            </Form.Group>
                            <Form.Group controlId="Amount">
                                <Form.Label>Number of Coins</Form.Label>
                                <Form.Control type="Amount" placeholder="Amount" />
                                {/* business logic of calculating how much money it would cost */}
                            </Form.Group>
                            <Button variant="primary" type="submit">
                            Buy
                            </Button>
                        </Form>
                    </Card.Body>
                </Card>
            </Row>
        </Container>
    )
};

export default BuyToken