import java.util.*;
import java.io.*;
public class Main2 {
    public static void main(String[] args)throws Exception{
        //BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter cout=new BufferedWriter(new OutputStreamWriter(System.out));
    //     char[]ch =new char[50];
    //     String st=cin.readLine();
    //     ch=st.toCharArray();
    //     cout.write(ch);
    //     cout.write("\n");
    //     int i=120;
    //     Integer ie=new Integer(i);
    //     cout.write(i+" "+ie+" "+ie.toString());//注意：Integer.toString(i)和i+""是等
    //     Integer ii=Integer.valueOf(i);
    //     cout.write("\n");
    //     cout.write(ii.intValue()+" "+ii.toString());
    //     cout.write("\n");
    //     cout.write(ie.intValue()+" "+ie.toString());
    //     cout.flush();
    //trim//去除前后空格

    // int asd =666;
    // cout.write(asd+"\n");
   //cout.write(cin.readLine()+"\n");//!!!!
//     String s1=cin.readLine();
//     String s2[]=s1.replace('a','t').toString().split(s1);
//     String s4=String.join("",s2);//!!!!!
//    System.out.println(Arrays.toString(s2));
//    String[] s3=s4.split(",");
//    for(int i=0;i<s3.length;i++){
//        System.out.println(s3[i]);
//    }
//    // boolean flag=s1.equalsIgnoreCase(s2);
    //cout.write(flag+"\n");//!!!!!
    // System.out.println(s1.contains(s2));
    // System.out.println(s1.startsWith(s2));
    // System.out.println(s1.endsWith(s2));
    // System.out.println(s1.indexOf(s2));//第一次出现的下标
    // System.out.println(s1.lastIndexOf(s2));//最后一次出现的下标
    // System.out.println(s1.substring(2,5));//从2到5
    // System.out.println(s1.equals(s2));
    // System.out.println(s1.equals(s2.trim()));
   //cin.close();
    //cout.flush();


//     int a=1;
//     int b=122;
// double result =((a&b)+((a^b)>>1));
// if((((a^b)&1)==1)){
//     result+=0.5;
// }
//   System.out.println(result);
//     // System.out.println(Math.abs(mid));
    

     Scanner in =new Scanner(System.in);
     LinkedHashMap<String,Integer> lm=new LinkedHashMap<>();
     lm.put("c",3);
     lm.put("a",1);
     lm.put("b",2);
     Set<Map.Entry<String,Integer>> ent=lm.entrySet();
     Iterator<Map.Entry<String,Integer>> it=ent.iterator();
     while(it.hasNext()){
         Map.Entry<String,Integer> e=it.next();
         System.out.println(e.getKey()+" "+e.getValue());
         it.remove();
        }
    }
    }