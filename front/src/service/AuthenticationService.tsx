import { Alert } from "react-native";
import LoginRequest from "../models/Loginrequest";


export default class AuthenticationService {
    
    static isAuthenticated: boolean;

    static jwt: string;

    // Méthode qui récupère les Login
    static async getJwt(login: LoginRequest): Promise<any> {
      try {
        const response = await fetch(`http://192.168.1.143:8080/auth/signin`, {
          method: 'POST',
          body: JSON.stringify(login),
          headers: { 'Content-Type': 'application/json' }
        });
        if (response.ok) {
          return await response.json();
        } else if (response.status === 401) {
          this.isAuthenticated = false;
          Alert.alert('❌ erreur', 'Identifiant ou mot de passe incorrect.',[{style:'cancel'}]);
          console.log('Connexion impossible')
        }
      } catch (error) {
        this.isAuthenticated = false;
      }
    }
  
  // Méthode qui test les Login de la base, pour pouvoir connecter l'utilsateur
    static async login(username: string, password: string): Promise<boolean> {
  
      await this.getJwt(new LoginRequest(username, password))
        .then(response => this.jwt = response.tokenHeader + ' ' + response.token);
  
        console.log(this.jwt);
  
  
      const isAuthenticated = this.jwt != undefined;
  
      return new Promise(resolve => {
        setTimeout(() => {
          this.isAuthenticated = isAuthenticated;
          resolve(isAuthenticated);
        }, 1000);
      });
  
    }
  
    static handleError(error: Error): void {
      this.isAuthenticated = false;
    }
}