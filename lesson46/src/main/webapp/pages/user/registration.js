
function validateEmail(event) {
    event.preventDefault();

    let email = document.getElementById("email");

    console.log(email.value);

    let emailText = email.value;

    console.log(emailText.indexOf("@") === -1);

    if(emailText.indexOf("@") === -1) {
        email.classList.add('red-border')
    } else {
        document.getElementById("registration-form").submit();
    }
}


document.getElementById("registerBtn").addEventListener('click', validateEmail);


document.getElementById("email").addEventListener("focus", resetEmailField);


function resetEmailField() {
    document.getElementById("email").classList.remove('red-border')
}