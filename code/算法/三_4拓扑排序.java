import java.util.*;
import java.io.*;
public class 三_4拓扑排序 {
    static StreamTokenizer cin=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
    static final int N=100010;
    static int []h=new int [N],e=new int[N],ne=new int[N];
    static boolean[]st=new boolean[N];
    static int []q=new int [N];
    static int []in=new int [N];
    static int idx=0,hh=0,tt=-1;
    static int n,m;
    static int nextInt()throws IOException{cin.nextToken();return (int)cin.nval;}
    static void add(int a,int b){
        e[idx]=b;ne[idx]=h[a];h[a]=idx++;
    }
    static boolean topo(){
    for(int i=1;i<=n;i++){
        if(in[i]==0)q[++tt]=i;
    }
    while(hh<=tt){
        int t=q[hh++];
        for(int i=h[t];i!=-1;i=ne[i]){
            int j=e[i];
            in[j]--;
            if(in[j]==0)q[++tt]=j;
        }
    }
    return tt==n-1;
    }
    public static void main(String []args)throws IOException{
    n=nextInt();
    m=nextInt();
    Arrays.fill(h,-1);
    while(m-->0){
    int a,b;
    a=nextInt();
    b=nextInt();
    add(a,b);
    in[b]++;
    } 
    if(topo()){
        for(int i=0;i<=tt;i++)cout.print(q[i]+" ");
        cout.println();
    }
    else cout.println(-1);
    cout.flush();
    }
}

