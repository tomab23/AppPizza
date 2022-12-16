import Order from "./Order";
import Pizza from "./Pizza";

export default class OrderLine {
    id: number
    quantity: number;

    constructor(
        id: number,
        quantity: number
    ) {
        this.id = id;
        this.quantity = quantity;
    }
}