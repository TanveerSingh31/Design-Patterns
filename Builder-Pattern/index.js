// Main class
class Car {

    constructor(BuilderObj) {
        this.name = BuilderObj.name;
        this.type = BuilderObj.type;
        this.model = BuilderObj.model;
        this.color = BuilderObj.color || "Black";
        this.hasVentilatedSeats = BuilderObj.hasVentilatedSeats;
    }

};


// Builder Class 
class CarBuilder {

    // Builder constructor
    constructor(name, type) {
        console.log("data here");
        
        this.name = name;
        this.type = type;
    }


    // custom fn's to set different properties on objects.
    
    setModel(model) {
        this.model = model;
        return this;        // we need to return the current object, so it can access other functions of the obj.
    }

    setColor(color) {
        this.color = color;
        return this;
    }

    setVentilatedSeats() {
        this.hasVentilatedSeats = true;
        return this;
    }


    // build fn. to pass the properties on Builder Obj. to create Car Object
    build() {
        return new Car(this);
    }

};





let car1 = new CarBuilder('Honda', 'SUV')
                .setModel(2022)
                .setColor('Red')
                .setVentilatedSeats()
                .build();

console.log(car1);

let car2 = new CarBuilder('Honda', 'SUV')
                .build();

console.log(car2);

