import { View, Text, StyleSheet, LogBox} from 'react-native'
import React, { useState } from 'react'
import { useNavigation } from '@react-navigation/native';
import { RouteParams } from '../Routes/RootNavigator';
import { NativeStackNavigationProp } from '@react-navigation/native-stack';

import CustomInput from '../components/CustomInput'
import CustomButton from '../components/CustomButton'
import Header from '../components/Header';
import { useForm } from 'react-hook-form';
import AuthenticationService from '../service/AuthenticationService';


const LoginPage = () => {
    const navigation = useNavigation<NativeStackNavigationProp<RouteParams>>();

    const {
      control,
      handleSubmit,
      formState: { errors },
      watch
    } = useForm();


    const goNew = () => {
      navigation.navigate('New')
    }

    const [message, setMessage] = useState<string>(' ');

    const goPizza = (data: any) => {
      console.log(data);

     LogBox.ignoreAllLogs();

      setMessage('🍕 Tentative de connexion');
      AuthenticationService.login(watch('identifiant'), watch('mdp') ).then((isAuthenticated: any) => {
          if(!isAuthenticated) {
            setMessage('❌ Identifiant ou mot de passe incorrect.');
            console.log('Erreur à la connexion')
            return;
        }
        setMessage('')
      navigation.navigate('Pizza');


    });
    }

    
  return (
    <>
    <Header  />
    <View style={styles.container}>
      

      <View style={styles.login}>
      {/* IDENTIFIANT */}
      <Text style={styles.text}>Identifiant</Text>
      <CustomInput
        name='identifiant'
        placeholder='Téléphone' 
        type='number'
        control={control}
        rules={{
          required: 'L\'identifiant est obligatoire',
          minLength: {value: 10, message: 'L\'identifiant dois faire 10 caractères minimum'}
        }}
      />
      {/* MOT DE PASSE */}
      <Text style={styles.text}>Mot de passe</Text>
      <CustomInput 
        name='mdp'
        secureTextEntry 
        type='mdp' 
        placeholder='Mot de passe' 
        control={control}
        rules={{
          required: 'Le mot de passe est obligatoire', 
          minLength: {value: 6, message: 'Le mot de passe dois faire 6 caractères minimum'}
        }}
      />

      {/* PAS DE COMPTE */}
      <Text style={styles.new} onPress={goNew} >créer un compte</Text>

      {/* CONNEXION */}
      <CustomButton
          text='Connexion'
          backgroundColor='#feca57'
          color='#341f97'
          align='flex-end'
          onPress={handleSubmit(goPizza)}
        />
      <Text style={{color: '#feca57', margin: 10 }}>{message}</Text>
      </View>
    </View>
    </>
  )
}

const styles = StyleSheet.create({
  container: {
    height: '100%',
    alignItems: 'center',
    backgroundColor: "#3b438b",
    width: '100%'
  },
  text: {
    margin: 10,
    color: '#feca57',
    fontWeight: 'bold',
    fontSize: 20
  },
  login: {
    marginTop: 60,
    width: '60%',
  },
  new: {
    margin: 10,
    color: '#feca57',
    alignSelf: 'flex-end',
    textDecorationLine: 'underline'
  }
})

export default LoginPage