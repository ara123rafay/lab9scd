public class ReverseArray {

    // Generic function to print an array in reverse order
    public static <T> void printReverse(T[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArr = {1, 2, 3, 4, 5};
        
        // Double array
        Double[] doubleArr = {1.1, 2.2, 3.3, 4.4, 5.5};
        
        // Character array
        Character[] charArr = {'H', 'E', 'L', 'L', 'O'};

        // Print integer array in reverse
        System.out.print("Integer array in reverse: ");
        printReverse(intArr);

        // Print double array in reverse
        System.out.print("Double array in reverse: ");
        printReverse(doubleArr);

        // Print character array in reverse
        System.out.print("Character array in reverse: ");
        printReverse(charArr);
    }
}