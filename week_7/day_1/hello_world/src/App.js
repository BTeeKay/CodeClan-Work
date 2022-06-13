import './App.css';
import React, {useState} from 'react';

function App() {

  // const greeting = "Hello World";
  const [greeting, setGreeting] = useState('Hello, World!');
  const [total, setTotal] = useState(0)

  const handleClick = (userName) => {
    console.log("Yes you did a click")
    setGreeting("Hello" + userName)
  }

  const deposit = () => {
    setTotal(total + 10);
  }

  const withdraw = () => {
    if (total > 0) {
      setTotal(total - 10);
    };
  }

  return (
    <div>
      <h1>{greeting}</h1>
      <button onClick={() => handleClick(", Brian!")}>Change Greeting</button>

      <p>Total: £{total}</p>
      <button onClick={deposit}>Deposit</button>
      <button onClick={withdraw}>Withdraw</button>
    </div>
  );
}

export default App;
