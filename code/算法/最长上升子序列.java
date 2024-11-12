import java.io.*;
import java.util.*;
public class 最长上升子序列{
    static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
    static int N=1010;
    static int []w=new int[N];
    static int n;
    static int []dp=new int[N];
    public static void main(String[]args)throws IOException{
        n=Integer.parseInt(in.readLine());
        String []arr=in.readLine().split(" ");
        for(int i=1;i<=n;i++)
        {
            w[i]=Integer.parseInt(arr[i-1]);
        }
        for(int i=1;i<=n;i++)
        {
            dp[i]=1;
            for(int j=1;j<=i;j++)
            {
                if(w[j]<w[i])
                {
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
            int ans=0;
            for(int i=1;i<=n;i++)
            {
                ans=Math.max(ans,dp[i]);
            }
            cout.println(ans);
            cout.flush();
        }
}