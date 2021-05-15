import React from 'react'
import { Button, Card, Form, Container, Row } from 'react-bootstrap';


export default function registration() {
    return (
        <Container>
            <Row className="justify-content-md-center">
                <Card style={{ width: '25rem' }}>
                    <Card.Body>
                    <Card.Title> Registration </Card.Title>
                    <Form>
                        <Form.Group controlId="formBasicEmail">
                            <Form.Label>Email address</Form.Label>
                        <Form.Control type="email" placeholder="Enter email" />
                            <Form.Text className="text-muted">
                                We'll never share your email with anyone else.
                            </Form.Text>
                        </Form.Group>

                        {/* <Form.Group controlId="formName">
                            <Form.Label>Имя</Form.Label>
                        <Form.Control type="name" placeholder="Ваше имя" />
                        </Form.Group>

                        <Form.Group controlId="formName">
                            <Form.Label>Фамилия</Form.Label>
                        <Form.Control type="LastName" placeholder="Ваша фамилия" />
                        </Form.Group> */}

                        <Form.Group controlId="formBasicPassword">
                            <Form.Label>Password</Form.Label>
                                <Form.Control type="password" placeholder="Password" />
                        </Form.Group>

                    <Form.Group controlId="EmiterOrInvestor">
                        <Form.Label>Are you an invester or an emitter?</Form.Label>
                        <Form.Control as="select">
                            <option>Invester</option>
                            <option>Emiter</option>
                        </Form.Control>
                        </Form.Group>

                        <Button variant="primary" type="submit">
                        Submit
                        </Button>
                    </Form>
                </Card.Body>
                </Card>
            </Row>
        </Container>
    )
}

