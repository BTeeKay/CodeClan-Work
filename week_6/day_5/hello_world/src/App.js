import React from 'react';
import './App.css';           

function App() {
  const age = 30;   
  const name = "Brian";
  
  return (
   <div>
  	  <h1 className="title">Hello World!</h1>
  	  <p> This is a paragraph of text</p>
  	  <p> My name is {name} and I'm {age} years old</p>
  	</div>  
  );
}                          

export default App;           