import { View, Text, Button, Pressable, StyleSheet } from 'react-native'
import React from 'react'


const CustomButton = (props: any) => {

  const { margin, text, onPress, backgroundColor, textColor, align } = props;

  return (
    <Pressable 
      onPress={onPress}
      style={[styles.container, {margin: margin, backgroundColor: backgroundColor, alignSelf: align}]}
    >
      <Text style={{color: textColor, fontWeight: 'bold'}}> {text} </Text>
    </Pressable>
  )
}

const styles = StyleSheet.create({
    container: {
      width: '60%',
      padding: 10,
      marginVertical: 10,
      alignItems: 'center',
      borderRadius: 5,
    }
  })



export default CustomButton