
import java.util.*;

public class queue {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(90);
        q.add(80);
        q.add(1000);
        System.out.print(q.remove());
    }
}
