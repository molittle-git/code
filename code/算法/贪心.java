// import java.io.*;
// import java.util.*;
// public class 贪心 {
//     static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//     static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));
//     public static int N = 1000 + 7;
//     static int[]s=new int[N];
//     static int[]f=new int[N];
//     static boolean []a=new boolean[26];
//     public static int tanxin(int[]s,int[]f)
//     {
//         int n=s.length;
//         a[1]=true;
//         int j=1;
//         int count=1;
//         for(int i=1;i<n;i++)
//         {
//             if(s[i]>f[j])
//             {
//                 a[i]=true;
//                 j=i;
//                 count++;
//             }
//         }
//         cout.println(count); 
//         cout.flush();
//         return count;
//     }
//     public static void main(String[]args)throws IOException{
//     String s1[]=in.readLine().split(" ");
//     String s2[]=in.readLine().split(" ");
//     for(int i=1;i<=s1.length;i++)s[i]=Integer.parseInt(s1[i-1]);
//     for(int i=1;i<=s2.length;i++)f[i]=Integer.parseInt(s2[i-1]);
//         cout.flush();
//         tanxin(s,f);
//         for(int i=1;i<a.length;i++)
//         {
//             if(a[i])cout.print(i+" ");
//             cout.flush();
//         }
//     }
// }
// 0 1 3 0 5 3 5 6 8 8 2 12
// 0 4 5 6 7 8 9 10 11 12 13 14
 // int[] nums = new int[]{1,6,4,55,61,3,5,8,4,2,8,15,61,33};
    // Integer[] temp = new Integer[nums.length];
    // for (int i = 0; i < temp.length; i++) {
    //     temp[i] = nums[i];
    // }
    // Arrays.sort(temp,(i,j)->(j-i));
    // for (int i = 0; i < nums.length; i++) {
    //     nums[i] = temp[i];
    // }
    // System.out.println(Arrays.toString(nums));