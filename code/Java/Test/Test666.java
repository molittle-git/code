import java.util.*;
import java.io.*;
public class Test666{
    public static void main(String[]args)throws Exception{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int result=fin(a);
    System.out.println(result);
}
public static int fin(int []a){
    if (a.length == 1){
        return a[0];
    }
    int not=0;
    for(int num:a){
        if(num<0){
            not++;
    }
}
    if(not==a.length){return 0;}
    int max=Integer.MIN_VALUE;
    int count=0;
    for(int i=0;i<a.length;i++){
        count+=a[i];
        max=Math.max(max,count);
        if(count<=0){
            count=0;
        }
    }
    return max;
}
}

