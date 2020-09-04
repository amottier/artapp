export function createArtwork(data) {
    return fetch('http://192.168.1.2:8080/artwork', {
        method: 'POST',
        mode: 'cors',
        body: JSON.stringify(data),
        headers: {
            'Content-Type': 'application/json'
        }
    }).then(res => {
        console.log("response: "+res);
        return res;
    }).catch(err => {
        console.log("error: "+err);
        return err;
    });
}