
public class Main {
    public static void main(String [] args) {
        ClientCode clientObj = new ClientCode(new AdapterClass(), 100);
        clientObj.generateReport();
    }
}
