import './App.css'
import { useState } from 'react'
import Square from './Square'

function App() {
  const [data, setData] = useState({})
  const [isLoading, setIsLoading] = useState(false)

  const fetchData = () => {
    setIsLoading(true)
    fetch(
      `http://localhost:8080/home?width=${window.innerWidth}&height=${window.innerHeight}`
    )
      .then((response) => response.json())
      .then((resp) => setData(resp))
      .finally(() => setIsLoading(false))
  }

  return (
    <div className="App">
      <button onClick={fetchData}>Load Data</button>
      {isLoading ? <p>Loading...</p> : <Square x={data.x} y={data.y} />}
    </div>
  )
}

export default App
