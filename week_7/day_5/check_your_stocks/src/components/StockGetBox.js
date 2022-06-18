import React from 'react'
import StockInputText from './StockInputText'

const StockGetBox = ({getApiStocks, stockNameFromUser}) => {

    return (
        <>
            <h3>Enter your stock below</h3>
            <StockInputText getApiStocks={getApiStocks} stockNameFromUser={stockNameFromUser}/>
        </>
    )
}

export default StockGetBox