import './App.css';
import React from 'react'
import StockContainer from './containers/StockContainer';


function App() {
  return (
    <div className="main" >
      <h1>Get Stock Prices</h1>
      <StockContainer />
    </div>
  );
}

export default App;
