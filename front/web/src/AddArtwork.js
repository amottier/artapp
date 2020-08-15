import React from 'react';

class AddArtwork extends React.Component {
    render()   {
        return (
                  <div className="add-artwork">
                    <div><b>Nom : </b>{this.props.name} <b>Description : </b>{this.props.description}</div>
                  </div>
                );
     }
}

export default AddArtwork;