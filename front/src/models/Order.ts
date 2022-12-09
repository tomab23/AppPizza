import OrderLine from "./OrderLine";
import User from "./User";

export default class Order {
    id: number;
    date: Date;
    totalAmount: number;
    user: User;
    lines: Array<OrderLine>;

    constructor(
        id: number,
        date: Date,
        totalAmount: number,
        user: User,
        lines: Array<OrderLine>
    ) {
        this.id = id;
        this.date = date;
        this.totalAmount = totalAmount;
        this.user = user;
        this.lines = lines;
    }

}