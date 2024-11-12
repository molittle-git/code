
// import java.util.Scanner;

// public class 并查集 {
//     static final int N = 100005;
//     static int[] p = new int[N];
//     static int n, m;

//     static int find(int x) {
//         if (p[x] != x)
//             p[x] = find(p[x]);
//         return p[x];
//     }

//     static void merge(int a, int b) {
//         if (find(a) == find(b))
//             return;
//         p[find(a)] = find(b);
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         n = scanner.nextInt();
//         m = scanner.nextInt();

//         for (int i = 1; i <= n; i++)
//             p[i] = i;

//         while (m-- > 0) {
//             String op = scanner.next();
//             int a = scanner.nextInt();
//             int b = scanner.nextInt();

//             if (op.equals("M"))
//                 merge(a, b);
//             else{if(find(a) == find(b)){System.out.println("yes");}else System.out.println("on");
                
//         }
//     }
//     }
// }
// import java.io.*;
// import java.util.*;

// public class 并查集 {
//     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));
//     static StreamTokenizer cin = new StreamTokenizer(br);
//     static int N = 100010;
//     static int[] p = new int[N];
//     static int[] cnt = new int[N];
//     static int n, m, a, b;

//     static int nextInt() throws IOException {
//         cin.nextToken();
//         return (int) cin.nval;
//     }

//     // 找祖宗结点
//     static int find(int x) {
//         if (p[x] != x) p[x] = find(p[x]);
//         return p[x];
//     }

//     static void merge(int a, int b) {
//         if (find(a) == find(b)) return;
//         cnt[find(b)] += cnt[find(a)];
//         p[find(a)] = find(b);
//     }

//     public static void main(String[] args) throws Exception {
//         n = nextInt();
//         m = nextInt();
//        for (int i = 1; i <= n; i++) p[i] = i;
//         while (m-- > 0) {
//             cin.nextToken();
//             String op =cin.sval;
//             a = nextInt();
//             b = nextInt();
//             if(op.equals("M")) {
//                 merge(a,b);
//             } else {
//                  if (find(a) == find(b)) {
//                     cout.println("yes");
//                  } else {
//                     cout.println("no");
//                 }
//             }
//             cout.flush();
//         }
//         br.close();
//     }
// }
// import java.io.*;
// import java.util.*;
// public class 并查集 {
//     static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//     static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
//     static StreamTokenizer cin =new StreamTokenizer(br);
//     static int N=100010;
//     static int[] p=new int[N];
//     static int[]cnt=new int[N];
//     static int n,m,a,b;
//     static int nextInt()throws IOException{cin.nextToken();return (int)cin.nval;}
// //找祖宗结点
// static int find (int x) {
// if(p[x]!=b)p[x]=find(p[x]);
// return p[x];
// }
// static void merge(int a,int b){if(find(a)==find(b))return ;
//     cnt[find(b)]+=cnt[find(a)];
//     p[find(a)]=find(b);}
// public static void main(String[] args) throws Exception {
//         n=nextInt();
//         m=nextInt();
//         for(int i=1;i<=n;i++)p[i]=i;
//         while(m-->0){
//             String op=br.readLine();
//             a=nextInt();
//             b=nextInt();
//             if (op.equals("M")){merge(a, b);}
//             else{
//                 if(find(a)==find(b)){cout.println("yes");cout.flush();}
//             else
//             {cout.println("no");cout.flush();}
//         }
//         }
//         cout.flush();
//         br.close();
//     }
// }

import java.io.*;
import java.util.*;
public class 二_8并查集 {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
    static StreamTokenizer cin =new StreamTokenizer(br);
    static int N=100010;
    static int[] p=new int[N];
    static int[]cnt=new int[N];
    static int n,m;
    static int nextInt()throws IOException{cin.nextToken();return(int)cin.nval;}
    static int find(int x){if(p[x]!=x)p[x]=find(p[x]);return p[x];}
    static void merge(int a,int b){
        if(find(a)==find(b))return;
        cnt[find(b)]+=cnt[find(a)];
        p[find(a)]=find(b);
    }
    public static void main(String []args) throws IOException{
    n=nextInt();
    m=nextInt();
    for(int i=1;i<=n;i++){p[i]=i;cnt[i]=1;}
    while(m-->0){
        cin.nextToken();
        String op=cin.sval;
        int a,b;
        if(op.equals("C")){
            a=nextInt();
            b=nextInt();
            merge(a,b);}
            else if(op.equals("Q1")){
                a=nextInt();
                b=nextInt();
                cout.print(find(a)==find(b)?"Yes\n":"No\n");
            }else{
                a=nextInt();
                cout.println(cnt[find(a)]);
            }
    }
    cout.flush();
    br.close();
    }
}
 