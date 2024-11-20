import java.io.*;
import java.util.*;
public class 二_1单链表{
    static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
    static int N=100010;
    static int[]e=new int[N];
    static int[]ne=new int[N];
    static int h=-1,idx;
    static void add_h(int v){
        e[idx]=v;
        ne[idx]=h;
        h=idx++;
    }
    static void add(int k,int v){
        e[idx]=v;
        ne[idx]=ne[k];
        ne[k]=idx++;
    }
    static void del(int k){
        ne[k]=ne[ne[k]];
    }
    public static void main(String[]args)throws IOException{
        int m=Integer.parseInt(in.readLine());
        while(m-->0){
            String[]arr=in.readLine().split(" ");
            String op=arr[0];
            if(op.equals("H")){
                int v=Integer.parseInt(arr[1]);
                add_h(v);
            }
            else if(op.equals("I")){
                int k=Integer.parseInt(arr[1]);
                int v=Integer.parseInt(arr[2]);
                add(k-1,v);
            }else{
                int k=Integer.parseInt(arr[1]);
                if(k==0)h=ne[h];
                else del(k-1);
            }
        }
        for(int i=h;i!=-1;i=ne[i]){cout.print(e[i]+" ");cout.flush();}
    }
}