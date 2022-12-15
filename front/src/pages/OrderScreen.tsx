import { StyleSheet, View } from 'react-native'
import React, { useCallback, useEffect, useState } from 'react'
import Header from '../components/Header';
import Pizza from '../models/Pizza';
import PizzaService from '../service/PizzaService';
import Footer from '../components/Footer';
import {CommonActions, useNavigation } from '@react-navigation/native';
import { NativeStackNavigationProp } from '@react-navigation/native-stack';
import { RouteParams } from '../Routes/RootNavigator';
import PizzaList from '../components/PizzaList';
import OrderLine from '../models/OrderLine';


const OrderScreen = () => {

  const navigation = useNavigation<NativeStackNavigationProp<RouteParams>>();
  
  // Pizza et Liste de pizza
    const [pizzas, setPizzas] = useState<Pizza[]>([]);
    useEffect(() => {
      PizzaService.getPizzas().then(pizzas => setPizzas(pizzas));
    }, []); 

    // parametre pour refresh la page 
    const wait = (timeout: number) => {
      return new Promise(resolve => setTimeout(resolve, timeout));
    }
    const [refreshing, setRefreshing] = useState(false);
    const onRefresh = useCallback(() => {
      setRefreshing(true);
      const resetAction = CommonActions.reset({
        index: 0,
        routes: [{ name: "Pizza" }]
      });
      navigation.dispatch(resetAction);
      wait(2000).then(() => setRefreshing(false));
    }, []);
    
    

    const [order, setOrder] = useState([])


    const updateValue = (id: number, quantity: number) => {  
      let newOrder: any = []

      order
      .filter((pizza: Pizza) => pizza.id !== id)
      .map((pizza) => newOrder.push(pizza))

      newOrder.push(new OrderLine(id, quantity))
      setOrder(newOrder)

    }
    console.log(order);
    
  


    return (
        <>
            <Header name='Liste des Pizzas' />
            <View style={styles.container}>        
                <View>
                  {/* Liste des pizzas */}
                    <PizzaList
                      pizzas={pizzas}
                      refreshing={refreshing}
                      onRefresh={onRefresh}
                      updateValue={updateValue}
                    /> 
                </View>           
                {/* FOOTER */}
                <Footer pizzas={pizzas} order={order} />
            </View>
        </>
      )
}

export default OrderScreen

const styles = StyleSheet.create({
    container: {
        flex: 1,
        alignItems: 'center',
        justifyContent: 'center'
    
    }
})



