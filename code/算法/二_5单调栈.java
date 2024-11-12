import java.util.*;
import java.io.*;
public class 二_5单调栈 {
    static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter cout =new PrintWriter(new OutputStreamWriter(System.out));
    static StreamTokenizer cin=new StreamTokenizer(br);
    static int N=100010;
    static int tt;
    static int []a=new int [N];
    public static int nextInt()throws IOException{cin.nextToken();return (int)cin.nval;}
    public static void main(String[] args) throws IOException{
    int n=nextInt();
      for(int i=0;i<n;i++){
        int x = nextInt();
        while(tt!=0&&a[tt]>=x)tt--;
        if(tt!=0){cout.print(a[tt]+" ");
        cout.flush();}
        else {cout.print("-1 ");
        cout.flush();}
        a[++tt]=x;}
    }
    }

