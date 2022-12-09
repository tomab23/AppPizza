
import { StyleSheet, SafeAreaView} from 'react-native';
import RootNavigator from './src/Routes/RootNavigator';
import React from 'react';
import { StatusBar } from 'expo-status-bar';


const App = () => {
  return (
    <SafeAreaView style={styles.root}>
      <RootNavigator />
      <StatusBar style='light' backgroundColor='#3b438b' translucent={false} />
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  root: {
    flex: 1,
  }
});

export default App;


