package PastPapers._2018._4;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Shanmu@25621");
        client.addOrderProxy("Biscuit");
        client.addOrderProxy("Toffee");
        client.addOrderProxy("Fan");
        client.addOrderProxy("Mouse");

        client.addClientId("Biscuit","2344");
        client.addClientId("Fan","4322");


    }
}
