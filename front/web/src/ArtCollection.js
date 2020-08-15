import React from 'react';
import Artwork from './Artwork'

class ArtCollection extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      error: null,
      isLoaded: false,
      items: []
    };
  }

    render()   {
        const { error, isLoaded, items } = this.state;
            if (error) {
              return <div>Erreur : {error.message}</div>;
            } else if (!isLoaded) {
              return <div>Chargement…</div>;
            } else {
            const rows = [];

                    items.forEach((artwork) => {
                          rows.push(
                            <Artwork
                              key={artwork.id}
                              name={artwork.name}
                              description={artwork.description}
                            />
                          );
                        });

                        return (
                          <div>
                          <h1>Art collection</h1>
                          <div>{rows}</div>
                          </div>
                        );

            }

     }




componentDidMount() {
    fetch("http://localhost:8080/artworks", {
                                                                                      mode: 'cors',
                                                                                      method: 'GET',
                                                                                      headers: {
                                                                                          Accept: 'application/json'
                                                                                      },
                                                                                      cache: 'no-store'
                                                                                  })
        /*.then(res => {
              console.log(res.status);

        res.text();})
        .then(result => console.log(result))*/


      .then(res => res.json())
      .then(
        (result) => {
          this.setState({
            isLoaded: true,
            items: result
          });
        },
        // Remarque : il est important de traiter les erreurs ici
        // au lieu d'utiliser un bloc catch(), pour ne pas passer à la trappe
        // des exceptions provenant de réels bugs du composant.
        (error) => {
          this.setState({
            isLoaded: true,
            error
          });
        }
      )

/*
    fetch("http://localhost:8080/artworks", {
                                                mode: 'no-cors',
                                                method: 'GET',
                                                headers: {
                                                    Accept: 'application/json'
                                                }
                                            })
      .then(res => console.log("DEBUG: " + res.text()))
      .then(res => res.json())
      .then(
        (result) => {
          this.setState({
            isLoaded: true,
            items: result
          });
        },
        // Remarque : il est important de traiter les erreurs ici
        // au lieu d'utiliser un bloc catch(), pour ne pas passer à la trappe
        // des exceptions provenant de réels bugs du composant.
        (error) => {
          this.setState({
            isLoaded: true,
            error
          });
        }
      )
      */
  }
  }
/*
ArtCollection.ARTWORKS = [
                       {title: "Gourou", type: "Linogravure", description: "Feuillu"},
                       {title: "Bal des ardents", type: "Peinture", description: "Enflammé"}
                   ];
*/


export default ArtCollection;