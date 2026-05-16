import java.util.HashMap;
public class hashMap {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "hi");
        map.put(2, "bye");
        map.put(3, "see you");
        //System.out.println(map);
        System.out.println(map.get(3));
    }
}
