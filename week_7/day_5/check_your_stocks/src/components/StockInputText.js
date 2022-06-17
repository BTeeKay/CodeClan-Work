import React from 'react'
import './stockinputtext.css'

const StockInputText = ({getApiStocks, stockNameFromUser}) => {

    const handleChange = (event) => {
        const inputText = event.target.value
        if (inputText.length === 4) {
            stockNameFromUser(inputText)
            getApiStocks(inputText)
        };
    }

    return (
        <div>
            <form>
                <input  maxLength="4" className="textboxinput"
                onChange={handleChange} placeholder="Enter 4 character symbol"
                type="text"></input>
            </form>
        </div>
    )
}

export default StockInputText