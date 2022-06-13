document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript has loaded');

  const button = document.querySelector('#button');
  button.addEventListener('click', handleButtonClick)

  const input = document.querySelector('#input');
  input.addEventListener('input', handleTextInput)

  const form = document.querySelector('#form');
  form.addEventListener('submit', handleFormSubmit);

});

const handleButtonClick = function() {
  const button = document.querySelector('#button-result');
  button.textContent = `Button has been clicked times`;
}

const handleTextInput = function (event) {
  const inputPara = document.querySelector('#input-result')
  inputPara.textContent = `you typed ${event.target.value}`;
}

const handleFormSubmit = function(event){
  event.preventDefault();
  const text = document.querySelector('#form-result')
  text.textContent = `You entered ${event.target.first_name.value} as first name
  and ${event.target.last_name.value} as last name`
}
