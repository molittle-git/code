// import java.io.*;
// public class 最长公共子序列 {
//     static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
//     static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
//     static int N=1001;
//     static int [][]f=new int[N][N];
//     public static void dp(char[]x,char[]y)
//     {
//         int lenx=x.length;
//         int leny=y.length;
//         for(int i=1;i<=lenx;i++)
//         {
//             for(int j=1;j<=leny;j++)
//             {
//                 if(x[i-1]==y[j-1])f[i][j]=f[i-1][j-1]+1;
//                 else f[i][j]=Math.max(f[i-1][j],f[i][j-1]);
//             }
//         }
//     }
//     public static char[]ls(char[]x,char[]y)
//     {
//         char[]h=new char[N];
//         int i=x.length;
//         int j=y.length;
//         int ans=0;
//         while(i!=0&&j!=0){
//             if(x[i-1]==y[j-1]){h[ans++]=x[i-1];i--;j--;}
//             else if(f[i][j-1]>f[i-1][j])j--;
//             else i--;
//         }
//         return h;
//     }
//     public static void main(String[]args)throws IOException{
//         String s1=in.readLine();
//         String s2=in.readLine();
//         dp(s1.toCharArray(),s2.toCharArray());
//         char[]h=ls(s1.toCharArray(),s2.toCharArray());
//         for(int i=0;i<s1.length();i++){
//         for(int j=0;j<s2.length();j++)
//         {
//             cout.print(f[i][j]+" ");
//         }
//         cout.println();
//     }
//         cout.println(f[s1.length()][s2.length()]);
//         int relen=f[s1.length()][s2.length()];
//         for(int i=relen-1;i>=0;i--)
//         {
//             cout.print(h[i]);
//         }
//         cout.flush();
//     }
// }
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * @Author DragonOne
 * @Date 2021/12/5 21:27
 * @墨水记忆 www.tothefor.com
 */
public class 最长公共子序列 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));
    public static Scanner sc = new Scanner(System.in);

    public static int maxd = 10000+7;
    public static int INF = 0x3f3f3f3f;
    public static int mod = 998244353;
    public static int[][] dp = new int[maxd][maxd]; //dp[i][j]表示串a的前i个和串b的前j个的公共子序列的最长长度

    public static void lcs(char[] x,char[] y){
        int lenx = x.length;
        int leny = y.length;
        for(int i=1;i<=lenx;++i){
            for(int j=1;j<=leny;++j){
                if(x[i-1]==y[j-1]) dp[i][j] = dp[i-1][j-1]+1;
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]); //当当前对应位置不等时，就看是不要串a的，还是不要串b中的
            }
        }
    }
    public static char[] LCSstr(char[] x,char[] y){
        char[] ch = new char[maxd]; //用来存储公共子序列
        int i = x.length;
        int j = y.length;
        int ind = 0; //记录公共子序列在ch数组中的下标，所以最后一定是等于公共子序列的长度的
        while(i!=0 && j!=0){
            if(x[i-1]==y[j-1]){
                ch[ind++]=x[--i]; //因为字符数组是从0开始存储的，所以这里需要先减再存
                j--;
            }else if(dp[i][j-1]>dp[i-1][j]) { //因为前面lcs方法中，要的是dp较大值，所以要的是a串中的，b串中就可以少一个
                j--;
            }else if(dp[i][j-1]<=dp[i-1][j]){ //同理，这里要的是b串中的，所以让a串中少一个
                i--;
            }
        }
        return ch; //存储的最后结果是公共子序列的相反序列，因为是从后往前存的
    }

    public static void main(String[] args) throws Exception {
        String s1 = nextString();
        String s2 = nextString();
        lcs(s1.toCharArray(),s2.toCharArray());

        char[] ans = LCSstr(s1.toCharArray(),s2.toCharArray());
        System.out.println(dp[s1.length()][s2.length()]);

        int rlen = dp[s1.length()][s2.length()];
        for(int i=rlen-1;i>=0;--i){
            System.out.print(ans[i]);
        }
        System.out.println();
                for(int i=0;i<s1.length();i++){
        for(int j=0;j<s2.length();j++)
        {
            cout.print(dp[i][j]+" ");
        }
        cout.println();
    }

        closeAll();
    }

    public static void cinInit(){
        cin.wordChars('a', 'z');
        cin.wordChars('A', 'Z');
        cin.wordChars(128 + 32, 255);
        cin.whitespaceChars(0, ' ');
        cin.commentChar('/');
        cin.quoteChar('"');
        cin.quoteChar('\'');
        cin.parseNumbers();
    }
    public static int nextInt() throws Exception {
        cin.nextToken();
        return (int) cin.nval;
    }
    public static long nextLong() throws Exception {
        cin.nextToken();
        return (long) cin.nval;
    }
    public static double nextDouble() throws Exception {
        cin.nextToken();
        return cin.nval;
    }
    public static String nextString() throws Exception {
        cin.nextToken();
        return cin.sval;
    }
    public static void closeAll() throws Exception {
        cout.close();
        in.close();
        out.close();
    }
}

