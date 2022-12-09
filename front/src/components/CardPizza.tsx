import { StyleSheet, Text, TextInput, View, Image, Pressable } from 'react-native'
import React, { useState } from 'react'
import images from '../helpers/images'



const CardPizza = (props: any) => {


    const { name, description, image, price} = props.pizza;

    const [quantite, setQuantite] = useState(0);
 

    // Quantité de pizza selectionnée
    const addCount = (nombre: any) => {
            setQuantite(quantite + nombre);

        if (nombre < 0) {
            setQuantite(0)
        } if (quantite > 9) {
            setQuantite(0)
        }
      }

    // transformer la quantité en string
    const strQuantite = quantite.toString();

    // Total prix pour une pizza selectionner
    const totalCard = (quantite * price).toFixed(1);

    return (
        <>
        <View style={styles.card}>
            {/* INFORMATION PIZZA */}
            <View style={styles.pizzaInfo}>
                <View style={styles.image}>
                    <Image  source={images[image]} style={{height: "100%", width: '100%'}} resizeMode='cover'/>
                </View>

                {/* description Pizza */}
                <View style={styles.contenu}>
                    <Text style={styles.nom}>{name}</Text>
                    <Text style={styles.info}>{description}</Text>
                </View>
            </View>
            {/* PRIX + COMMANDE */}
            <View style={styles.prixQuantite}>
                <View style={styles.box}>
                    <Text style={styles.text}>Quantité</Text>
                    {/* MOINS, ENLEVE DES PIZZAS */}
                    <Pressable onPress={() => addCount(-1)}>
                    <Text style={styles.add}>-</Text>
                    </Pressable>
                    {/* NOMBRE DE PIZZAS */}
                    <TextInput 
                        style={styles.input} 
                        keyboardType='numeric'
                        placeholder= '0'
                        value= {strQuantite}
                        onChangeText={(newQuantite) => setQuantite(Number(newQuantite))}
                    />
                     {/* PLUS, AJOUTE DES PIZZAS */}
                     <Pressable onPress={() => addCount(+1)}>
                    <Text style={styles.add}>+</Text>
                    </Pressable>
                    {/* Total par carte */}
                    <Text style={{marginLeft: 5, alignSelf: 'center'}}>{totalCard}€</Text>
                </View>
                
                <View style={styles.box}>
                <Text> {price}€ </Text>
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
        marginTop: 5,
        marginRight: 25
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
