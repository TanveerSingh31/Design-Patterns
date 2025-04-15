// Example
// Application generates XML data, but we want to connect it to class that accepts only JSON data

// This class only works with XML
public class ClientCode {

    int data;
    AdapterClass obj;

    public ClientCode(AdapterClass obj, int data) {
        this.obj = obj;
        this.data = data;
    }

    public void generateReport() {
        System.out.println("Inside Client Code Method");
        System.out.println(data);

        // Invokes method of AdapterClass
        obj.generateReport(data);

    }

}