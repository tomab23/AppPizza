import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { useNavigation } from '@react-navigation/native';
import { NativeStackNavigationProp } from '@react-navigation/native-stack';
import { RouteParams } from '../Routes/RootNavigator';
import Header from '../components/Header';


const Bienvenue = () => {
    const navigation = useNavigation<NativeStackNavigationProp<RouteParams>>();

    const GoNew = () => {
      navigation.navigate('Pizza')
    }

    
  return (
    <>
    <Header  />
    <View style={styles.container}>
      

      <View style={styles.login}>
      <Text style={styles.text}>Félicitation !</Text>
      <Text style={styles.text}>Vous êtes prêt à commander.</Text>

      <Text style={styles.new} onPress={GoNew} >Passez votre première commande</Text>


      </View>

    </View>
    </>
  )
}


export default Bienvenue

const styles = StyleSheet.create({
    container: {
      height: '100%',
      alignItems: 'center',
      backgroundColor: "#3b438b",
      width: '100%'
    },
    text: {
      marginBottom: 50,  
      color: '#feca57',
      fontWeight: 'bold',
      fontSize: 50,
      textAlign: 'center'
    },
    login: {
      marginTop: 60,
    },
    new: {
      marginTop: '45%',
      color: '#feca57',
      textDecorationLine: 'underline',
      fontSize: 30,
      textAlign: 'center'
    }
  })