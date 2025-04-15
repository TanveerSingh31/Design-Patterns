public class AdapterClass implements TargetInterface {

    //1. Create object of Adaptee Class
    private Report obj = new Report();


    //2. Implement the TargetInterface methods
    @Override
    public void generateReport(int data) {
        System.out.println("Inside Adapter Class");
        System.out.println("Input :" + data );

        // Conversion Logic
        String dataString = new String(Integer.toString(data));

        System.out.println("Output :" + dataString + "  " + dataString.getClass());

        // invoke the Adaptee method with JSON data
        obj.generateReport(dataString);
    }



}