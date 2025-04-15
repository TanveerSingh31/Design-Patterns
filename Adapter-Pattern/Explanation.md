1. Used for interacting two unrelated classes
2. Create Adapter class , that bridges gap b/w the two classes


// Use Cases
If we want to integrate generate report service
But that accepts data in JSON format, but out application logic works with XML
Create adapter class -> that takes care of the conversion logic and invokes the report-service with converted data
Just Invoke the AdapterClass Obj. function -> to generateReport


Solution


// Components

1. Target Interface - Interface that the client code expects to work with.
2. Adaptee Class - This refers to the existing class that needs to be adapted, incompatible with the Client code
3. Adapter Class - Bridges gap b/w Target & Adaptee
                    It implements Target Class Interface.
                    Internally used an instance of Adaptee to perform desired operation



// Working

- Adapter Class implements Target Interface
- Adapter Class delegates the calls to adaptee object with converted data



// Implementation

1. Implement the Adapter Class that implements the Target Interface
2. Adapter Class must create object of Adaptee Class, and call it's method after manipulating the data.
3. Client Code -> Create Data-member of the Adapter Object , Set it in the constructor , as it will be passed while creating the object of client code
                In Client Class -> in Charge Method, internally call method of the adapter object.
                So If I invoke the method of Client Class Object, it will internally invoke method of the Adapter Class -> which in turn converts the data and invokes the Adaptee Class object.

