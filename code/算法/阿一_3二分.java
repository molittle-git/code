// import java.util.*;
// import java.io.*;
// public class test二分 {
//     static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//     static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
//     static StreamTokenizer cin=new StreamTokenizer(br);
//     static int m,n;
//     static int[]a=new int[100001];
//     public static void main(String[]args)throws IOException{
        
//         cin.nextToken();
//         m=(int)cin.nval;
//         cin.nextToken();
//         n=(int)cin.nval;
//         for(int i=1;i<=m;i++){
//             cin.nextToken();
//             a[i]=(int)cin.nval;
//         }
//         while(n-->=0){
//             cin.nextToken();
//             int x=(int)cin.nval;
//             int l=1,r=m;
//             while(l<r){
//                 int mid=(l+r)>>1;
//                 if(a[mid]>=x)r=mid;
//                 else l=mid+1;
//             }
//             if (a[l]==x) cout.print(l+" "); 
//             else cout.print(-1+" ");
//             cout.flush();
// // cout.print(l+" ");
// //     int l1=0,r1=m-1;
// //     while(l1<r1){
// //         int mid=(l1+r1+1)>>1;
// //         if(a[mid]<=x)r1=mid;
// //         else r1=mid-1;
// //     }
// // cout.println(l1+" ");
// // cout.flush();
// // }
//         }
//     }
// }
// import java.util.*;
// import java.io.*;
// public class 阿一_3二分 {
//     static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//     static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
//     static StreamTokenizer cin=new StreamTokenizer(br);
//     static int m,n;
//     static int[]a=new int[1000001];
//     public static void main(String[]args)throws IOException{
        
// //         cin.nextToken();
// //         n=(int)cin.nval;
// //         cin.nextToken();
// //         m=(int)cin.nval;
// //         for(int i=0;i<n;i++){
// //             cin.nextToken();
// //             a[i]=(int)cin.nval;
// //         }
// //         while(m--!=0){
// //             cin.nextToken();
// //             int x=(int)cin.nval;
// //             int l=0,r=n-1;
// //             while(l<r){
// //                 int mid=(l+r)>>1;
// //                 if(a[mid]>=x)r=mid;
// //                 else l=mid+1;
// //             }
// //             if (a[l]!=x) {
// //                 cout.println("-1 -1");cout.flush();}
// //             else {
// //             cout.print(l+" "); 
// //             cout.flush();
// //             int l1=0,r1=n-1;
// //             while(l1<r1){
// //                 int mid=(l1+r1+1)>>1;
// //                 if(a[mid]<=x)l1=mid;
// //                 else r1=mid-1;
// //             }
// //         cout.println(l1);
// //         cout.flush();
// //         }
// // } 
// cin.nextToken();
//  double t=(double)cin.nval;
//  double l2=0,r2=t;
//  while((r2-l2)>1e-8)
//  {double mid=(l2+r2)/2;//比目标多两位
// if(mid*mid>=t)r2=mid;
// else l2=mid;
// }
// cout.printf("%.6f\n",l2);
// cout.flush();
// }
// }