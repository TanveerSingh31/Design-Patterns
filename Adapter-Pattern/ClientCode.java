// Example
// Application generates XML data, but we want to connect it to class that accepts only JSON data

public class ClientCode {

    int data;
    Adapter obj;

    public ClientCode(Adapter obj) {
        this.obj = obj;
    }

    public convert() {
        obj.convert(data);
    }

}