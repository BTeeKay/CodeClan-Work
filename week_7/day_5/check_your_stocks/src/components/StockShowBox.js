import React from 'react'

const StockShowBox = ({stocks}) => {

    return (
        <>
            <h2>{stocks.symbol}</h2>
            <h2>{stocks.companyName}</h2>
            <h5>Current Price: {stocks.latestPrice}</h5>
        </>
    );
}

export default StockShowBox