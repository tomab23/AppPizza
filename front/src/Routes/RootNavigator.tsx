import React from 'react'
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import { NavigationContainer } from '@react-navigation/native';
import LoginPage from '../pages/LoginPage';
import New from '../pages/New';
import Bienvenue from '../pages/Bienvenue';
import Final from '../pages/Final';
import ListPizza from '../pages/ListPizza';


export type RouteParams = {
  LoginPage: undefined;
  New: undefined;
  Bienvenue: undefined;
  Pizza: undefined;
  Final: undefined;

}
const Stack = createNativeStackNavigator<RouteParams>();

const Navigation = () => {
  return (
    <NavigationContainer>
      <Stack.Navigator screenOptions={{headerShown: false}}>
        <Stack.Screen name="LoginPage" component={LoginPage} options={{animation: 'slide_from_left'}}/> 
        <Stack.Screen name='Pizza' component={ListPizza} />
        <Stack.Screen name="New" component={New}  options={{ animation: 'slide_from_right'}}  />
        <Stack.Screen name="Bienvenue" component={Bienvenue}   />
        <Stack.Screen name="Final" component={Final}/>
      </Stack.Navigator>
    </NavigationContainer>
  );
}

export default Navigation