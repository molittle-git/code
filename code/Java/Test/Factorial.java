import java.util.*;
public class Factorial {
    
    public static long factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        return factorial(n - 1) +factorial(n - 2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int number = scanner.nextInt();
        long result = factorial(number);
        System.out.println("f("+ number+") :"+result);
    }
}