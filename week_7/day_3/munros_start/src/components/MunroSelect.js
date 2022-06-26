import React from 'react';

const MunroSelect = ({munros, onMunroChange}) => {

    const options = munros.map((munro, index) => {
        return <option key={index} value={index}>{munro.name}</option>
      })

    const handleChange = (event) => {
        const chosenIndex = (event.target.value - 1);
        const munro = munros[chosenIndex]
        onMunroChange(munro)
    }

    return (
        <>
        <select onChange={handleChange}>
            <option disabled>Select a munro</option>
            {options}
        </select>
        </>
    )
}

export default MunroSelect