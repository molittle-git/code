import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n,i,j,h,k;
        String[]a=new String[1025];
        n=sc.nextInt();
        a[1]= " /\\ ";
        a[2]= "/__\\";
        h=1;
        for(i=1;i<n;i++){
            h=h*2;
            for(j=1;j<=h;j++){
                a[h+j]=a[j]+a[j];
            }
            for(j=1;j<=h;j++){
                StringBuilder sb=new StringBuilder();
                for(k=0;k<h;k++){
                    sb.append(' ');
                }
                sb.append(a[j]);
              for(k=0;k<h;k++){
            	 sb.append(' ');
			}
                a[j]=sb.toString();
            }
        }
        for(i=1;i<=h*2&&i<=a.length;i++){
            System.out.println(a[i]);
        }
        sc.close();
    }
}