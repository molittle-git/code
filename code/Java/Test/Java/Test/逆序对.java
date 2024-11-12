package Java.Test;

import java.util.*;
public abstract class 逆序对 {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        System.out.println(redo(a,0,n-1));
    }
    public static long redo(int []a,int left,int right){
        long invCount=0;
        if(left<right){
            int mid=left+(right-left)/2;
            invCount+=redo(a,left,mid);
            invCount+=redo(a,mid+1,right);
            invCount+=merge(a,left,mid,right);
        }
        return invCount;
    }
    public static long merge(int []a,int left,int mid,int right){
        int []temp=new int[right-left+1];
        int i=left,j=mid+1,k=0;
        long invCount=0;
        while(i<=mid&&j<=right){
            if(a[i]<=a[j]){
                temp[k++]=a[i++];
            }else{
                temp[k++]=a[j++];
                invCount+=mid-i+1;
            }
        }
        while(i<=mid)temp[k++]=a[i++];
        while(j<=right)temp[k++]=a[j++];
        for(int p=0;p<temp.length;p++)a[left+p]=temp[p];
        return invCount;
    }
}
