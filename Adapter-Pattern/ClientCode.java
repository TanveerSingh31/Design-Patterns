// Example
// Application generates XML data, but we want to connect it to class that accepts only JSON data

// This class only works with XML
public class ClientCode {

    int data;
    AdapterClass obj;

    public ClientCode(AdapterClass obj) {
        this.obj = obj;
    }

    public generateReport() {
        obj.generateReport(data);
    }

}