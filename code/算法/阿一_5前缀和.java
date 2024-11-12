package 算法;

import java.util.*;
import java.io.*;
public class 阿一_5前缀和{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
    static StreamTokenizer cin=new StreamTokenizer(br);
    static int N=100010;
    static int []a=new int[N];
    static int []s=new int[N];
    public static void main(String []args)throws IOException{
        cin.nextToken();
        int n=(int)cin.nval;
        cin.nextToken();
        int m=(int)cin.nval;
        for(int i=1;i<=n;i++){cin.nextToken();a[i]=(int)cin.nval;}
        for(int i=1;i<=n;i++)s[i]=s[i-1]+a[i];
        while(m--!=0){
            int l,r;
            cin.nextToken();
            l=(int)cin.nval;
            cin.nextToken();
            r=(int)cin.nval;
    cout.println(s[r]-s[l-1]);
            cout.flush();
        }
        
    }
}