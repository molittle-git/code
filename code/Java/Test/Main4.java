import java.io.*;
public class Main4{
    static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    //static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[]args)throws IOException{
    String[]s1=in.readLine().split(" ");
    double n=Double.parseDouble(s1[0]);
    double m=Double.parseDouble(s1[1]);
    double s=n/m;
    //System.out.printf("%0.1f/n",n+"/"+s+"="+m);
    System.out.println("你好");
    //cout.flush();
    }
}
//import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String input = scanner.nextLine();
//         StringBuilder result = new StringBuilder();

//         for (int i = 0; i < input.length(); i++) {
//             char currentChar = input.charAt(i);
//             if (currentChar == '6' && i < input.length() - 2 && input.charAt(i + 1) == '6' && input.charAt(i + 2) == '6') {
//                 result.append('9');
//                 i += 2;
//             } else if (currentChar == '6' && i < input.length() - 3 && input.charAt(i + 1) == '6' && input.charAt(i + 2) == '6' && input.charAt(i + 3) == '6') {
//                 result.append('2');
//                 //result.append('7');
//                 i += 3;
//             } else {
//                 result.append(currentChar);
//             }
//         }

//         System.out.println(result.toString());
//     }
// }
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         String sentence = scanner.nextLine();
        
//         String result = processSixes(sentence);
        
//         System.out.println(result);
        
//         scanner.close();
//     }
    
 
//     private static String processSixes(String sentence) {
//         StringBuilder sb = new StringBuilder();
//         int count = 0;
        
//         for (int i = 0; i < sentence.length(); i++) {
//             char c = sentence.charAt(i);
            
//             if (c == '6') {
//                 count++;
//                 if (count > 9) {
//                     sb.append("27");
//                     count = 0;
//                 } else if (count > 3) {
//                     sb.append("9");
//                 } else {
//                     sb.append(c);
//                 }
//             } else {
//                 count = 0;
//                 sb.append(c);
//             }
//         }
        
//         return sb.toString();
//     }
// }
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int N = scanner.nextInt();

//         for (int i = 0; i < N; i++) {
//             int number = scanner.nextInt();
//             int sum = 0;
//             int multi = 1;

//             while (number > 0) {
//                 sum += number % 10;
//                 number /= 10;
//             }

//             for (int j = 2; j <= 9; j++) {
//                 if (sum == multi * j) {
//                     System.out.println(sum);
//                     break;
//                 }
//                 multi *= j;
//             }
//             if (multi == 1) {
//                 System.out.println("NO");
//             }
//         }
//     }
// }
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner= new Scanner(System.in);
//         String input = scanner.nextLine();
//         StringBuilder output = new StringBuilder();

//         int count = 0;
//         for (char c : input.toCharArray()) {
//             if (c == '6') {
//                 count++;
//                 if (count > 9) {
//                     output.replace(count, count, "27");
//                     count = 0;
//                     continue;
//                 } else if (count > 3) {
//                     output.replace(count, count, "9");
//                     continue;
//                 } else {
//                     output.replace(count, count,"6");
//                     continue;
//                 }
//             } else {
//                 output.append(c);
//                 count = 0;
//             }
//         }

//         System.out.println(output.toString());
//         scanner.close();
//     }
// }


// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int x = scanner.nextInt();
//         int s = 1;
//         int n = 1;

//         while (x % s != 0) {
//             s *= 10;
//             n++;
//         }

//         System.out.println(s / 10 + (s % 10 == 0 ? "" : s % 10));
//         System.out.println(n);
//     }
// }
// import java.io.*;
// import java.util.*;
// public class Main{
//     static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
//     static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
//     static int N=100010;
//     static int[]a=new int[N];
//     public static void main(String[]args)throws IOException{
//     String[]s1=in.readLine().split(" ");
//     int n=Integer.parseInt(s1[0]);
//     int m=Integer.parseInt(s1[1]);
//     String[]s2=in.readLine().split(" ");
//     for(int i=0;i<n;i++){
//     a[i]=Integer.parseInt(s2[i]);
//     }
//     int count=0;
//     for(int i=0;i<n;i++){
//         for(int j=i+1;j<n;j++)
//         {
//             if(a[i]+a[j]>m){count++;}
//         }
//     }
//     cout.println(count);
//     cout.flush();
//     }
// }

