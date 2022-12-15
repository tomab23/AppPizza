import React from 'react'
import NumericInput from 'react-native-numeric-input'


const Quantity = (props: any) => {

    const { updateValue, id} = props

  return (
    <>
        <NumericInput                    
            minValue={0}
            maxValue={10}
            totalHeight={30}
            totalWidth={90}
            onChange={(value) => updateValue(id, value)}
            rounded={true}
            inputStyle={{justifyContent: "center"}}
            textColor='#3b438b'
            leftButtonBackgroundColor='#feca57'
            rightButtonBackgroundColor='#feca57'
        />
    </>
    
  )
}

export default Quantity