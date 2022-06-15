import {useState, useEffect} from "react";
import './App.css';

function App() {

    const [dogImgUrl, setDogImgUrl] = useState("");

    useEffect(() => {
      fetchDog();
    }, [])

  const fetchDog = function(){
    fetch("https://dog.ceo/api/breeds/image/random")
    .then(response => response.json())
    .then(data => setDogImgUrl(data.message))
    .catch((error) => {
      console.log(error)
    })
    // https://restcountries.com/v3.1/all
    // fetch("https://restcountries.com/v3.1/all").then(response => response.json()).then(data => console.log(data))
  }

  return (
    <div id="app">
    <h1>RANDOGMISER</h1>
    <img id="dog-img" src={dogImgUrl} />
    <button onClick={fetchDog}>Gimme those dogs!</button>
    </div>
  );
}

export default App;
