import { FlatList, RefreshControl } from 'react-native'
import React, {} from 'react'
import CardPizza from './CardPizza'


const PizzaList = (props: any) => {

    const { pizzas, onRefresh, refreshing, updateValue} = props
    
    


  return (
    <FlatList
    data={pizzas}
    renderItem={({item}) => <CardPizza pizza={item} updateValue={updateValue}/>} 
    style={{marginBottom: 80}}
    refreshControl={<RefreshControl
      colors={["#feca57", "#feca57"]}
      refreshing={refreshing}
      onRefresh={onRefresh}
      progressBackgroundColor="#3b438b"
    />}
/>  
  )
}

export default PizzaList