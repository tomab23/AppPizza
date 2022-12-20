import User from "../models/User";
import AuthenticationService from "./AuthenticationService";


export default class UserService {

  // Récupère la méthode pour ajouter un nouvel utilisateur dans la base de données
static async addUser(user: User): Promise<User> {
    return fetch(`http://192.168.1.143:8080/auth/add`, {
      method: 'POST',
      body: JSON.stringify(user),
      headers: { 'Content-Type': 'application/json', 'Authorization': AuthenticationService.jwt}
    })
    .then(response => response.json())
    .catch(error => this.handleError(error));
  }


  static handleError(error: Error): void {
    console.error(error);
  }

}