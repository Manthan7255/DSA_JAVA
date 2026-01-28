//Multiply even indexed elements by 2 and odd indexed elements by 10
public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] *= 2; // Multiply odd indexed elements by 2
            } else {
                arr[i] += 10; // Multiply even indexed elements by 10
            }
        }
        System.out.print("Modified array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}