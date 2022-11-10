public class Main {

    /* Билет 1. Задача.
   Напишите программу, которая переворачивает массив.
    */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    public static int[] reversedArray(int[] array) {
        int[] reversArray = new int[array.length];
        for (int i = 0; i < reversArray.length; i++) {
            reversArray[array.length - 1 - i] = array[i];
        }
        return reversArray;
    }

    public static void main(String[] args) {

        int[] startArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100};
        printArray(startArray);
        System.out.println();
        printArray(reversedArray(startArray));
    }


}


