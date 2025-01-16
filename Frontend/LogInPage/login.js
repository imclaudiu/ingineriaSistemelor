function getUsername() {
    let username = document.getElementById("username").value;
    return username;
}

function getPassword() {
    let password = document.getElementById("password").value;
    return password;
}

function testFunc() {
    let extractUsername = getUsername();
    let extractPassword = getPassword();

    fetch('http://localhost:8080/login', {
        method: 'POST',
        headers: {
            'Content-Type' : 'application/json'
        }, 
        body: JSON.stringify({
            username: extractUsername,
            password: extractPassword
        })
    }).then(res => {return res.json()})
        .then(data => console.log(data))
        .catch(error => console.log('ERROR:', error));
}