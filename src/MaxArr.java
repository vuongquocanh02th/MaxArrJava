import java.util.Scanner;

public class MaxArr {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the size of the array: ");
            size = sc.nextInt();
            if (size <= 0 || size > 20) {
                System.out.println("Size must be between 1 and 20");
            }
        } while (size <= 0 || size > 20);

        //Nhap gia tri cac phan tu
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        //Hien thi danh sach
        System.out.println("List: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();
        //Tim max
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Max element is: " + max + " at position " + index);
    }
}
