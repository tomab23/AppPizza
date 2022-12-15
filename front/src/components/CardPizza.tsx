import { StyleSheet, Text, TextInput, View, Image, Pressable } from 'react-native'
import React, { useEffect, useState } from 'react'
import images from '../helpers/images'
import NumericInput from 'react-native-numeric-input';
import Quantity from './Quantity';



const CardPizza = (props: any) => {

    // const {id, name, description, image, price } = props.pizza

    const { pizza , updateValue } = props

    
 
    
    


    return (
        <>
        <View style={styles.card}>
            {/* INFORMATION PIZZA */}
            <View style={styles.pizzaInfo}>
                <View style={styles.image}>
                    <Image  source={images[pizza.image]} style={{height: "100%", width: '100%'}} resizeMode='cover'/>
                </View>

                {/* description Pizza */}
                <View style={styles.contenu}>
                     <Text style={styles.nom}>{pizza.name}</Text>
                    <Text style={styles.info}>{pizza.description}</Text> 
                </View>
            </View>
            {/* PRIX + COMMANDE */}
            <View style={styles.prixQuantite}>
                <View style={styles.box}>
                    <Text style={styles.text}>Quantité : </Text>
                    <Quantity id={pizza.id}  updateValue={updateValue}   /> 
                    {/* <Text style={{marginHorizontal: 20}}>{updateValue}</Text> */}
                    {/* <Text>{totalCard}</Text> */}

                </View>
                
                <View style={styles.box}>
                <Text> {pizza.price} € </Text>
                </View>
            </View>
        </View>
        </>



  )
}

export default CardPizza

const styles = StyleSheet.create({
    card: {
        height: 155, 
        width: '95%', 
        marginVertical: 10,
        borderWidth: 1,
        padding: 1,
        alignSelf: 'center'
    },

    pizzaInfo: {
        // comporte les informations sur la pizza
        flexDirection: 'row', 
        height: '70%', 
        width: '100%',
    },
    image: {
        // image de la pizza
        height: '100%',
        width: '30%'
    },
    contenu: {
        // nom et description de la pizza
        height: '100%',
        width: '70%'
    },
    nom: {
        marginLeft: 5,
        fontWeight: 'bold',
        fontSize: 18
    },
    info: {
        margin: 5
    },

    prixQuantite: {
        // quantité + prix
        height: '30%' , 
        width: '100%',
        flexDirection: 'row',
        alignItems: 'center',
        justifyContent: 'space-between'
    },
    box: {
        marginHorizontal: 10,
        flexDirection: 'row'
    },
    text: {
        marginHorizontal: 5,
        marginTop: 4.5,
        marginRight: 5
    },
    add: {
        marginHorizontal: 5,
        fontSize: 20
    },
    input: {
        borderWidth: 1, 
        marginHorizontal: 5, 
        width: '25%',
        paddingLeft: 20
    }
})










function setItem(key: any, string: any, value: any, string1: any, arg4: any[], arg5: (error: Error | null) => undefined) {
    throw new Error('Function not implemented.');
}
// )
