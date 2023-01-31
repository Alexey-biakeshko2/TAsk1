import java.util.Arrays;

public class Task1 {

  public static void main(String[] args) {
    char[] array1 = new char[] { 'c', 'b', 'd', 'a', 'e' };
    bubbleSort(array1);
    System.out.println(Arrays.toString(array1));

    char[] array2 = new char[] { 'e', 'd', 'c', 'b', 'a' };
    bubbleSort(array2);
    System.out.println(Arrays.toString(array2));

    char[] array3 = new char[] { 'c', 'b', 'd', 'a', 'e' };
    insertionSort(array3);
    System.out.println(Arrays.toString(array3));

    char[] array4 = new char[] { 'e', 'd', 'c', 'b', 'a' };
    insertionSort(array4);
    System.out.println(Arrays.toString(array4));

    char[] array5 = new char[] { 'c', 'b', 'd', 'a', 'e' };
    selectionSort(array5);
    System.out.println(Arrays.toString(array5));

    char[] array6 = new char[] { 'e', 'd', 'c', 'b', 'a' };
    selectionSort(array6);
    System.out.println(Arrays.toString(array6));
  }

  private static void bubbleSort(char[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] > array[j]) {
          swap(array, i, j);
        }
      }
    }
  }

  private static void insertionSort(char[] array) {
    for (int i = 1; i < array.length; i++) {
      int j = i;

      while (j > 0 && array[j - 1] > array[j]) {
        swap(array, j - 1, j);
        j--;
      }
    }
  }

  private static void selectionSort(char[] array) {
    for (int i = 0; i < array.length; i++) {
      int minIndex = i;

      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }

      swap(array, i, minIndex);
    }
  }

  private static void swap(char[] array, int i, int j) {
    char tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
  }

}