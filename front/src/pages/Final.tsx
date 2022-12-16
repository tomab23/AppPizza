import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { useNavigation, CommonActions } from '@react-navigation/native';
import { NativeStackNavigationProp } from '@react-navigation/native-stack';
import { RouteParams } from '../Routes/RootNavigator';
import Header from '../components/Header';


const Final = () => {
    
    const navigation = useNavigation<NativeStackNavigationProp<RouteParams>>();

    // Ramène vers la liste des pizzas et recharge la page 'OrderScreen' 
    const Confirm = () => {
      const resetAction = CommonActions.reset({
        index: 0,
        routes: [{ name: "Pizza" }]
      });
      navigation.dispatch(resetAction);
      }

    
  return (
    <>
      <Header  />
      <View style={styles.container}>
          <View style={styles.login}>
              <Text style={styles.text}>Votre commande est en cours de préparations.</Text>
              <Text style={styles.text}>Elle sera livrée dans 30 minutes</Text>
              <Text style={styles.new} onPress={Confirm} >Retour à la page commande</Text>
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
        marginBottom: 50,  
        color: '#feca57',
        fontWeight: 'bold',
        fontSize: 40,
        textAlign: 'center'
      },
      login: {
        marginTop: 60,
      },
      new: {
        marginTop: '40%',
        color: '#feca57',
        textDecorationLine: 'underline',
        fontSize: 25,
        textAlign: 'center'
      }
})

export default Final;