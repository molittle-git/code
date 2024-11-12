// import java.io.*;
// import java.util.*;
// public class 四_1背包{
//     //选择前i个物品，总体积小于等于j的选法的集合，属性f[i][j]表示价值的最大值。
//     //01背包
//     static BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
//     static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
//     public static int maxd=1000+7,n,m;
//     public static int INF=0x3f3f3f3f;
//     static int f[][]=new int [maxd][maxd];
//     //static int []f=new int [maxd];
//     static int []w=new int [maxd];
//     static int[]v=new int [maxd];
//     public static void main(String[]args)throws IOException{
//     String[]s1=in.readLine().split(" ");
//     n=Integer.parseInt(s1[0]);
//     m=Integer.parseInt(s1[1]);
//     for(int i=1;i<=n;i++){
//         String[]s2=in.readLine().split(" ");
//         v[i]=Integer.parseInt(s2[0]);
//         w[i]=Integer.parseInt(s2[1]);
//     }
// // f[i][j] = f[i - 1][j];
// // f[i][j] = max(f[i][j], f[i - 1][j - v[i]] + w[i]);

// // 变化为
// //f[j] = f[j] // 省略
// //f[j] = max(f[j], f[j - v[i]] + w[i])
// //由于f[i][j]需要用到第i - 1层的结果，j-v[i]严格小于j,所以用j-v[i]更新j时，用的是第i层的结果，因此j需要逆序一下，

//     for(int i=1;i<=n;i++){
//         for(int j=0;j<=m;j++){
//             f[i][j]=f[i-1][j];
//             //f[j]=f[j];
//             if(j>=v[i])f[i][j]=Math.max(f[i-1][j],f[i-1][j-v[i]]+w[i]);
//             //f[j]=Math.max(f[j],f[j-v[i]]+w[i]);
//         }
//     }
//     cout.println(f[n][m]);
//     cout.flush();
//     }
// }
//完全背包
// import java.io.*;
// import java.util.*;
// public class 四_1背包{
//     //选择前i个物品，总体积小于等于j的选法的集合，属性f[i][j]表示价值的最大值。
//     static BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
//     static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
//     public static int maxd=1000+7,n,m;
//     public static int INF=0x3f3f3f3f;
//     static int f[][]=new int [maxd][maxd];
//     //static int []f=new int [maxd];
//     static int []w=new int [maxd];
//     static int[]v=new int [maxd];
//     public static void main(String[]args)throws IOException{
//     String[]s1=in.readLine().split(" ");
//     n=Integer.parseInt(s1[0]);
//     m=Integer.parseInt(s1[1]);
//     for(int i=1;i<=n;i++){
//         String[]s2=in.readLine().split(" ");
//         v[i]=Integer.parseInt(s2[0]);
//         w[i]=Integer.parseInt(s2[1]);
//     }
// // f[i][j] = max(f[i - 1][j], f[i - 1][j - vi] + wi, f[i - 1][j - 2vi] + 2wi,...f[i - 1][j - kvi] + kwi)
// // f[i][j - vi] = max(        f[i - 1][j - vi] , f[i - 1][j - 2vi] + wi,...f[i - 1][j - kvi] + (k - 1)wi)

// // 状态转移方程为
// // f[i][j] = max(f[i - 1][j], f[i][j - vi] + wi)
// for(int i=1;i<=n;i++){
//     for(int j=0;j<=m;j++){
//         f[i][j]=f[i-1][j];
//         if(j>=v[i]){
//         f[i][j]=Math.max(f[i][j],f[i][j-v[i]]+w[i]);
//         }
//     }
// }
//     cout.println(f[n][m]);
//     cout.flush();

//     // for(int i=1;i<=n;i++){
//     //     for(int j=v[i];j<=m;j++){
//     //         f[j]=f[j];
//     //         f[j]=Math.max(f[j],f[j-v[i]]+w[i]);
//     //     }
//     // }
//     // cout.println(f[m]);
//     // cout.flush();
//     }
// }
//多重背包I
// import java.io.*;
// import java.util.*;
// public class 四_1背包{
//     static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
//     static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
//     static int N=110;
//     static int f[][]=new int [N][N];
//     static int []v=new int[N],w=new int[N],s=new int[N];
//     public static void main(String[]args)throws IOException{
//         String[]s1=in.readLine().split(" ");
//     int n=Integer.parseInt(s1[0]);
//     int m=Integer.parseInt(s1[1]);
//     for(int i=1;i<=n;i++){
//         String[]s2=in.readLine().split(" ");
//         v[i]=Integer.parseInt(s2[0]);
//         w[i]=Integer.parseInt(s2[1]);
//         s[i]=Integer.parseInt(s2[2]);
//     }
//     for(int i=1;i<=n;i++){
//         for(int j=0;j<=n;j++){
//             for(int k=0;k<=s[i]&&k*v[i]<=j;k++)
//             {
//                 f[i][j]=Math.max(f[i][j],f[i-1][j-k*v[i]]+k*w[i]);
//             }
//         }
//     }
//     cout.println(f[n][m]);
//     cout.flush();
//     }
// }
//多重背包II
//优化
// import java.io.*;
// import java.util.*;
// public class 四_1背包{
//     static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
//     static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
//     static int N=110;
//     static int f[]=new int [N];
//     static int []v=new int[N],w=new int[N],s=new int[N];
//     public static void main(String[]args)throws IOException{
//         String[]s1=in.readLine().split(" ");
//     int n=Integer.parseInt(s1[0]);
//     int m=Integer.parseInt(s1[1]);
//     int cnt=0;
//     for(int i=1;i<=n;i++){
//         String[]s2=in.readLine().split(" ");
//         int a=Integer.parseInt(s2[0]);
//         int b=Integer.parseInt(s2[1]);
//         int s=Integer.parseInt(s2[2]);
//         int k=1;
//         while(k<=s){
//             cnt++;
//             v[cnt]=a*k;
//             w[cnt]=b*k;
//             s-=k;
//             k*=2;
//         }//二进制
//         if(s>0){
//             cnt++;
//             v[cnt]=a*s;
//             w[cnt]=b*s;
//         }
//     }
//     n=cnt;
//     for(int i=1;i<=n;i++){
//         for(int j=m;j>=v[i];j--){
//         f[j]=Math.max(f[j],f[j-v[i]]+w[i]);
//         }
//     }
//     cout.println(f[m]);
//     cout.flush();
//     }
// }
//分组背包
import java.io.*;
import java.util.*;
public class 四_1背包{
    static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
    static int N=110;
    static int f[]=new int[N];
    static int [][]v=new int[N][N];
    static int[][]w=new int[N][N];
    static int []s=new int[N];
    public static void main(String[]args)throws IOException{
        String[]s1=in.readLine().split(" ");
    int n=Integer.parseInt(s1[0]);
    int m=Integer.parseInt(s1[1]);
    for(int i=1;i<=n;i++){
        s[i]=Integer.parseInt(in.readLine());
        for(int j=1;j<=s[i];j++){
            String[]s2=in.readLine().split(" ");
            v[i][j]=Integer.parseInt(s2[0]);
            w[i][j]=Integer.parseInt(s2[1]);
        }   
    }
    for(int i=1;i<=n;i++){
        for(int j=m;j>=0;j--){
            for(int k=1;k<=s[i];k++){
            if(j>=v[i][k])f[j]=Math.max(f[j],f[j-v[i][k]]+w[i][k]);
            }
        }
    }
    cout.println(f[m]);
    cout.flush();
    }
}