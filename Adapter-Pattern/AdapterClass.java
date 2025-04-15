public class AdapterClass implements TargetInterface {

    //1. Create object of Adaptee Class
    Report obj = new Report();


    //2. Implement the TargetInterface

    @Override
    public void generateReport(int data) {
        // Convert XML to JSON
        String dataString = new String(data);

        // invoke the Adaptee method with JSON data
        obj.generateReport(dataString);
    }



}