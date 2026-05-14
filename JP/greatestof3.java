import java.util.*;
public class greatestof3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a >= b && a >= c){
            System.out.print(a + "is the greatest number");
        }else if(b >= a && b >= c){
            System.out.print(b + "is the greatest number");
        }else if(c >= a && c >= b){
            System.out.print(c + "is the greatest number");
        }
    }
}
