import java.util.*;
import java.io.*;
public class 阿一_6差分{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
    static StreamTokenizer cin =new StreamTokenizer(br);
    static int N=100010;
    static int []a=new int[N];
    static int []b=new int[N];
    public static void insert(int l,int r,int c){
        b[l]+=c;
        b[r+1]-=c;
    }
    public static void main(String[]args)throws IOException{
        cin.nextToken();
        int n=(int)cin.nval;
        cin.nextToken();
        int m=(int)cin.nval;
        for(int i=1;i<=n;i++){cin.nextToken();a[i]=(int)cin.nval;}
        for(int i=1;i<=n;i++){insert(i,i,a[i]);}
        while(m--!=0){
            int l,r,c;
            cin.nextToken();
            l=(int)cin.nval;
            cin.nextToken();
            r=(int)cin.nval;
            cin.nextToken();
            c=(int)cin.nval;
            insert(l,r,c);
        }
        for(int i=1;i<=n;i++){b[i]+=b[i-1];}
        for(int i=1;i<=n;i++){cout.printf(b[i]+" ");
            cout.flush();
        }
        
    }
}