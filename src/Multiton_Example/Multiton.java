package Multiton_Example;

import java.util.HashMap;

public class Multiton {
    private static HashMap<String,Multiton> employeeHashMap=new HashMap<>();
    private static Object lock=new Object();
    private static HashMap<String,String> databaseHashmap=new HashMap<String, String>(){
        {
            put("1","Shanmugabavan");
            put("2","Saravanan");
            put("3","Navaneethan");
            put("4","Sarangan");
        }};
    private Multiton () {

    }




    public static Multiton getEmployee(String id){
        if (!databaseHashmap.containsKey(id)){
            System.out.println("No database in this keyword");
            return null;
        }
        else if (!employeeHashMap.containsKey(id)){
            synchronized (lock) {
                if (!employeeHashMap.containsKey(id)){
                    employeeHashMap.put(id,new Multiton());
                    System.out.println("Newly added: "+id);
                }
            }
        }
        return employeeHashMap.get(id);
    }
}
