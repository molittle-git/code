import java.util.*;
import java.io.*;
public class Main29KMP {
static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
static PrintWriter cout =new PrintWriter(new OutputStreamWriter(System.out));
static StreamTokenizer cin=new StreamTokenizer(br);
final static int maxn=(int)1e7+6;
static char[]a=new char[maxn],b=new char[maxn];
static int []ne=new int[maxn];
static int nextInt()throws IOException{cin.nextToken();return (int)cin.nval;}
public static void main(String[] args) throws IOException{
//是否存在子串
// String s=br.readLine();
// String p=br.readLine();
// a=s.toCharArray();
// b=p.toCharArray();
// cout.println(kmp(a,b));
// cout.flush();
// }
// public static void getnext(char[]x){
//     ne[0]=-1;
//     int len=x.length;
//     int i=0,j=-1;
//     while(i<len-1){
//     if(j==-1||x[i]==x[j]){
//         ne[++i]=++j;
//     }else j=ne[j];
// }   
//     }
//     static int kmp(char[]x,char[]y){
//         getnext(y);
//         int xlen=x.length;
//         int ylen=y.length;
//         int i=0,j=0;
//         int ans=0;
//         while(i<xlen&&j<ylen){
//         if(j==-1||x[i]==y[j]){
//             i++;
//             j++;
//             }else j=ne[j];
//         }
// if(j==ylen)return 1;
// else return 0;
//所有子串及位置
String s=br.readLine();
String ss=br.readLine();
a=s.toCharArray();
b=ss.toCharArray();
kmp(a,b);

}
static void getnext(char[]x){
    ne[0]=-1;
    int len=x.length;
    int i=0,j=-1;
    while(i<len-1)
    {
        if(j==-1||x[i]==x[j])
        {
        ne[++i]=++j;
        }
        else j=ne[j];
    }
}
static void kmp(char[]x,char[]y){
        getnext(y);
        int xlen=x.length;
        int ylen=y.length;
        int i=0,j=0,ans=0;
        while(i<xlen&&j<ylen){
            if(j==-1||x[i]==y[j]){
                i++;
                j++;
                if(j==ylen){
                ans++;
                cout.print(i-j+" ");
                cout.flush();
            j=ne[j];
        }
        }else j=ne[j];
    }
}
}