// import java.util.*;
// import java.io.*;
// public class 堆排序 {
// static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));    
// static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
// static StreamTokenizer cin=new StreamTokenizer(br);
// static int N=100010;
// static int []h=new int [N];
// static int m,n,len;
// static int nextInt()throws IOException{cin.nextToken();return(int)cin.nval;}
// static void down(int i)
// {int t=i;
//     if(i*2<=len&&h[i*2]<h[t])t=i*2;
//     if(i*2+1<=len&&h[i*2+1]<h[t])t=i*2+1;
//     if(i!=t){
//         //swap(h[i],h[t]);
//         int temp=h[i];
//         h[i]=h[t];
//         h[t]=temp;
//         down(t);
//     }
// }
// public static void main(String[]args)throws IOException{
//     n=nextInt();
//     m=nextInt();
//     for(int i=1;i<=n;i++){h[i]=nextInt();}
//     len=n;
//     for(int i=n/2;i!=0;i--){down(i);}
//     while(m-->0){
//         cout.print(h[1]+" ");
//         h[1]=h[len];
//         len--;
//         down(1);
//     }
//     cout.flush();
// }
// }
//模拟堆（高级操作）
import java.util.*;
import java.io.*;
public class 二_9堆 {
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));    
static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
static StreamTokenizer cin=new StreamTokenizer(br);
static int N=100010;
static int []h=new int [N],hp=new int[N],ph=new int[N];
//hp下标第几个插入，ph第几个插入的下标
static int m,n,len;
static int nextInt()throws IOException{cin.nextToken();return(int)cin.nval;}
static void swap(int []a,int i,int j){
    int temp=a[i];
    a[j]=a[j];
    a[j]=temp;
}
    static void heap_swap(int a,int b){
    swap(ph,hp[a],hp[b]);
    swap(hp,a,b);
    swap(h,a,b);
}
static void down(int i){
    int t=i;
    if(i*2<=len&&h[2*i]<h[t])t=2*i;
    if(i*2+1<=len&&h[2*i+1]<h[t])t=2*i+1;
    if(t!=i){heap_swap(i,t);down(t);}
}
static void up(int i){
    while(i/2!=0&&h[i]<h[i/2]){
    heap_swap(i, i/2);
    i/=2;
    }
}
public static void main(String []args)throws IOException{
    int n=nextInt();
    while(n-->0){
        cin.nextToken();
        String op=cin.sval;
        if(op.equals("I")){
            int x=nextInt();
            len++;
            m++;
            ph[m]=len;
            hp[len]=m;
            h[len]=x;
            up(len);}
            else if(op.equals("PM"))
            cout.println(h[1]);
            else if(op.equals("DM"))
            {
            heap_swap(1,len);
            len--;
            down(1);
            }else if(op.equals("D")){
                int k=nextInt();
                k=ph[k];
                heap_swap(k,len);
                len--;
                down(k);up(k);
            }else{
                int k=nextInt();
                int x=nextInt();
                k=hp[k];
                h[k]=x;
                down(k);
                up(k);
            }
}
cout.flush();
    }
}