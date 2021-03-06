import React from 'react'
import { Button, Card, Container, Row, ListGroup, Col } from 'react-bootstrap';

// Depending on what kind of user it is we render different cards

const Profile = () => {



    return (
        <Container className="justify-content-md-right">
            <Row>
                <Col lg={3}>
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
                </Col>
                    {/* или для каждой инвестиции нужен отдельная карточка */}
                <Col >
                <Card>
                <Card.Body>
                        <Card.Header>Your investements</Card.Header>
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
}

export default Profile
