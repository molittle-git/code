package 算法;

import java.util.*;
import java.io.*;
public class 阿一_8桶排序{
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static PrintWriter cout=new PrintWriter (new OutputStreamWriter(System.out));
static StreamTokenizer cin=new StreamTokenizer(br);
static int N=999999;
static int []a=new int[N];
static int []b=new int[N];
static int[]c=new int[N];
static int n;
static int ans;
static int nextInt()throws IOException{cin.nextToken();return (int)cin.nval;}
public static void main(String []args)throws IOException{
//n=nextInt();
int m=nextInt();

	for(int i=1;i<=m;i++)
	{
		a[i]=nextInt();
		++b[a[i]];//a[i]的出现次数+1
	}
	//for(int i=0;i<n;i++){if(b[a[i]]!=0)ans++;}cout.println(ans);cout.flush();计数ans
	for(int i=1;i<=10000;i++)//最大得数是n
	{//这里循环输出，因为不要去充，所以要循环出现的次数次，输出i，如果没出现过，t【i】为0，直接跳过循环
	
		for(int j=1;j<=b[i];j++)
		cout.print(i+" ");
		cout.flush();
	 }
	
cout.flush();
}}
//去重
// static int N=1001;
// static int []a=new int [N],b=new int[N];
// public static void main(String []args)throws IOException{
// 	int ans=0,x;
// cin.nextToken();
// int n=(int)cin.nval;
// for(int i=0;i<n;i++){
// cin.nextToken();
// x=(int)cin.nval;
// ++b[x];
// }
// for(int i=0;i<1000;i++)
// 	if(b[i]!=0)ans++;
// 	cout.println(ans);
// 	cout.flush();
// 	for(int i=0;i<1000;i++)
// 	if(b[i]!=0)cout.print(i+" ");
// cout.flush();



// public static void main(String[] args) {
// 	int a[]= {1,8,7,44,42,46,38,34,33,17,15,16,27,28,24};
// 	List[] buckets=new ArrayList[5];
// 	for(int i=0;i<buckets.length;i++)//初始化
// 	{
// 		buckets[i]=new ArrayList<Integer>();
// 	}
// 	for(int i=0;i<a.length;i++)//将待排序序列放入对应桶中
// 	{
// 		int index=a[i]/10;//对应的桶号
// 		buckets[index].add(a[i]);
// 	}
// 	for(int i=0;i<buckets.length;i++)//每个桶内进行排序(使用系统自带快排)
// 	{
// 		buckets[i].sort(null);
// 		for(int j=0;j<buckets[i].size();j++)//顺便打印输出
// 		{
// 			System.out.print(buckets[i].get(j)+" ");
// 		}
// 	}   
// }
