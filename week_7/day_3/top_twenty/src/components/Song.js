import React from 'react';
import "./song.css"
import ReactAudioPlayer from 'react-audio-player';

const Song = ({song, index}) => {

    
    return (
        <>
            <li> <h4>Chart Position: {index + 1} :</h4>
            <h5>{song["im:name"].label} by {song["im:artist"].label}</h5> </li>
            <ReactAudioPlayer src={song.link[1].attributes.href} autoPlay controls/>
        </>
    )
}

export default Song