package com.acabes.assignment.gokulassignment.Sept26;
interface Sortable{
    abstract void sort(int[] Arr);
}
class QuickSort{
    void sort(int[] arr){
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted array in Quick Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
    void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
class  MergeSort{
    void sort(int arr[]){
        mergeSort(arr);

        System.out.println("Sorted array in Merge Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}
public class SortableProgram {
    public  static  void main(String[] args){
        MergeSort sr=new MergeSort();
        QuickSort qr=new QuickSort();
        int[] Ar={2,3,17,5,6,15};
        sr.sort(Ar);
        qr.sort(Ar);
    }
}
