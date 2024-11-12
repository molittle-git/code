import java.util.*;
import java.io.*;
public class 二_10字符串哈希 {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
    static StreamTokenizer cin=new StreamTokenizer(br);
    static int nextInt()throws IOException{cin.nextToken();return (int)cin.nval;}
    static final int N=100005;
    static final long P=131;
    static int[]a=new int[N]; 
    static long[]h=new long[N];
    static long[]p=new long[N];
    static char[]str=new char[N];
    static int n,m;
    static long get(int l,int r){
        return(long) h[r]-h[l-1]*p[r-l+1];
    }
    public static void main(String[]args)throws IOException
    {
    n=nextInt();
    m=nextInt();
    cin.nextToken();
    String st=cin.sval;
    str=st.toCharArray();
    p[0]=1;
    for(int i=1;i<=n;i++)
    {
    h[i]=h[i-1]*P+str[i-1];
    p[i]=p[i-1]*P;
    }
    while(m-->0){
    int l1,r1,l2,r2;
    l1=nextInt();
    r1=nextInt();
    l2=nextInt();
    r2=nextInt();
    if(get(l1,r1)==get(l2, r2))cout.println("Yes");
    else cout.println("No");
    cout.flush();
    }
    }
}
