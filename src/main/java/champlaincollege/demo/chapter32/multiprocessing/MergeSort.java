package champlaincollege.demo.chapter32.multiprocessing;

public class MergeSort {

    /** Sort the array using merge sort */
    public static void mergeSort(int[] list) {
        if (list.length > 1) {
            // Merge sort the first half
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            // Merge sort the second half
            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2,
                    secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);

            // Merge the two sorted halves
            merge(firstHalf, secondHalf, list);
        }
    }

    /** Merge firstHalf and secondHalf into temp */
    public static void merge(int[] firstHalf, int[] secondHalf, int[] temp) {
        int current1 = 0; // Current index in firstHalf
        int current2 = 0; // Current index in secondHalf
        int current3 = 0; // Current index in temp

        while (current1 < firstHalf.length && current2 < secondHalf.length) {
            if (firstHalf[current1] < secondHalf[current2])
                temp[current3++] = firstHalf[current1++];
            else
                temp[current3++] = secondHalf[current2++];
        }

        while (current1 < firstHalf.length)
            temp[current3++] = firstHalf[current1++];

        while (current2 < secondHalf.length)
            temp[current3++] = secondHalf[current2++];
    }
}
