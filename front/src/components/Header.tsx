import { View, Text, StyleSheet, Image, TouchableHighlight } from 'react-native'
import React from 'react'
import { CommonActions, useNavigation } from '@react-navigation/native';
import { NativeStackNavigationProp } from '@react-navigation/native-stack';
import { RouteParams } from '../Routes/RootNavigator';


const Header = (props: any) => {

  const navigation = useNavigation<NativeStackNavigationProp<RouteParams>>()

  const { name } = props;

  // Ramène à la page 'LoginScreen' en rechargeant la page
  const GoLogin = () => {
    const resetAction = CommonActions.reset({
      index: 0,
      routes: [{ name: "LoginPage" }]
    });
    navigation.dispatch(resetAction);
  }

  return (
    <View style={styles.container}>
      <TouchableHighlight onPress={GoLogin}>
        <Image source={require('../assets/img/logo.png')} resizeMode='contain' style={styles.img} />
      </TouchableHighlight>
      <Text style={styles.text}>{name}</Text>
    </View>
  )
}

const styles = StyleSheet.create({
    container: {
        flexDirection: 'row',
        height: 80,
        width: '100%',
        backgroundColor: '#3b438b',
        justifyContent: 'flex-start',
        alignItems: 'center',
    },
    img: {
      height: 80, 
      width: 80,
    },
    text: {
      color: '#feca57', 
      marginLeft: '10%', 
      fontWeight: 'bold', 
      fontSize: 20
    }
})

export default Header