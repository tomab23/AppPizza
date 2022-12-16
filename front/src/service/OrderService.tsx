import Order from "../models/Order";
import AuthenticationService from "./AuthenticationService";

export default class OrderService {

  // Récupère la méthode pour ajouter une nouvelle commande dans la base de données
    static async addOrder(order: Order): Promise<Order> {
        return fetch(`http://192.168.1.142:8080/auth/add`, {
          method: 'POST',
          body: JSON.stringify(order),
          headers: { 'Content-Type': 'application/json', 'Authorization': AuthenticationService.jwt}
        })
        .then(response => response.json())
        .catch(error => this.handleError(error));
      }
    
    
      static handleError(error: Error): void {
        console.error(error);
      }
    
}