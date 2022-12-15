import { Pressable, StyleSheet, Text, View } from 'react-native'
import React, { useEffect, useState } from 'react'
import { NativeStackNavigationProp } from '@react-navigation/native-stack';
import { useNavigation } from '@react-navigation/native';
import { RouteParams } from '../Routes/RootNavigator';
import Pizza from '../models/Pizza';



const Footer = (props: any) => {

  const { pizzas, order } = props

  
  

    const navigation = useNavigation<NativeStackNavigationProp<RouteParams>>();

    const ConfirmButton = () => {
        navigation.navigate('Final')
      }


      const [total, setTotal] = useState(0)

      useEffect(() => {
        let total = 0;

        order.forEach((item: any) => {
          total +=
            item.quantity * pizzas.find((pizza: Pizza) => pizza.id === item.id).price;
            console.log(item.quantity);
            // console.log( pizzas);
            
            
            // pizzas.find((pizza: any) => pizza.id === item.pizza);
            // pizzas.filter((pizza: any) => pizza.id === item.id).find((pizza: any) => pizza.price)
            
            //  
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