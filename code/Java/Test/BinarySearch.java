package Java.Test;

import java.util.Scanner;

public class BinarySearch {

    public static int[] binarySearch(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;

        int i = -1; // 小于x的最大元素位置
        int j = -1; // 大于x的最小元素位置

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == x) {
                i = j = mid; // 找到，返回索引
                break;
            } else if (array[mid] < x) {
                i = mid; // 更新小于x的最大元素位置
                left = mid + 1; // 忽略左半部分
            } else {
                j = mid; // 更新大于x的最小元素位置
                right = mid - 1; // 忽略右半部分
            }
        }

        return new int[]{i, j};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入数组的大小：");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("请输入数组的元素：");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("请输入要查找的关键字：");
        int key = scanner.nextInt();

        int[] result = binarySearch(array, key);

        if (result[0] == result[1]) {
            System.out.println("元素 " + key + " 在索引 " + result[0] + " 处");
        } else {
            System.out.println("元素 " + key + " 不在数组中，小于 " + key + " 的最大元素位置为 " + result[0] + "，大于 " + key + " 的最小元素位置为 " + result[1]);
        }

        scanner.close();
    }
}
