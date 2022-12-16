import { StyleSheet, Text, View, Image } from 'react-native'
import React, {} from 'react'
import images from '../helpers/images'
import Quantity from './Quantity';



const CardPizza = (props: any) => {
    
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
                <View style={styles.boxPrixQuantite}>
                    <Text style={styles.text}>Quantité : </Text>
                    <Quantity id={pizza.id}  updateValue={updateValue}   /> 
                </View> 
                <View style={styles.boxPrixQuantite}>
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
    // CSS de la carte
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
    boxPrixQuantite: {
        marginHorizontal: 10,
        flexDirection: 'row'
    },
    text: {
        marginHorizontal: 5,
        marginTop: 4.5,
        marginRight: 5
    },
})