// import java.util.*;


// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         int[] nums = new int[n];

//         if (isBST(nums)) {
//             System.out.println("YES");
//             System.out.println(Arrays.toString(postOrderTraversal(nums)));
//         } else {
//             System.out.println("NO");
//         }
//     }

//     private static boolean isBST(int[] nums) {
//         return isBST(nums, 0, nums.length - 1);
//     }

//     private static boolean isBST(int[] nums, int left, int right) {
//         if (left >= right) {
//             return true;
//         }

//         int root = nums[left];
//         int i = left + 1;
//         while (i <= right && nums[i] < root) {
//             i++;
//         }

//         for (int j = i + 1; j <= right; j++) {
//             if (nums[j] < root) {
//                 return false;
//             }
//         }

//         return isBST(nums, left + 1, i - 1) && isBST(nums, i, right);
//     }

//     private static int[] postOrderTraversal(int[] nums) {
//         int n = nums.length;
//         int[] result = new int[n];
//         int index = 0;

//         postOrderTraversal(nums, 0, n - 1, result, index);

//         return result;
//     }

//     private static void postOrderTraversal(int[] nums, int left, int right, int[] result, int index) {
//         if (left >= right) {
//             return;
//         }

//         int root = nums[left];
//         int i = left + 1;
//         while (i <= right && nums[i] < root) {
//             i++;
//         }

//         postOrderTraversal(nums, left + 1, i - 1, result, index);
//         postOrderTraversal(nums, i, right, result, index);
//         result[index++] = root;
//     }
// }

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String input = scanner.nextLine();
//         StringBuilder result = new StringBuilder();

//         for (int i = 0; i < input.length(); i++) {
//             char currentChar = input.charAt(i);
//             if (currentChar == '6' && i < input.length() - 2 && input.charAt(i + 1) == '6' && input.charAt(i + 2) == '6') {
//                 result.append('9');
//                 i += 2;
//             } else if (currentChar == '6' && i < input.length() - 3 && input.charAt(i + 1) == '6' && input.charAt(i + 2) == '6' && input.charAt(i + 3) == '6') {
//                 result.append('a');
//                 i += 3;
//             } else {
//                 result.append(currentChar);
//             }
//         }

//         System.out.println(result.toString());
//     }
// }
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String input = scanner.nextLine();
//         StringBuilder result = new StringBuilder();

//         for (int i = 0; i < input.length(); i++) {
//             char currentChar = input.charAt(i);
//             int count = 0;

//             while (i < input.length() && input.charAt(i) == '6') {
//                 count++;
//                 i++;
//             }

//             if (count >= 3) {
//                 if (count >= 9) {
//                     result.append("27");
//                     count -= 9;
//                 } else {
//                     result.append('9');
//                     count--; 
//                 }
//             } else {
//                 for (int j = 0; j < count; j++) {
//                     result.append(currentChar);
//                 }
//             }
//         }

//         System.out.println(result.toString());
//     }
// }
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String input = scanner.nextLine();
//         StringBuilder result = new StringBuilder();

//         for (int i = 0; i < input.length(); i++) {
//             char currentChar = input.charAt(i);
//             int count = 0;

//             if(input.charAt(i) == '6') {
//                 count++;
//             }

//             if (count >= 3) {
//                 if (count >= 9) {
//                     result.append("27");
//                     count -= 9;
//                 } else {
//                     result.append('9');
//                     count--; 
//                 }
//             } else {
//                 for (int j = 0; j < count; j++) {
//                     result.append(currentChar);
//                 }
//             }
//         }

//         System.out.println(result.toString());
//     }
// }

