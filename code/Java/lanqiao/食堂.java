package Java.lanqiao;
import java.util.Scanner;

public class 食堂{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            int a=scan.nextInt();
            int b=scan.nextInt();
            int c=scan.nextInt();
            int d=scan.nextInt();
            int e=scan.nextInt();
            int ans=0;
            while(b>1&&e>0){
               
                b-=2;
                e-=1; ans+=6;
            }
            while(a>0&&c>0&&e>0){
               
                c--;
                a--;
                e--; ans+=6;
            }
            while(a>2&&e>0){
              
                a-=3;
                e-=1;  ans+=6;
            }
            while(a>0&&b>0&&e>0){
              
                a--;b--;
                e--;  ans+=5;
            }
            while(c>0&&e>0){
                c--;
                e--; ans+=4;
            }
            while(a>1&&e>0){
                a-=2;
                e--;ans+=4;
            }while(b>0&&e>0){
                b--;
                e--;ans+=3;
            }while(a>0&&e>0)
            {
                a--;e--; ans+=2;
            }while(c>0&&d>0){
                c--;
                d--;ans+=4;
            }while(a>1&&d>0){
                a-=2;
                d--;
                ans+=4;
            }while(b!=0&&d>0){
                a-=1;
                b-=1;
                ans+=3;
            }while(a!=0&&d>0){
                d--;
                a--; ans+=2;
            }
        System.out.println(ans);
        }
        scan.close();
    }
}