import java.io.*;
public class 阿一_5前缀和二维{
    //子矩阵的和
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter cout=new PrintWriter(new OutputStreamWriter(System.out));
    static StreamTokenizer cin=new StreamTokenizer(br);
    static int N=1010;
    static int[][]a=new int[N][N];
    static int[][]s=new int[N][N];
    public static int nextInt()throws IOException{
            cin.nextToken();
            return (int)cin.nval;
        }
    public static void main(String []args)throws IOException{
        cin.nextToken();
        int n=(int)cin.nval;
        cin.nextToken();
        int m=(int)cin.nval;
        cin.nextToken();
        int q=(int)cin.nval;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                cin.nextToken();
                a[i][j]=(int)cin.nval;
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                s[i][j]=s[i-1][j]+s[i][j-1]-s[i-1][j-1]+a[i][j];
            }
        }
        while(q--!=0){
            int x1,y1,x2,y2;
            x1=nextInt();
            y1=nextInt();
            x2=nextInt();
            y2=nextInt();
            cout.printf("%d\n",s[x2][y2]-s[x1-1][y2]-s[x2][y1-1]+s[x1-1][y1-1]);
            cout.flush();
        }
    
    }
    
}