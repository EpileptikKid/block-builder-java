import React, { useState } from 'react'

const Input = () => {
  const [inputValue, setInputValue] = useState('')

  const handleKeyDown = (event) => {
    if (event.key === 'Enter') {
      console.log('Enter')
    }
  }

  return (
    <div>
      <input
        type="text"
        value={inputValue}
        onChange={(e) => setInputValue(e.target.value)}
        onKeyDown={handleKeyDown}
      />
    </div>
  )
}

export default Input
