import { Pressable, StyleSheet, Text, View } from 'react-native'
import React, { useEffect, useState } from 'react'
import { NativeStackNavigationProp } from '@react-navigation/native-stack';
import { useNavigation } from '@react-navigation/native';
import { RouteParams } from '../Routes/RootNavigator';
import Pizza from '../models/Pizza';
import OrderService from '../service/OrderService';
import Order from '../models/Order';
import User from '../models/User';



const Footer = (props: any) => {

  const { pizzas, order } = props

    const navigation = useNavigation<NativeStackNavigationProp<RouteParams>>();

    // Constante qui contient le prix total
    const [total, setTotal] = useState(0)

    // Confirme la commande (et va envoyer la commande dans la base de données)
    const ConfirmButton = () => {
        let test = new Order(total, order)
        console.log(test);
       
        // OrderService.addOrder(test)

        navigation.navigate('Final')        
      }

      // Calcul le rpix total des pizzas commander
      useEffect(() => {
        let total = 0;
        order.forEach((item: any) => {
          total +=
            item.quantity * pizzas.find((pizza: Pizza) => pizza.id === item.id).price;
            console.log(item.quantity); 
        });
        setTotal(total)
      }, [order])


  return (
    <View style={styles.footer}>
        <Text style={styles.textPrix}> Total: {total.toFixed(1)}€ </Text>
        <Pressable style={styles.valider} onPress={ConfirmButton}>
            <Text style={styles.textValider}>Valider</Text>
        </Pressable>
    </View>
  )
}

export default Footer

const styles = StyleSheet.create({
    footer: {
        position: 'absolute', 
        width: '100%',
        bottom: 0, 
        alignItems: 'center', 
        justifyContent: 'space-around',
        backgroundColor: '#3b438b',
        height: 80,
        flexDirection: 'row'
      },
      textPrix: {
        color: '#feca57',
        fontSize: 20,
        fontWeight: '600'
      },
      valider: {
        backgroundColor: '#feca57',
        justifyContent: 'center',
        alignItems: 'center',
        borderRadius: 5,
        height: '70%',
        width: '35%'
      },
      textValider: {
        color: '#341f97',
        fontSize: 18,
        fontWeight: '500'
      }
})