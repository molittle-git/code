package 算法;

import java.util.*;
import java.io.*;
public class 阿一_6差分矩阵{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
    static StreamTokenizer cin =new StreamTokenizer(br);
    static int N=1010;
    static int [][]a=new int[N][N],b=new int[N][N];
    public static int nextInt()throws IOException{cin.nextToken();return (int)cin.nval;
    }
    public static void insert(int x1,int y1,int x2,int y2,int c){
        b[x1][y1]+=c;
        b[x2+1][y1]-=c;
        b[x1][y2+1]-=c;
        b[x2+1][y2+1]+=c;
    }
    public static void main(String []args)throws IOException{
        int n,m,q;
        n=nextInt();
        m=nextInt();
        q=nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                a[i][j]=nextInt();
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                insert(i,j,i,j,a[i][j]);
            }
        }
        while(q--!=0){
            int x1,y1,x2,y2,c;
            x1=nextInt();
            y1=nextInt();
            x2=nextInt();
            y2=nextInt();
            c=nextInt();
            insert(x1,y1,x2,y2,c);
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                b[i][j]+=b[i-1][j]+b[i][j-1]-b[i-1][j-1];
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                cout.print(b[i][j]+" ");
                cout.flush();
            }
            cout.print("\n");
        }
    }
    }
