import java.util.HashMap;

public class hasmap {
    public static void main(String[] args) {
        HashMap<String , Integer> map= new HashMap<>();
        map.put("id0",1);
        map.put("id2",2);
        map.put("id3",3);
        for (String key :map.keySet()){
            System.out.println(key);
        }
    }
}
