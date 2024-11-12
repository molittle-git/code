import java.util.List;
import java.util.Scanner;
public class Main999 { 
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String nn=sc.nextLine();
        int n1=Integer.parseInt(nn.split(" ")[0]);
        int n2=Integer.parseInt(nn.split(" ")[1]);
        char[]s1=new char[n1];
        char[]s2=new char[n2];
        String st1=sc.nextLine();
        String st2=sc.nextLine();
        
        st1=st1.replaceAll("\\s","");
        st2=st2.replaceAll("\\s","");
        int n3=st1.length();
        int n4=st2.length();
        for(int i=0;i<n3;i++){
            s1[i]=st1.charAt(i);
        }
        for(int i=0;i<n4;i++){
            s2[i]=st2.charAt(i);
        }
        int[][]dp=new int[n3+1][n4+1];
            for(int i=1;i<=n3;i++){
                char ch1=s1[i-1];
                for(int j=1;j<=n4;j++){
                    char ch2=s2[j-1];
                    if(ch1==ch2){
                        dp[i][j]=dp[i-1][j-1]+1;
                    }else{
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            } 
            System.out.println(dp[n3][n4]);
            int i=n3,j=n4;
            StringBuilder sb=new StringBuilder();
            while(i>0 && j>0){
                if(s1[i-1]==s2[j-1]){
                    sb.append(s1[i-1]);
                    i--;
                    j--;
                }else if(dp[i-1][j]>dp[i][j-1]){
                    i--;
                }else{
                    j--;
                }
            }
            
            System.out.println(sb.reverse().toString());
        }
    }
