package PastPapers._2018._4;

import java.util.ArrayList;

public class Client {
    private ArrayList<String> logFileList;
    private String clientId;
    private ArrayList<String> notCratedOrderList;
    private ArrayList<Order> orderArrayList;

    public Client(String clientId) {
        this.clientId = clientId;
        logFileList=new ArrayList<>();
        notCratedOrderList=new ArrayList<>();
        orderArrayList=new ArrayList<>();
    }

    public void addOrderProxy(String name){
        notCratedOrderList.add(name);
    }

    public void addClientId(String name,String customerId){
        if (notCratedOrderList.contains(name)){
            notCratedOrderList.remove(name);
            logFileList.add(clientId);
            orderArrayList.add(new Order(customerId, name));
        }else{
            logFileList.add(clientId);
            orderArrayList.add(new Order(customerId, name));
        }
    }
}
