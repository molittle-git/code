import java.io.*;
import java.util.*;
public class Test{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
    static StreamTokenizer cin =new StreamTokenizer(br);
    static int N=100010;
    static int[] p=new int[N];
    static int[]cnt=new int[N];
    static int n,m,a,b;
    static int nextInt()throws IOException{cin.nextToken();return (int)cin.nval;}

    public static void main(String []args)throws IOException{
        String op=br.readLine();
        cout.println(op);
        cout.flush();
        if(op.equals("M"))cout.println("OK");cout.flush();
    }
    }  