import React, {useState, useEffect} from 'react';
import SongList from '../components/SongList'
import ReactAudioPlayer from 'react-audio-player';

const SongsBox = () => {
    const [songs, setSongs] = useState([]);

    useEffect(() => {
        getSongs();
    }, [])

    const getSongs = () => {
        // fetch('https://itunes.apple.com/gb/rss/topsongs/limit=20/json')
        fetch('https://itunes.apple.com/gb/rss/topsongs/limit=20/genre=21/json')
        .then(result => result.json())
        .then(songs => setSongs(songs.feed.entry))
        console.log(songs)
    }

    return (
        <>
        <h2>This is SongsBox</h2>
        <SongList songs={songs}/>
        </>
    )
}

export default SongsBox