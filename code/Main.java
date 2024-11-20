// import java.util.Scanner;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.Comparator;
// public class Main{
// public static class mm{
// 	int a,b;
// 	double s;
// 	public mm(int a,int b){
// 		this.a=a;
// 		this.b=b;
// 		this.s=(double)b/a;
// 	}
// }
// public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// int N=sc.nextInt();
// int T=sc.nextInt();
// ArrayList<mm>kk=new ArrayList<>();
// for(int i=0;i<N;i++){
// int a1=sc.nextInt();
// int b1=sc.nextInt();
// kk.add(new mm(a1,b1));
// }
// Collections.sort(kk,new Comparator<mm>(){
// public int compare(mm o1,mm o2){
// 	return Double.compare(o2.s,o1.s);
// }});
// double s=0.0;
// StringBuilder sb=new StringBuilder();
// for(int i=0;i<N;i++){
// if(kk.get(i).a<=T){
// s+=kk.get(i).b;
// sb.append("第").append(i+1).append("个物品：").append(1.0).append("个;");
// //System.out.print("第"+(i+1)+"个物品："+(1.0)+"个;");
// T-=kk.get(i).a;

// }else{
// double k=(double)T/kk.get(i).a;
// 	s+=T*kk.get(i).s;
//     sb.append("第").append(i+1).append("个物品：").append(k).append("个;");
// 	//System.out.print("第"+(i+1)+"个物品："+k+"个;");
// 	break;
// }
// }
// System.out.printf("背包的最大价值：%.1f",s);
// System.out.println();
// System.out.println(sb.toString());
//         sc.close();
//         return;
// }
// }
import java.util.Scanner;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.Collections;

import java.util.Comparator;

public class Main{
    static int ret=0;
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    int N=sc.nextInt();
    int T=sc.nextInt();
    me(N,T);
    System.out.println(ret);

    }
    public static void me(int a,int b){
    ret+=2;
}
}

