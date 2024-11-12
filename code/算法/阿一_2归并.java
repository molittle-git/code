package 算法;

import java.util.*;
import java.io.*;
public class 阿一_2归并{
    static BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));
	static StreamTokenizer t=new StreamTokenizer(cin);
    static int N=10001;
    static int[] tmp=new int[N];
    public static void main(String[] args) throws IOException{
        t.nextToken();
		int n = (int)t.nval;
        int[] q = new int[N];
        for (int i = 0; i < n; i++) {
			t.nextToken();
            q[i] = (int)t.nval;
        }
        merge_sort(q,0,n-1);
        for(int i=0;i<n;i++)
        {cout.print(q[i]+" ");}
    cout.flush();
        } 
public static void merge_sort(int q[],int l,int r){
    if(l>=r)return;
    int mid=(l+r)>>1;
    merge_sort(q,l,mid);
    merge_sort(q,mid+1,r);
     int k=0,i=l,j=mid+1;
     while(i<=mid&&j<=r)
     if(q[i]<=q[j])tmp[k++]=q[i++];
     else tmp[k++]=q[j++];
     while(i<=mid)tmp[k++]=q[i++];
     while(j<=r)tmp[k++]=q[j++];
     for(i=l,j=0;i<=r;i++,j++)
     q[i]=tmp[j];
    }
}

// public class Main {
//     static int[] days = new int[] {0,31,28,31,30,31,30,31,31,30,31,30,31};
//     public static boolean check(int year,int month,int day)
//     {
//         if(month == 0 || month > 12) return false;
//         if(day == 0 || month != 2 && day > days[month]) return false;
//         if(month == 2)
//         {
//             int leap = 0;
//             if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
//                 leap = 1;
//             if(day > 28 + leap) return false;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String[] s = scan.next().split("/");
//         int a = Integer.parseInt(s[0]);
//         int b = Integer.parseInt(s[1]);
//         int c = Integer.parseInt(s[2]);
//         for(int i = 19600101;i <= 20591231;i++)
//         {
//             int year = i / 10000;
//             int month = i % 10000 / 100;
//             int day = i % 100;
//             if(check(year,month,day))
//             {
//                 if(year % 100 == a && month == b && day == c || //年/月/日
//                    month == a && day == b && year % 100 == c || //月/日/年
//                    day == a && month == b && year % 100 == c)//日/月/年
//                    {
//                         System.out.printf("%d-%02d-%02d\n", year, month, day);
//                    }
//             }
//         }
//     }
// }
