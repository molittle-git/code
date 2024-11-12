package 算法;

import java.util.Scanner;

public class 四_01背包  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 物品个数
        int m = scanner.nextInt(); // 背包容量

        int[] v = new int[n]; // 物品价值数组
        int[] w = new int[n]; // 物品重量数组

        for (int i = 0; i < n; i++) {
            v[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        scanner.close();
        int []dp=new int[m+1];
        boolean[]x=new boolean[n];
        for(int i=0;i<n;i++){
            for(int j=m;j>=w[i];j--){
                dp[j]=Math.max(dp[j],dp[j-w[i]]+v[i]);
            }
        }
        int maxVal=dp[m];
        int cur=m;
        for(int i=n-1;i>=0;i--){
            if(cur>=w[i]&&dp[cur]==dp[cur-w[i]]+v[i]){
                x[i]=true;
                cur=cur-w[i];
            }
        }

        // 输出结果
        System.out.println("装入背包中物品总价值最大为： " + maxVal);
        System.out.print("装入的物品的序号为： ");
        for(int i=0;i<=n-1;i++){
            if(x[i]){
                System.out.print(i+1+" ");
            }
        }
    }
}