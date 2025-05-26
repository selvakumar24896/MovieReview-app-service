import logo from './logo.svg';
import './App.css';
import { useState, useEffect } from 'react';
import api from './api/axiosConfig';

function App() {

  const [movies, setMovies] = useState();

  const getMovies = async () => {
    try {
      const response = await api.get("api/v1/movies/all");
      console.log(response.data);
      setMovies(response.data);
    } catch (err) {
      console.log(err);
    }
  }

  useEffect(() => {
    getMovies();
  }, []);

  return (
    <div className="App">

    </div>
  );
}

export default App;
