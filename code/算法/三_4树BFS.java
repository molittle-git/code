import java.util.*;
import java.io.*;
public class 三_4树BFS{
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static PrintWriter cout=new PrintWriter (new OutputStreamWriter(System.out));
static StreamTokenizer cin=new StreamTokenizer(br);
static final int N=100010;
static int []h=new int [N],e=new int[N],ne=new int[N];
static boolean[]st=new boolean[N];
static int []q=new int [N];
static int d[]=new int[N];
static int hh,tt=-1;
static int idx,n,m;
static int nextInt()throws IOException{cin.nextToken();return (int)cin.nval;}
static void add(int a,int b){
    e[idx]=b;ne[idx]=h[a];h[a]=idx++;
}
static int bfs(){
    q[++tt]=1;
    d[1]=0;
    while(hh<=tt){
        int t=q[hh++];
        for(int i=h[t];i!=-1;i=ne[i]){
            int j=e[i];
            if(d[j]==-1){
                d[j]=d[t]+1;
                q[++tt]=j;
            }
        }
    }
    return d[n];
}
public static void main(String []args)throws IOException{
n=nextInt();
m=nextInt();
Arrays.fill(h,-1);
Arrays.fill(d,-1);
for(int i=0;i<m;i++){
    int a,b;
    a=nextInt();
    b=nextInt();
    add(a,b);
}
cout.println(bfs());
cout.flush();
}
}
