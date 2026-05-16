import java.util.*;
public class stack {
   public static void main(String[] args){
    Stack<Integer> s = new Stack<>();
    s.push(10);
    s.push(20);
    s.push(10);
    s.push(90);
    System.out.println(s.pop());
    System.out.println(s.peek());
    System.out.println(s.isEmpty());
    System.out.println(s.size());
   } 
}
