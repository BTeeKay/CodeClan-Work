import React from 'react';

const SelectItem = ({munro, onMunroChange}) => {

    const handleChange = () => {
        onMunroChange(munro)
    }

    const options = 
    
    return (
        <select>
            <option disabled onChange={handleChange}>{munro.name}</option>
        </select>
    )
}

export default SelectItem