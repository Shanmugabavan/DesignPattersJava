package PastPapers._2018._3;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WikiPageVersion {
    private String content;
    private int version_id;
    private long saved_time;
    private static HashMap<String, WikiPageVersion> database=new HashMap<>();
    private static ArrayList<Integer> key_list=new ArrayList<Integer>(List.of(1,2,3,4));

    private WikiPageVersion(String content, int version_id, long saved_time) {
        this.content = content;
        this.version_id = version_id;
        this.saved_time = saved_time;
    }

    private static WikiPageVersion getVersionFromDataBase(int id) {
        if (database.containsKey(Integer.toString(id))){
            return database.get(id);
        }else{
            if (key_list.contains(id)){
                //fetching data and create object and return
                String content="";
                int version=id;
                long saved=12;
                database.put(Integer.toString(id),new WikiPageVersion(content,version,saved));
                System.out.println("Newly created id"+id);
                return database.get(id);
            }else{
                System.out.println("No data ");
                return null;
            }

        }
    }
    public static WikiPageVersion getVersion(int id){
        return WikiPageVersion.getVersionFromDataBase(id);
    }
}
