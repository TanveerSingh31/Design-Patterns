// Ideally , we must create an interface with clone() method, but JS doesnot support interfaces

class Student {

    name;
    age;
    rollNumber;
    #password; // private property
    otherDetails;

    constructor(name, age, rollNumber, password, otherDetails) {

        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.#password = password;
        this.otherDetails = otherDetails;
    }


    // clone method - responsible for creating new object with same values , as object via it is called.
    clone() {
        return new Student(this.name, this.age, this.rollNumber, this.#password, this.otherDetails);
    }

};




let s1 = new Student('Tanveer', 23, 1234, 'xyz', {a: 1000, b: 2000});

let s2 = s1.clone();
let s3 = s2.clone();



console.log(s1);
console.log(s2);
console.log(s3);
