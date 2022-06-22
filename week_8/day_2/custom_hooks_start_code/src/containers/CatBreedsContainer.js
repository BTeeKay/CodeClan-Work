import { useFetch } from '../hooks/usefetch';
import Breed from "../components/Breed";

const CatBreedsContainer = () => {

    let apiResponse = useFetch("https://api.thecatapi.com/v1/breeds")

    if (apiResponse.error) {
        console.log("error:", apiResponse.error)
    }

    if (!apiResponse.data) {
        return "Loading"
    }

    const catBreeds = apiResponse.data.map(cat => { 
        return <Breed name={cat.name} temp={cat.temperament} key={`cat-${cat.id}`} />
    })

    return (
        <>
            <h2>Cat Breeds</h2>
            <ul>
                { catBreeds }
            </ul>
        </>
    )
}

export default CatBreedsContainer;
