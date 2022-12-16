import { View, Text, TextInput, StyleSheet, Keyboard } from 'react-native'
import React from 'react'
import { Controller } from 'react-hook-form';


const CustomInput = (props: any) => {

  const { control, name, rules, secureTextEntry, type, placeholder} = props;

  // Si input est de type adresse, alors la hauteur fera 80px sinon elle fera 35px
  const haut = type === 'adresse' ? 80 : 35;

  // Si input est de type mot de passe, alors il n'est pas multiline
  const mdp = type === 'mdp' ? false : true;

  // Si input est de type number, alors il est en phone-pad sinon il est en default
  const num = type === 'number' ? "phone-pad" : "default";


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