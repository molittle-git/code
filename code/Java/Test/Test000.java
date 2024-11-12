import java.util.Arrays;
import java.util.Scanner;

public class Test000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        pp(arr,0);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
    }
 
    }


public static void pp(int []arr,int first){
    if(first==arr.length){
        System.out.print(Arrays.toString(arr));
        System.out.println();
        }else{
        for(int i=first;i<arr.length;i++){
            swap(first,i,arr);
            pp(arr,first+1);
            swap(first,i,arr);
        }
    }
}
public static void swap(int pre, int next,int [] arr) {
    int tmp = arr[pre];
    arr[pre] = arr[next];
    arr[next] = tmp;
}

}
