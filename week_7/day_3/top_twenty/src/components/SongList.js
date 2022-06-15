import React from 'react';
import Song from './Song'

const SongList = ({songs}) => {

    const songsList = songs.map((song, index) => {
        return <Song song={song} key={index} index={index}/>
    })

    return (
        <>
            {songsList}
        </>
    )
}

export default SongList