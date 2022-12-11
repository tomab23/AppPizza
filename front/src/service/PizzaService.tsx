import Pizza from "../models/Pizza";
import User from "../models/User";
import Authentication from "./AuthenticationService";


export default class PizzaService {

    static pizzas:Pizza[];
  
    static getPizzas(): Promise<Pizza[]> {
      // 192.168.1.138
        return fetch('http://192.168.1.14:8080/pizza/', {
          method: "GET",
          headers: { 'Authorization': Authentication.jwt}
          })
        .then(response => response.json())
        .catch(error => this.handleError(error));
    }


  static isEmpty(data: Object): boolean {
    return Object.keys(data).length === 0;
  }

  static handleError(error: Error): void {
    console.error(error);
  }

}