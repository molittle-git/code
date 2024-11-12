package Java.lanqiao;
import java.util.Scanner;

public class 分组感染 {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    double p =scan.nextDouble();
    double min=1.0*n;
    int min_index=1;
    for(int k=1;k<=n;k++){
        if(n%k==0){
            double num=k*(1-Math.pow(1-p,k)*n/k+n/k);
            if(num<min){
                min=num;
                min_index=k;
            }
        }
     
    }
    System.out.println(min_index);
    scan.close();

    }
}
