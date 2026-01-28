public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, -5};
    int min = Integer.MAX_VALUE;
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    System.out.println("Minimum element in array: " + min);
}