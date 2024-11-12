package Java.Test;

import java.io.*;
import java.util.*;
public class 结构体{
static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
static StreamTokenizer cin=new StreamTokenizer(br);
static int N=1001;
static int nextInt()throws IOException{cin.nextToken();return (int)cin.nval;}
 static class Node{
	int num;
	int x;
	int y;
	int z;
	int count;
}
 static class MyCompare implements Comparator<Node>{
	public int compare(Node o1,Node o2){
		if(o1.count==o2.count){
			if(o1.x==o2.x){
			return o2.num-o1.num;}
		else{
			return o2.x-o1.x;
		}}else
		{return o2.count-o1.count;}
	}
}
public static void main(String []args)throws IOException{
int n=nextInt();
Node []node=new Node[n+1];
for(int i=1;i<=n;i++){
node[i]= new Node();
node[i].x=nextInt();
node[i].y=nextInt();
node[i].z=nextInt();
node[i].num=i;
node[i].count=node[i].x+node[i].y+node[i].z;
}
Arrays.sort(node,1,n+1,new MyCompare());
for(int i=1;i<=5;i++){
	cout.println(node[i].num+" "+node[i].count);
	cout.flush();
}
}
}