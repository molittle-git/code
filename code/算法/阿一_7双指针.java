package 算法;

import java.util.*;
import java.io.*;
public class 阿一_7双指针 {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
    static StreamTokenizer cin=new StreamTokenizer(br);
    static int N=100010;
    static int []a=new int[N];
    static int []s=new int[N];
    //找到最大无重复子序列的长度
    //n第k位数字：n>>k&1
    //返回n的最后一位1：lowbit(n) = n & -n
    public static void  main(String []args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
    }}
