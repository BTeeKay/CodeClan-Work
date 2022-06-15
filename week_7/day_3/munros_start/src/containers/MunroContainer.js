import React, { useState, useEffect } from 'react';
import MunroDetail from '../components/MunroDetail';
import MunroSelect from '../components/MunroSelect';
import './MunroContainer.css';

const MunroContainer = () => {
    const [munros, setMunros] = useState([]);
    const [selectedMunro, setSelectedMunro] = useState(null);

    useEffect(() => {
      getMunros();
    }, [])

    const onMunroChange = (munro) => {
        setSelectedMunro(munro)
    }

    const getMunros = function(){
        fetch('https://munroapi.herokuapp.com/munros')
        .then(res => res.json())
        .then(munros => setMunros(munros))
    }

    return (
        <div className="main-container">
            <MunroSelect munros={munros} onMunroChange={onMunroChange}/>
            {selectedMunro ? <MunroDetail munro={selectedMunro} /> : null}
        </div>
        
    )
}

export default MunroContainer;
