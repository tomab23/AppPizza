import OrderLine from "../models/OrderLine";
import AuthenticationService from "./AuthenticationService";


export default class OrderLineService {

  // Récupère la méthode pour ajouter une nouvelle ligne de commande dans la base de données
    static async addLine (line: OrderLine): Promise<OrderLine> {
        return fetch(`http://192.168.1.143:8080/pizza/add/line`, {
          method: 'POST',
          body: JSON.stringify(line),
          headers: { 'Content-Type': 'application/json', 'Authorization': AuthenticationService.jwt}
        })
        .then(response => response.json())
        .catch(error => this.handleError(error));
      }
    
    
      static handleError(error: Error): void {
        console.error(error);
      }
    
    }