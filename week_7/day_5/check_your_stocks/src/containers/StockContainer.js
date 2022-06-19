import React, {useState} from 'react'
import StockGetBox from '../components/StockGetBox';
import StockShowBox from '../components/StockShowBox';
import './StockContainer.css'

const StockContainer = () => {

const API_KEY = process.env.REACT_APP_API_KEY

const [stocks, getStocks] = useState(null);
const [stockName, getStockName] = useState("")


const stockNameFromUser = (s) => {
  getStockName(s);
};

const getApiStocks = (stock) => {
  fetch(`https://cloud.iexapis.com/stable/stock/${stock}/quote?token=${API_KEY}`)
  .then(result => result.json())
  .then(stocks => getStocks(stocks))
}

console.log(stocks)
console.log(stockName)

    return (
        <div className="StockContainer">
        <h2>BTK Designs 2022 &copy;</h2>
        <StockGetBox getApiStocks={getApiStocks} stockNameFromUser={stockNameFromUser}/>
        { stocks ? <StockShowBox stocks={stocks}/> : null }
        </div>
    );
}

export default StockContainer