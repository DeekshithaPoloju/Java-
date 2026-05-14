import java.util.*;     
public class multiply {
    public static int calculateSum(int a, int b){
        return a * b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int multiply = calculateSum(a, b);
        System.out.println(multiply);
    }
}
