import java.util.*;
import java.io.*;
public class 二_6滑动窗口 {
        static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        static PrintWriter cout =new PrintWriter(new OutputStreamWriter(System.out)); 
        static StreamTokenizer cin=new StreamTokenizer(br);
static int []a=new int[100005],q=new int[100005];
static int n,k;
static int nextInt()throws IOException{cin.nextToken();return (int)cin.nval;}
    public static void main(String []args)throws IOException{
        n=nextInt();
        k=nextInt();
        for(int i=0;i<n;i++){a[i]=nextInt();}
        int hh=0,tt=-1;
        for(int i=0;i<n;i++){
            if(hh<=tt&&i-k+1>q[hh])hh++;
            while(hh<=tt&&a[q[tt]]>=a[i])tt--;
            q[++tt]=i;
            if(i>=k-1)cout.print(a[q[hh]]+" ");
            cout.flush();
        }
}
}
