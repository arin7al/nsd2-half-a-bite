import React from 'react'
import { Button, Card, Container, Row, ListGroup, Col, Form } from 'react-bootstrap';

const TradeOffer = () => {
    return (
        <Container>
            <Row className="justify-content-md-center">
                <Card>
                    <Card.Body>
                        <Card.Title> Trade </Card.Title>
                        <Form>
                            <Form.Group controlId="TokenId">
                                <Form.Label>Enter username of your partner</Form.Label>
                                <Form.Control type="Username" placeholder="Username" />
                            </Form.Group>
                            <Form.Group controlId="Amount">
                                <Form.Label>Number of Coins</Form.Label>
                                <Form.Control type="Amount" placeholder="Amount" />
                            </Form.Group>

                            <Form.Group controlId="exampleForm.ControlSelect1">
                                <Form.Label>Example select</Form.Label>
                                <Form.Control as="select">
                                <option>Your Tokens</option>
                                <option>Your Tokens</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                </Form.Control>
                            </Form.Group>

                            <Form.Group>
                                <Form.Label>Choose what kind of token you want trade for</Form.Label>
                                <Form.Control type="Username" placeholder="Token" />
                            </Form.Group>
                            {/* или окно с токенами которые есть у другого пользавателя */}

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

export default TradeOffer