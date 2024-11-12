package 算法;

import java.io.*;
import java.util.*;
public class  阿一_1快排{
    static BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter coup = new PrintWriter(new OutputStreamWriter(System.out));
	static StreamTokenizer t=new StreamTokenizer(cin);
    public static void main(String[] args) throws IOException {
		t.nextToken();
		int n = (int)t.nval;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
			t.nextToken();
            array[i] = (int)t.nval;
        }

        quickSort(array, 0, n - 1);

        System.out.println("排序后的数组：");
        for (int i = 0; i < n; i++) {
            coup.print(array[i] + " ");
			coup.flush();
        }
    }
public static void quickSort(int q[],int l,int r){
	if(l>=r) return;
	int i=l-1,j=r+1,x=q[l+r>>1];
	while(i<j){
		do i++;while(q[i]<x);
		do j--;while(q[j]>x);
		if(i<j) swap(q,i,j);
	}
	quickSort(q,l,j-1);
	quickSort(q,j+1,r);
}
public static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}
}
// public static void quickSort(int[] array, int low, int high) {
//         if (low < high) {
//             int pivotIndex = partition(array, low, high);
//             quickSort(array, low, pivotIndex - 1);
//             quickSort(array, pivotIndex + 1, high);
//         }
//     }

//     public static int partition(int[] array, int low, int high) {
//         int pivot = array[high]; 
//         int i = low - 1; 
//         for (int j = low; j < high; j++) {
//             if (array[j] < pivot) {
//                 i++;
//                 swap(array, i, j);
//             }
//         }
//         swap(array, i + 1, high); 
//     }
// }
    

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.StreamTokenizer;
// import java.util.Arrays;
// import java.util.Scanner;

// public class Main {
// 	static int []a = new int[5000005];
// 	static int x;
// 	public static void main(String[] args) throws Exception{
		
// 		int n;
// 		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
// 		st.nextToken();
// 		n=(int)st.nval;
// 		// st.nextToken();
// 		// x=(int)st.nval;
// 		for(int i = 0;i<n;i++) {
// 			st.nextToken();
// 			a[i]=(int)st.nval;
// 		}
// 		quickSort(a,0,n-1);
// 		for(int i=0;i<n;i++){
//             System.out.print(a[i] + " ");
//         }
// 	}
	
// 	public static void quickSort(int q[],int l,int r) {
// 		if(l>=r)
// 			return;
// 		int pivot = q[l];
// 		int i=l,j=r;
// 		while(i<j) {
// 			while(i<j && q[j]>=pivot) {
// 				j--;
// 			}
// 			while(i<j && q[i]<=pivot) {
// 				i++;
// 			}
// 			if(i<j) {
// 				int temp=q[i];
// 				q[i]=q[j];
// 				q[j]=temp;
// 			}
// 		}
// 		q[l]=q[i];
// 		q[i]=pivot;
// 		//if(i==x) return;
// 		//if(i>x)
// 		quickSort(q,l,i-1);
// 		//else if(i<x)
// 		quickSort(q,i+1,r);
// 	}
// }
