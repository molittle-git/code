import java.io.*;
import java.util.*;

// class CustomComparator implements Comparator<String> 
//     @Override
//     public int compare(String a, String b) {
//         int prefixCompare = comparePrefix(a, b);
//         if (prefixCompare != 0) {
//             return prefixCompare;
//         }
//         return compareRemaining(a, b);
//     }
public class Main1 {
public static void main(String [] args){
    // String[] arr = {"1001", "1234", "1024", "12304"};
    // Arrays.sort(arr, new CustomComparator());
    // for(String s: arr){
    //     System.out.println(s);
    // }
int k=17;
System.out.println(Integer.toBinaryString(k));
System.out.println(Integer.toOctalString(k));
System.out.println(Integer.toHexString(k));
int r=16;
System.out.println(Integer.toString(k,r));
//
System.out.println(Integer.parseInt("1100",2));
System.out.println(Integer.parseInt("18",8));
System.out.println(Integer.parseInt("11",16));
}
//double a;
//String str=String.format("%.2f",a)//!!!!!!!
//cout.print(str);
}
