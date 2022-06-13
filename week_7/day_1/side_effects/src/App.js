import './App.css';
import React, {useState, useEffect} from 'react';

function App() {

  const [number, setNumber] = useState(0);
  const [doubleNum, setDoubleNum] = useState(0);

  useEffect(() => {
    console.log("CALLED")
    setDoubleNum(number * 2)
  }, [number])

  const handleInc = () => {
    setNumber(number + 1);
  }

  const handleDec = () => {
    setNumber(number - 1);
  };

  return (
    <div>
      <button onClick={handleInc}>Increase</button>
      <button onClick={handleDec}>Decrease</button>

      <h2>{number}</h2>

      <h2>{doubleNum}</h2>
    </div>

  );
}

export default App;
