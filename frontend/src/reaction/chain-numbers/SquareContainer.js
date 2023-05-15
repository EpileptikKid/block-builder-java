import { useEffect, useState } from 'react'
import Square from './Square'

const SquareContainer = () => {
  const [data, setData] = useState([])
  const [score, setScore] = useState(0)
  const [timeLeft, setTimeLeft] = useState(10)
  const [isStarted, setIsStarted] = useState(false)
  console.log('render')
  useEffect(() => {
    let timer
    if (isStarted) {
      timer = setTimeout(() => {
        setTimeLeft((prevTimeLeft) => prevTimeLeft - 1)
      }, 1000)
    }
    if (timeLeft <= 0) {
      setData([])
      setIsStarted(false)
      setTimeLeft(10)
    }
    return () => clearTimeout(timer)
  }, [isStarted, timeLeft])

  const handleAddTime = () => {
    setTimeLeft((prevTimeLeft) => prevTimeLeft + 3)
  }

  const fetchData = () => {
    setScore(0)
    fetch(
      `http://localhost:8080/numbers?width=${window.innerWidth}&height=${
        window.innerHeight
      }&count=${5}`
    )
      .then((response) => response.json())
      .then((resp) => setData(resp))
    setIsStarted(true)
  }

  const setClick = (value) => {
    if (value === data[0].correctOrder[0]) {
      data[0].correctOrder.shift()

      if (data[0].correctOrder.length < 1) {
        data.shift()
        setScore(score + 1)
        handleAddTime()
      }
    } else {
      data.length = 0
    }
    const newData = [...data]
    setData(newData)
  }

  return (
    <div>
      {data.length < 1 && <button onClick={fetchData}>Почати гру</button>}
      {data.length < 1 && score > 0 && <h2>рахунок - {score}</h2>}

      {data.length > 0 && (
        <div>
          {' '}
          <h2>рахунок - {score}</h2>
          <h2>{timeLeft} секунд залишилося</h2>
        </div>
      )}
      {data.length > 0 &&
        data[0].taskPoints.map((element, index) => {
          return (
            <Square
              key={element.id}
              click={setClick}
              x={element.x}
              y={element.y}
              value={element.value}
            />
          )
        })}
    </div>
  )
}

export default SquareContainer
