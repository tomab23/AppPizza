import Order from "./Order";
import Pizza from "./Pizza";

export default class OrderLine {
    id: number;
    order: Order;
    pizza: Pizza;
    quantity: number;

    constructor(
        id: number,
        order: Order,
        pizza: Pizza,
        quantity: number
    ) {
        this.id = id;
        this.order = order;
        this.pizza = pizza;
        this.quantity = quantity;
    }
}