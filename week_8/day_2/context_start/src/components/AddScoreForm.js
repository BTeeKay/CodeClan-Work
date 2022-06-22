import React, {useState, useContext} from 'react'
import UserContext from '../context/UserContext';

const AddScoreForm = () => {

  const [inputGame, setInputGame] = useState("");
  const [inputScore, setInputScore] = useState("");

  const {user, setUser} = useContext(UserContext)

  const handleInputScore = (event) => {
    setInputScore(event.target.value);
  }

  const handleInputGame = (event) => {
    setInputGame(event.target.value);
  }

  const handleFormSubmit = (event) => {
    event.preventDefault();
    const newObject = {[inputGame]: Number(inputScore)}
    const updatedScores = [...user.scores, newObject]
    const updatedUser = {...user, scores: updatedScores}
    setUser(updatedUser)
    event.target.reset();
  }
  
  return (
  <div>
    <form onSubmit={handleFormSubmit}>
        <label htmlFor='game'>Game:</label>
        <input onChange={handleInputGame} type="text" id="game"  required/>
        <label htmlFor='score'>Score:</label>
        <input onChange={handleInputScore} type="number" id="score"  required/>
        <input type="submit" value="Save" />
    </form>
  </div>
  );
}

export default AddScoreForm