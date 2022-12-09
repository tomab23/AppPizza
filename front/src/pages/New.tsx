import { RefreshControl, ScrollView, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useCallback, useState } from 'react'
import Header from '../components/Header'

import CustomButton from '../components/CustomButton'
import CustomInput from '../components/CustomInput'
import { useNavigation } from '@react-navigation/native'
import { NativeStackNavigationProp } from '@react-navigation/native-stack'
import { RouteParams } from '../Routes/RootNavigator'
import { Controller, Field, useForm } from 'react-hook-form'
import User from '../models/User'
import UserService from '../service/UserService'
import AuthenticationService from '../service/AuthenticationService'


const New = () => {

    const navigation = useNavigation<NativeStackNavigationProp<RouteParams>>();
    

    const {
      control,
      handleSubmit,
      watch,
      formState: { errors },
    } = useForm();

    const mdp = watch('password');

    const login = () => {
      AuthenticationService.login(watch('phonenumber'), watch('password') ).then((isAuthenticated: any) => {
        if(!isAuthenticated) {
          console.log('SA MORCHE PO')
          return;
      }
        navigation.navigate('Bienvenue')
    });
    }

    // Ajoute l'utilisateur a la base de donnée + connecte l'utilisateur a l'application
    const Creation = (data: any) => {
       UserService.addUser(data).then(login);

    }

  return (
    <View style={styles.container}>
      <Header name='Creation de compte'/>
      <ScrollView style={styles.scroll} showsVerticalScrollIndicator={false}>
        {/* NOM */}
        <Text style={styles.text}>Nom</Text>
        <CustomInput
          name='lastname'
          placeholder='Votre nom' 
          control={control}
          rules={{
            required: 'Votre nom est obligatoire',
            minLength: {value: 2, message: 'Le nom doit contenir au minimum 2 caractères'}
          }}
        />

        {/* PRENOM */}
        <Text style={styles.text}>Prénom</Text>
        <CustomInput 
          name='firstname' 
          placeholder='Votre prénom' 
          control={control}
          rules={{
            required: 'Votre prénom est obligatoire',
            minLength: {value: 2, message: 'Le prénom doit contenir au minimum 2 caractères'}
          }}      
        />

        {/* MOT DE PASSE  */}
        <Text style={styles.text}>Mot de passe</Text>
        <CustomInput 
        name='password'
        secureTextEntry 
        type='mdp' 
        placeholder='Votre mot de passe' 
        control={control}
        rules={{
          required: 'Le mot de passe est obligatoire',
          minLength: {value: 6, message: 'Le mot de passe dois faire 6 caractères minimum'}      
      }}         
        />

        {/* CONFIRME MOT DE PASSE */}
        <Text style={styles.text}>Confirmation</Text>
        <CustomInput 
        name='confirmPassword'
        secureTextEntry 
        type='mdp'
        placeholder='Confirmation du mot de passe' 
        control={control}
        rules={{
          required: 'Confirmer le mot de passe est obligatoire',
          minLength: {value: 6, message: 'Le mot de passe dois faire 6 caractères minimum'},
          validate: (value: string) => value === mdp ? true : 'Le mot de passe ne correspond pas'
        }}         
        />

        {/* NUMERO TELEPHONE */}
        <Text style={styles.text}>Téléphone</Text>
        <CustomInput
          name='phonenumber'
          type='number'
          placeholder='Téléphone' 
          control={control}
          rules={{required: 'Le numéro de téléphone est obligatoire',
          minLength: {value: 10, message: 'Le numéro dois faire 10 caractères minimum'},}} 
        />

        {/* ADRESSE */}
        <Text style={styles.text}>Adresse</Text>
        <CustomInput 
          name='address'
          type='adresse'
          placeholder='Votre Adresse pour la livraison' 
          control={control}
          rules={{required: 'L\'adresse est obligatoire'}}         
        />

        {/* BOUTON  VALIDER */}
        <CustomButton
            text='Créer'
            backgroundColor='#feca57'
            color='#341f97'
            align='flex-end'
            onPress={handleSubmit((data) => Creation(data))}
        />  
    </ScrollView>
    </View>
  )
}



export default New

const styles = StyleSheet.create({
    container: {
      backgroundColor: '#3b438b', 
      height: '100%'
    },
    text: {
        margin: 10,
        color: '#feca57',
        fontWeight: 'bold',
        fontSize: 17
    },
    scroll: {
      width: '80%', 
      marginLeft: '5%', 
      marginTop: '5%'
    }

})


