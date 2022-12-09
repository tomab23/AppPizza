export default class User {
    id: number;
    phonenumber: string;
    password: string;
    firstname: string;
    lastname: string;
    address: string;

    constructor(
        id: number,
        phonenumber: string,
        password: string,
        firstname: string,
        lastname: string,
        address: string
    ) {
        this.id = id;
        this.phonenumber = phonenumber;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }
}