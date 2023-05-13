import './App.css'
import { useState } from 'react'
import Square from './reaction/chain-numbers/Square'
import SquareContainer from './reaction/chain-numbers/SquareContainer'

function App() {
  const [data, setData] = useState([])
  const [isLoading, setIsLoading] = useState(false)

  const fetchData = () => {
    setIsLoading(true)
    fetch(
      `http://localhost:8080/numbers?width=${window.innerWidth}&height=${
        window.innerHeight
      }&count=${5}`
    )
      .then((response) => response.json())
      .then((resp) => setData(resp))
      .finally(() => setIsLoading(false))
  }

  return (
    <div className="App">
      <SquareContainer />
    </div>
  )
}

export default App
