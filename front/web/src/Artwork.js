import React from 'react';

class Artwork extends React.Component {
    render()   {
        return (
                  <div className="artwork">
                    <div><b>Nom : </b>{this.props.name} <b>Description : </b>{this.props.description}</div>
                  </div>
                );
     }
}

export default Artwork;