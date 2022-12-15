
export default class OrderService {

    // static async addUser(user: User): Promise<User> {
    //     return fetch(`http://192.168.1.142:8080/auth/add`, {
    //       method: 'POST',
    //       body: JSON.stringify(user),
    //       headers: { 'Content-Type': 'application/json', 'Authorization': AuthenticationService.jwt}
    //     })
    //     .then(response => response.json())
    //     .catch(error => this.handleError(error));
    //   }
    
    
      static handleError(error: Error): void {
        console.error(error);
      }
    
}