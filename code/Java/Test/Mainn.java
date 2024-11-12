import java.io.*;
import java.util.*;
public class Mainn {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));
    static StreamTokenizer cin = new StreamTokenizer(br);
    static int[][] g = new int[5][5];
    static int[][] a = new int[5][5];
    static int[] dx = {0, -1, 0, 1, 0};
    static int[] dy = {0, 0, 1, 0, -1};

    public static int nextInt() throws IOException {
        cin.nextToken();
        return (int) cin.nval;
    }

    public static void turn(int x, int y) {
        for (int i = 0; i < 5; i++) {
            int a = x + dx[i];
            int b = y + dy[i];
            if (a >= 0 && a < 5 && b >= 0 && b < 5) {
                g[a][b] ^= 1;
            }
        }
    }

    public static int dfs() {
        int ans = Integer.MAX_VALUE;
        for (int k = 0; k < 1 << 5; k++) {
            int res = 0;
            for (int i = 0; i < 5; i++)
                for (int j = 0; j < 5; j++) {
                    a[i][j] = g[i][j];
                }
            for (int j = 0; j < 5; j++) {
                if (((k >> j) & 1) == 1) {
                    res++;
                    turn(0, j);
                }
            }
            for (int i = 0; i < 4; i++)
                for (int j = 0; j < 5; j++) {
                    if (g[i][j] == 0) {
                        res++;
                        turn(i + 1, j);
                    }
                }
            boolean isSuccess = true;
            for (int j = 0; j < 5; j++) {
                if (g[4][j] == 0) {
                    isSuccess = false;
                    break;
                }
            }
            if (isSuccess) ans = Math.min(ans, res);
            for (int i = 0; i < 5; i++)
                for (int j = 0; j < 5; j++)
                    g[i][j] = a[i][j];
        }
        if (ans > 6) return -1;
        return ans;
    }

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        while (n-- > 0) {
            for (int i = 0; i < 5; i++) {
               String s=br.readLine();
                for (int j = 0; j < 5; j++)
                    g[i][j] =s.charAt(j)-'0';
                   
            }
            cout.println(dfs());
            cout.flush();
        }
    }
}

// import java.io.*;
// import java.util.*;
// public class Mainn {
//     private static final String[] ST = null;
//     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));
//     static StreamTokenizer cin = new StreamTokenizer(br);
//     static void main(String[]args)throws IOException{
//         // cin.ordinaryChars('0', '5') ; //做题时，注意要将5改成9
//         // cin.wordChars('0', '5'); //做题时，注意要将5改成9
//         // cin.nextToken();
//         // String s=(String)cin.sval;
//         String s=br.readLine();
//         for(int i=0;i<s.length();i++){
//             int c=s.charAt(i)-'0'; 
//             cout.println(c);}
//         cout.flush();
//     }
// }