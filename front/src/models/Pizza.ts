import { Double } from "react-native/Libraries/Types/CodegenTypes";

export default class Pizza {
    id: number;
    name: string;
    description: string;
    image: string;
    price: Double;

    constructor(
        id: number,
        name: string,
        description: string,
        image: string,
        price: Double
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
    }
}