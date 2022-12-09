import { Pressable, StyleSheet, Text, View } from 'react-native'
import React, { useEffect, useState } from 'react'
import { NativeStackNavigationProp } from '@react-navigation/native-stack';
import { useNavigation } from '@react-navigation/native';
import { RouteParams } from '../Routes/RootNavigator';



const Footer = () => {

    const navigation = useNavigation<NativeStackNavigationProp<RouteParams>>();

    const ConfirmButton = () => {
        navigation.navigate('Final')
      }


      // const reducer = (accumulator: any, currentValue: any) => accumulator + currentValue;
      // const total = tab.reduce(reducer)


  return (
    <View style={styles.footer}>
        <Text style={styles.textPrix}> Total: FREE
        {/* € */}
        </Text>
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