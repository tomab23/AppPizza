import { FlatList, RefreshControl, StyleSheet, View } from 'react-native'
import React, { useCallback, useEffect, useState } from 'react'
import Header from '../components/Header';
import CardPizza from '../components/CardPizza';
import Pizza from '../models/Pizza';
import PizzaService from '../service/PizzaService';
import Footer from '../components/Footer';

const ListPizza = () => {


    const [pizzas, setPizzas] = useState<Pizza[]>([]);
    
    useEffect(() => {
      PizzaService.getPizzas().then(pizzas => setPizzas(pizzas));
    }, []); 

    console.log(pizzas)


    const wait = (timeout: number) => {
      return new Promise(resolve => setTimeout(resolve, timeout));
    }

    const [refreshing, setRefreshing] = useState(false);

    const onRefresh = useCallback(() => {
      setRefreshing(true);
      wait(2000).then(() => setRefreshing(false));
    }, []);


    return (
        <>
            <Header name='Liste des Pizzas' />
            <View style={styles.container}>
                
                <View>
                    <FlatList
                        data={pizzas}
                        renderItem={({item}) => <CardPizza pizza={item} />} 
                        style={{marginBottom: 80}}
                        refreshControl={<RefreshControl
                          colors={["#feca57", "#feca57"]}
                          refreshing={refreshing}
                          onRefresh={onRefresh}
                          progressBackgroundColor="#3b438b"
                        />}
                    />
          
                </View>
            
                {/* FOOTER */}
                <Footer />
            </View>
        </>
      )
}

export default ListPizza

const styles = StyleSheet.create({
    container: {
        flex: 1,
        alignItems: 'center',
        justifyContent: 'center'
    
    }
})



