import OrderLine from "./OrderLine";

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


