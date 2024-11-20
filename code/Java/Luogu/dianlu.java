package Java.Luogu;

public class dianlu{
    public int []c;
    public int [][]size;
    public int []net;
    public dianlu (int []cc){
        this.c=cc;
        this.size=new int[cc.length][cc.length];
        this.net=new int[cc.length];
    }
    public void meset(int []c,int[][]size){
        int n=c.length-1;
        for(int j=0;j<c[1];j++){
            size[1][j]=0;
        }
        for(int j=c[1];j<=n;j++){
            size[1][j]=1;
        }
        for(int i=2;i<n;i++){
            for(int j=0;j<c[i];j++){
                size[i][j]=size[i-1][j];
            }
            for(int j=c[i];j<=n;j++){
                size[i][j]=Math.max(size[i-1][j],size[i-1][c[i]-1]+1);
            }
        }
        size[n][n]=Math.max(size[n-1][n],size[n-1][c[n]-1]+1);
    }
    //构造最优解
    public int traceback(int[]c,int [][]size,int[]net){
        int n=c.length-1;
        int j=n;
        int m=0;
        for(int i=n;i>1;i--){
                if(size[i][j]!=size[i-1][j]){
                    net[m++]=i;
                    j=c[i]-1;
                }
        }
        if(j>=c[1])
            net[m++]=1;
            System.out.println("最大不相交连线分别是：");
            for(int t=m-1;t>=0;t--){
                System.out.println(net[t]+" "+c[net[t]]);
            }
            return m;
    }
    public static void main(String []args)
    {
        int []c={0,8,7,4,2,5,1,9,3,10,6};
        dianlu di=new dianlu(c);
        di.meset(di.c,di.size);
        int x=di.traceback(di.c,di.size,di.net);
        System.out.println("最大不相交连线数是："+x);
        
    }
}