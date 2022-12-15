import OrderLine from "./OrderLine";
import User from "./User";

export default class Order {
    totalAmount: number;
    lines: Array<OrderLine>;

    constructor(
        totalAmount: number,
        lines: Array<OrderLine>
    ) {
        this.totalAmount = totalAmount;
        this.lines = lines;
    }
}


