package PastPapers._2018._4;

public class Order {
    private String customerId;
    private String name;

    public Order(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        System.out.println("Object "+name+customerId+" just created");
    }
}
