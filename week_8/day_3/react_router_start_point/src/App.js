import React, {useState} from 'react';
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import Home from './components/Home';
import About from './components/About';
import Pricing from './components/Pricing';
import NavBar from './components/NavBar';

const App = ()=> {

  const initialPricing = [ { level: "Hobby", cost: 0 },
  { level: "Startup", cost: 10 },
  { level: "Enterprise", cost: 100 }];
  
  const [pricing, setPrice] = useState(initialPricing);

  return (
    <Router>
      <NavBar />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/about" element={<About />} />
        <Route exact path="/pricing" element={<Pricing pricing={pricing} />} />
        <Route path="task/:id" element={<Home />}/>
        <Route path="*" element={<h1>404 Page Not Found</h1>} />
      </Routes>
    </Router>
  )

}

export default App;
