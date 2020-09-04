import React from 'react';
import DatePicker from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";
import { Form, Button } from 'react-bootstrap';
import { createArtwork } from './artworkActions';

class ArtworkForm extends React.Component {
  constructor(props) {
    super(props);
    this.state = { creationDate: new Date(), sold: false };
    this.handleNameChange = this.handleNameChange.bind(this);
    this.handleCreationDateChange = this.handleCreationDateChange.bind(this);
    this.handleSoldChange = this.handleSoldChange.bind(this);
    this.handleDimensionsChange = this.handleDimensionsChange.bind(this);
    this.handleMediumChange = this.handleMediumChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleNameChange(event) {
    this.setState({ name: event.target.value });
  }

  handleCreationDateChange = date => {
    this.setState({
      creationDate: date
    });
  };

  handleSoldChange(event) {
    this.setState({ sold: event.target.checked });
  }

  handleDimensionsChange(event) {
    this.setState({ dimensions: event.target.value });
  }

  handleMediumChange(event) {
    this.setState({ medium: event.target.value });
  }

  handleSubmit(event) {
    createArtwork(this.state);
    event.preventDefault();
  }



  render() {
    return (
      <Form onSubmit={this.handleSubmit}>
        <Form.Group controlId="formArtwork.Name">
          <Form.Label>Name</Form.Label>
          <Form.Control type="text" placeholder="" value={this.state.name} onChange={this.handleNameChange} />
        </Form.Group>
        <Form.Group controlId="formArtwork.CreationDate">
          <Form.Label>Creation date</Form.Label><br />
          <DatePicker
            selected={this.state.creationDate}
            onChange={this.handleCreationDateChange}
          />
        </Form.Group>
        <Form.Check type="checkbox" id="sold" label="Sold" checked={this.state.sold} onChange={this.handleSoldChange} />
        <Form.Group controlId="formArtwork.SelectDimensions" value={this.state.dimensions} onChange={this.handleDimensionsChange} >
          <Form.Label>Dimensions</Form.Label>
          <Form.Control as="select" custom>
            <option>A5</option>
            <option>A4</option>
            <option>10x15</option>
          </Form.Control>
        </Form.Group>
        <Form.Group controlId="formArtwork.Medium" value={this.state.medium} onChange={this.handleMediumChange}>
          <Form.Label>Medium</Form.Label>
          <Form.Control as="select" custom>
            <option>Paper</option>
            <option>Fabric</option>
            <option>Others</option>
          </Form.Control>
        </Form.Group>

        <Button variant="primary" type="submit">
          Submit
        </Button>
      </Form>

    );
  }



}

export default ArtworkForm;