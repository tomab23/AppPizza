import { View, Text, TextInput, StyleSheet, Keyboard } from 'react-native'
import React from 'react'
import { Controller } from 'react-hook-form';


const CustomInput = (props: any) => {

  const { control, name, rules, secureTextEntry, type, placeholder} = props;

  const haut = type === 'adresse' ? 80 : 35;

  const mdp = type === 'mdp' ? false : true;

  const num = type === 'number' ? "numeric" : "default";


  return (
      <Controller 
        control={control}
        name={name}
        rules={rules}
        render={({field: {value, onChange, onBlur}, fieldState: {error}}) => (
          <>
            <View style={[styles.container, {borderColor: error ? '#ff4d4d' : '#3b438b'}]}>
              <TextInput 
                value={value}
                onChangeText={onChange}
                onBlur={onBlur}
                secureTextEntry={secureTextEntry}
                style={[styles.input, {marginLeft: 5, height: haut}]}
                multiline={mdp}
                placeholder={placeholder}
                keyboardType={num}
              />
            </View>
              {error && (
                <Text style={{color: '#ff4d4d', alignSelf: 'stretch', fontWeight: 'bold'}}>{error.message || 'erreur'}</Text>
              )}
          </>
        )}
      />     
  )
}





const styles = StyleSheet.create({
  container: {
    // backgroundColor: 'yellow',
    backgroundColor: 'white',
    borderRadius: 5,
    width: '100%',
    justifyContent: 'flex-start',
    borderWidth: 1,

  },
  input: {
  }
})

export default CustomInput