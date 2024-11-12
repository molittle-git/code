// import java.io.*;
// import java.util.*;
// public class 四_2线性DP{
//     //摘花生
//     static int N=1000;
//     static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
//     static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
//     public static void main(String[]args)throws IOException{
//     int t=Integer.parseInt(in.readLine());
//     for(int k=0;k<t;k++)
//     {
//         String[]arr=in.readLine().split(" ");
//         int row=Integer.parseInt(arr[0]);
//         int col=Integer.parseInt(arr[1]);
//         int[][]a=new int[row][col];
//         for(int i=0;i<row;i++){
//             String[]arr1=in.readLine().split(" ");
//             for(int j=0;j<col;j++)
//             {
//                 a[i][j]=Integer.parseInt(arr1[j]);
//             }
//         }
//         int[][]dp=new int[row+1][col+1];
//         for(int i=1;i<=row;i++)
//         {
//             for(int j=1;j<=col;j++)
//             dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1])+a[i-1][j-1];
//         }
//         cout.println(dp[row][col]);
//         cout.flush();
//     }
//     }
// }
import java.io.*;
import java.util.*;
public class 四_2线性DP {
    //数值三角形
    static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
    static int N=110;
    static int[][]f=new int[N][N];
    static int[][]a=new int[N][N];
    public static void main(String[]args)throws IOException{
        int n=Integer.parseInt(in.readLine());
        for(int i=1;i<=n;i++){
            String[]ss=in.readLine().split(" ");
            for(int j=1;j<=i;j++){
                a[i][j]=Integer.parseInt(ss[j-1]);
            }
        }
        for(int i=0;i<=n;i++)
        {for(int j=0;j<=i+1;j++){
            f[i][j]=-1;
        }}
        f[1][1]=a[1][1];
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                f[i][j]=Math.max(f[i-1][j-1],f[i-1][j])+f[i][j];
            }
        }
        int res=0;
        for(int i=1;i<=n;i++){
            res=Math.max(res,f[n][i]);
        }
        cout.println(res);
        cout.flush();
    }
}