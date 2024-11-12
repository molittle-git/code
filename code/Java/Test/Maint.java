import java.util.Scanner;
public class Maint{
    public static long[][][]s=new long[25][25][25];
    public static boolean[][][]check=new boolean[25][25][25];
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        while(true){
            String line=sc.nextLine();
            String[]parts=line.split(" ");
            long a=Long.parseLong(parts[0]);
            long b=Long.parseLong(parts[1]);
            long c=Long.parseLong(parts[2]);
            if(a==-1&&b==-1&&c==-1){
                break;
            }
            System.out.println("w("+a+","+b+","+c+") = "+w(a,b,c));
        }
        sc.close();
    }
    public static long w(long a,long b,long c){
        if(a<=0||b<=0||c<=0){
            return 1;
        }
        if(a>20||b>20||c>20){
            return w(20,20,20);
        }
        int ta=(int)a;
        int tb=(int)b;
        int tc=(int)c;
    if(check[ta][tb][tc]){
        return s[ta][tb][tc];
    }
    check[ta][tb][tc]=true;
    if(a<b&&b<c){
        s[ta][tb][tc]=w(a,b,c-1)+w(a,b-1,c-1)-w(a,b-1,c);
    }else{
        s[ta][tb][tc]=w(a-1,b,c)+w(a-1,b-1,c)+w(a-1,b,c-1)-w(a-1,b-1,c-1);
    }
    return s[ta][tb][tc];
    }
}