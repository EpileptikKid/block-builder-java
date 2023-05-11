import { useEffect, useState } from 'react'

const Square = ({ x, y }) => {
  const [style, setStyle] = useState({})
  useEffect(() => {
    console.log(x)
    console.log(y)
    setStyle({
      position: 'absolute',
      left: x,
      top: y,
      width: '100px',
      height: '100px',
      display: 'flex',
      justifyContent: 'center',
      alignItems: 'center',
      border: '2px solid red',
    })
    console.log(style)
  }, [])

  return <div style={style}>Square</div>
}

export default Square
