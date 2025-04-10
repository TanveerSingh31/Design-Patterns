// Prototype Pattern
// It allows cloning objects of a class, from it's existing objects


// Issues with Manual Cloning - 

// 1. If some properties of the object are private, we cannot access them outside the class.
// 2. The client cloning the object, must know the class internals, and the code gets dependent on the class (tight-coupling)


// Solution - 

// 1. The clone method present inside the class -> responsible for creating & returning clone of objects.
// 2. Since inside the class, it can access private properties as well.
// 3. Client doesnot need to remember the cloning logic, It exists in class only.