
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // 1.A
        System.out.println("Original Array:");
        printArray(array);

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                // Swap elements if the current element is greater than the next one
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }


        System.out.println("\nArray After Swapping: (1.A)");
        printArray(array);
    }


    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();



    }
    }
