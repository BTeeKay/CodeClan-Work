import { useFetch } from '../hooks/usefetch'
import Breed from "../components/Breed";

const DogBreedsContainer = () => {

    let apiResponse = useFetch("https://api.thedogapi.com/v1/breeds")

    if (apiResponse.error) {
        console.log("error:", apiResponse.error)
    }

    if (!apiResponse.data) {
        return "Loading"
    }
    
    const dogBreeds = apiResponse.data.map(dog => { 
        return <Breed name={dog.name} temp={dog.temperament} key={`dog-${dog.id}`} />
    })

    return (
        <>
            <h2>Dog Breeds</h2>
            <ul>
                { dogBreeds }
            </ul>
        </>
    )
}

export default DogBreedsContainer;
