import React from 'react';

const MunroDetail = ({munro}) => {

    return (
        <div>
            <h1>{munro.name}</h1>
            <h4>{munro.height}</h4>
        </div>
    )
}

export default MunroDetail