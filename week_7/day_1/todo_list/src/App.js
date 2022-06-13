import React, {useState} from 'react';
import './App.css';

function App() {

  const[tasks, setTasks] = useState([
    { name: "Feed Cats", priority: "high"},
    { name: "Wash Windows", priority: "low"},
    { name: "Clean PC", priority: "low"}
  ])

  const [newTask, setNewTask] = useState("");
  const [newPri, setNewPri] = useState("high");

  const taskNodes = tasks.map((task, index) => {
    return (
      <li key={index} className={(task.priority === 'high') ? "high" : "low"}><span>{task.name}</span></li>
    )
  })

  const handleTaskInput = (event) => {
    setNewTask(event.target.value)
  };

  const handleTaskPri = (event) => {
    setNewPri(event.target.value)
  }

  const saveNewTask = (event) => {
    event.preventDefault();
    const copyTasks = [...tasks]
    copyTasks.push({name: newTask, priority: newPri})
    setTasks(copyTasks)
    setNewTask("")
  };

  return (

    <div className="ToDo-App">

    <h1 className="ToDo-Header">ToDo List</h1>
    <hr></hr>

    <form onSubmit={saveNewTask}>
      <label htmlFor='new-task'>Add a new task:</label>
      <input id="new-task" type="text" value={newTask} onChange={handleTaskInput}/>
      <select defaultValue="high" onChange={handleTaskPri}>
        <option id="high" value="high">High</option>
        <option id="low" value="low">Low</option>
      </select>
      <input type="submit" value="Save New Task" />
    </form>

    <ul>
      {taskNodes}
    </ul>


  </div>

  );
}

export default App;
