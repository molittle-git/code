import java.util.*;
// import java.io.OutputStreamWriter;
// import java.io.IOException;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import java.io.*;
public class Main00 { 
    public static void main(String[] args) throws IOException{
        Scanner cin = new Scanner(System.in);
       
   //输入
// int nu=cin.nextInt();
    // System.out.println(nu);
    // float fl=cin.nextFloat();
    // System.out.println(fl);
    // double dou=cin.nextDouble();
    // System.out.println(dou);
    // String st=cin.nextLine();System.out.println(st);
   // String str=cin.next();   System.out.println(str);

//     float a,b;
//     int c;
//     while(cin.hasNext())
//     {
// a=cin.nextFloat();
// b=cin.nextFloat();
// c=cin.nextInt();  
// System.out.println(a+" "+b+" "+c) ; 
// }

// String s="adsd";
// int a=123;
// System.out.println(s);
// System.out.print(165);
// System.out.printf("%d %s",a,s);
//输出
 BufferedWriter cout=new BufferedWriter(new OutputStreamWriter(System.out));
//BufferedReader cin=new BufferedReader(new InputStreamReader(System.in));//字符专用
 char a2='6';
 String a3="66";
//int a1=cin.read();//只读第一个字符
//a2=(char) cin.read();
// a3=cin.readLine();
// cout.write(Integer.toString(a1));
//cout.write("\n");
 //cout.write(a1);
//  cout.write("\n");
//  cout.write(a3);
//  cout.write("\n");
//  cout.write(a1+"\n");
//  cout.write(Integer.toString(a1));//重点！！！！
// cout.flush();//搭配输出使用 
 cin.close();
//数组
int[][]c=new int[5][2];
int[]b=new int [5];
int[]a={'s','d',1,2,3};
b=Arrays.copyOf(a,8);
System.out.println(Arrays.toString(b));//重点！！！！！！！！！
Arrays.fill(b,6);
Arrays.fill(b,0,4,4);
String str =Arrays.toString(b);
System.out.println(str);
System.out.println(b.length);
int []d={1,45,5,65,44,2,12,43};
//Arrays.sort(d);
//System.out.println(Arrays.toString(d));
String[]str1={"z","c","C","a"};
Arrays.sort(str1);
System.out.println(Arrays.toString(str1));//Ascma12paixu
Arrays.sort(str1,String.CASE_INSENSITIVE_ORDER);
System.out.println(Arrays.toString(str1));//zhimubiao12paixu,大写永远在前
Arrays.sort(str1,Collections.reverseOrder());
System.out.println(Arrays.toString(str1));//Ascma21paixu
Arrays.sort(str1,String.CASE_INSENSITIVE_ORDER);//zhimubiao21paixu,daxiezaiqian!!!!!!!!!
Collections.reverse(Arrays.asList(str1));
System.out.println(Arrays.toString(str1));
//Comparator<Integer> reverseSortComparator = (a, b) -> b - a;
//Arrays.sort(d, reverseSortComparator);
//Arrays.sort(d,Collections.reverseSortComparator());
System.out.println(Arrays.toString(d));
Arrays.sort(d,0,4);
String st=Arrays.toString(d);
System.out.println(st);
String str2[]={"W","E", "R", "T", "Y", "U", "I", "O", "P"};
System.out.println(Arrays.equals(str1,str2));
System.out.println(Arrays.binarySearch(str2,5,7,"O"));
int[]R={1,2,3,9};
R=Arrays.copyOf(R,R.length+1);
for(int i=0;i<R.length;i++){
    System.out.println(R[i]);
}
// //数组转字符串
// String str2=Arrays.toString(d);
// System.out.println(str2);
// //字符串转数组
// String[] str3=str2.split(",");
// System.out.println(Arrays.toString(str3));
// //字符串转数字
// int num=Integer.parseInt(str3[0]);
// System.out.println(num);
// //数字转字符串
// String str4=String.valueOf(num);
// System.out.println(str4);
}
}
   