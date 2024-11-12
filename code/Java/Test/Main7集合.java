import java.util.*;
import java.io.*;
public class Main7集合{
    //Map
    public static void main(String[]args)throws Exception{
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<String,Integer>lm=new LinkedHashMap<>();
        lm.put("C",6);
        lm.put("A",6);
        lm.put("B",6);
        lm.put("D",6);
        Set<Map.Entry<String,Integer>>ent=lm.entrySet();
        Iterator<Map.Entry<String,Integer>> it=ent.iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer>mid=it.next();
            System.out.print(mid.getKey());
            System.out.print(mid.getValue());
            System.out.println();
            mid.setValue(mid.getValue()+1);
            System.out.println(mid.getValue());
            System.out.println();
            System.out.println(lm);
        }
Iterator<Map.Entry<String,Integer>>it2=ent.iterator();
while(it2.hasNext()){
    Map.Entry<String,Integer>mid=it2.next();
    System.out.print(mid.getKey());
    System.out.print(mid.getValue());
    System.out.println();
}
//stack
Stack <Integer>s=new Stack<Integer>();
Scanner cin=new Scanner (System.in);
s.push(10);
s.push(20);
System.out.println(s.size());
System.out.println(s.pop());
System.out.println(s.peek());
System.out.println(s.empty());s.push(30);
System.out.println(s.peek());
System.out.println(s.pop());
System.out.println(s.peek());
}
}
