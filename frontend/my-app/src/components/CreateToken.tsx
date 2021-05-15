import React from 'react'
import { Button, Card, Container, Row, ListGroup, Col, Form } from 'react-bootstrap';

const CreateToken = () => {
    return (
        <Container className="justify-content-md-right">
            <Row>
                {/* <Col lg={3}>
                        <Card>
                        <Card.Body>
                        <Card.Title>Profile</Card.Title>
                            <Card.Text>
                                @Name
                                <p className='text-muted'>investor/emissor/operator</p>
                            </Card.Text>
                            </Card.Body>

                            <Card.Body>
                            <ListGroup variant="flush">
                                <ListGroup.Item>Transfer your tokens</ListGroup.Item> <Button variant="primary"> Transfer </Button>
                                <ListGroup.Item>Buy tokens</ListGroup.Item> <Button variant="primary"> Buy </Button>
                            </ListGroup>


                        </Card.Body>
                    </Card>
                </Col> */}

                <Col >
                <Card>
                <Card.Body>
                <Form>
                        <Form.Group controlId="formBasicEmail">
                            <Form.Label>Token Name</Form.Label>
                                <Form.Control type="email" placeholder="Enter email" />
                            </Form.Group>

                            <Form.Group controlId="formBasicPassword">
                                <Form.Label>Amount made</Form.Label>
                                <Form.Control type="password" placeholder="Password" />
                            </Form.Group>


                        <Button variant="primary" type="submit">
                            Submit
                        </Button>
                        <a href="#!" className="text-muted">У вас уже есть аккаунт?</a>
                    </Form>
                            </Card.Body>
                </Card>
                </Col>

            </Row>
        </Container>
    )
};


export default CreateToken