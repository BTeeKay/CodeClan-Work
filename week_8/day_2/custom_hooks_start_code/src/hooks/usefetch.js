import {useEffect, useState} from 'react';

export const useFetch = (url) => {
    const [data, setData] = useState(null);
    const [error, setError] = useState(null);

    const handleFetch = () => {
        fetch(url)
        .then(result => result.json())
        .then(data => setData(data))
        .catch(error => setError(error))
    }

    useEffect(() => {
        handleFetch();
    }, [url]);

    return {data, error}
}