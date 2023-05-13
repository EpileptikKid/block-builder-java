import { useEffect, useState } from 'react'
import './square.css'

const Square = ({ x, y, value, click }) => {
  const [style, setStyle] = useState({
    position: 'absolute',
    left: x,
    top: y,
    width: '200px',
    height: '200px',
    display: 'flex',
    justifyContent: 'center',
    alignItems: 'center',
  })
  const [isVisible, setIsVisible] = useState(true)
  const handleClick = () => {
    click(value)
    setIsVisible(false)
  }

  return (
    <>
      {' '}
      {isVisible && (
        <div className="square" style={style} onClick={handleClick}>
          {value}
        </div>
      )}
    </>
  )
}

export default Square
