 package Java.Test;

// import java.util.Scanner;
// public class Main{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int C=sc.nextInt();
//         int D=sc.nextInt();
//         int []v=new int[n];
//         int []w=new int[n];
//         int []b=new int[n];
//         for(int i=0;i<n;i++){
//             v[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             w[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             b[i]=sc.nextInt();
//         }
//         int []result=fin(n, C, D, v, w, b);
//         System.out.println("转入背包的物品总价值最大："+result[0]);
//         System.out.print("装入物品的序号：");
//         for(int i=1;i<result.length;i++){
//             if(result[i]==1){
//                 System.out.print(i+" ");
//             }
//         }
//     }
//         public static int[]fin(int n,int C,int D,int []v,int []w,int []b){
//             int [][][]dp=new int [n+1][C+1][D+1];
//             for(int i=1;i<=n;i++){
//                 for(int j=0;j<=C;j++){
//                     for(int k=0;k<=D;k++){
//                         if(j>=w[i-1]&&k>=b[i-1]){
//                     dp[i][j][k]=Math.max(dp[i][j][k],dp[i-1][j-w[i-1]][k-b[i-1]]+v[i-1]);
//                 }
//             }
//         }  
//     }
//     int []it=new int[n+1];
//     int i=n;
//     int j=C;
//     int k=D;
//     while(i>0&&j>0&&k>0){
//         if(dp[i][j][k]!=dp[i-1][j][k]){
//             it[i]=1;
//             j-=w[i-1];
//             k-=b[i-1];
//         }
//         i--;
//     }
//     int []result=new int[it.length];
//     result[0]=dp[n][C][D];
//     for(int l=1;l<result.length;l++){
//         result[l]=it[l];
//     }
//     return result;
// }
// }
//f[n]=f[n-1]+f[n-2]+k(n-1)*2;
//k[n]=f[n-2]+k[n-1];
// f[1]=1;f[2]=2;
// k[1]=0;k[2]=1;
// k[3]=2;
import java.util.*;
public class Main{
    public static int []f=new int[1000005];
    public static int []k=new int[1000005];
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        f[0]=0;
        f[1]=1;
        f[2]=2;
        k[0]=0;
        k[1]=0;
        k[2]=1;
        int n=sc.nextInt();
        for(int i=3;i<=n;i++){
            f[i]=(f[n-1]+f[n-2]+k[n-1]*2)%10000;
            k[i]=(f[n-2]+k[n-1])%10000;
        }
        System.out.println(f[n]);
        return;
    }
}