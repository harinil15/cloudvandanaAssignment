const form = document.querySelector('#form');
const message = document.querySelector('#message');
const submit = document.getElementById('submit');



function resetFunction(){
    alert('Form is clear');
    message.textContent = 'Please fill out all fields';
    message.style.color = 'red';

}

let isValid = false;
function validateForm(){
    isValid = form.checkValidity();
    console.log(isValid);
    if(!isValid){
        message.textContent = 'Please fill out all fields';
        message.style.color = 'red';
    }else{
        alert('Thank you for applying');
         message.textContent = 'your application was submitted ';
        message.style.color = 'darkgreen';

    }
}

form.addEventListener('submit',(e)=>{
    e.preventDefault();
    validateForm();
    submitFunction();
    
})