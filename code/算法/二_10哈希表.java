// import java.util.*;
// import java.io.*;
// public class 哈希表 {
// static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));    
// static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
// static StreamTokenizer cin=new StreamTokenizer(br);
// static int N=100010;
// static int []h=new int [N],ne=new int[N],e=new int[N];
// static int idx;
// static int nextInt()throws IOException{cin.nextToken();return(int)cin.nval;}
// static void insert(int x){
//     int k=(x%N+N)%N;
//     e[idx]=x;
//     ne[idx]=h[k];
//     h[k]=idx++;
// }
// static boolean find(int x){
//     int k=(x%N+N)%N;
//     for(int i=h[k];i!=-1;i=ne[i])
//     if(e[i]==x)return true;
//     return false;
// }
// public static void main(String []args)throws IOException{
//     int n=nextInt();
//     Arrays.fill(h,-1);
//     while(n-->0)
//     {
//         cin.nextToken();
//         String op=cin.sval;
//         int x=nextInt();
//         if(op.equals("I"))insert(x);
//         else cout.print(find(x)?"Yes\n":"No\n");
//     }
// cout.flush();
// }
// }
//开放定址
import java.util.*;
import java.io.*;
public class 二_10哈希表 {
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));    
static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
static StreamTokenizer cin=new StreamTokenizer(br);
static final int N=100010;
static final int NULL=0x3f3f3f;
static int []h=new int [N];
static int n;
static int nextInt()throws IOException{cin.nextToken();return(int)cin.nval;}
static int find(int x){
    int k=(x%N+N)%N;
    while(h[k]!=NULL&&h[k]!=x){
        k++;
        if(k==N)k=0;
    }
    return k;
}
public static void main(String[]args)throws IOException{
    n=nextInt();
    Arrays.fill(h,NULL);
    while(n-->0){
        cin.nextToken();
        String op=cin.sval;
        int x=nextInt();
        int k=find(x);
        if(op.equals("I")){h[k]=x;}
        else cout.print(h[k]!=NULL?"Yes\n":"No\n"); 
        cout.flush();
    }
}
}