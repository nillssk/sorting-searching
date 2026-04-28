import java.util.Arrays;

public class Experiment {

    Sorter sorter = new Sorter();
    Searcher searcher = new Searcher();

    // measure sorting time
    public long measureSortTime(int[] arr, String type) {
        int[] copy = Arrays.copyOf(arr, arr.length);

        long start = System.nanoTime();

        if (type.equals("basic")) {
            sorter.basicSort(copy);
        } else {
            sorter.advancedSort(copy);
        }

        long end = System.nanoTime();

        return end - start;
    }

    // m searching time
    public long measureSearchTime(int[] arr, int target) {
        int[] copy = Arrays.copyOf(arr, arr.length);

        sorter.advancedSort(copy); // sort first for binary search

        long start = System.nanoTime();

        searcher.search(copy, target);

        long end = System.nanoTime();

        return end - start;
    }

    // run all expr
    public void runAllExperiments() {
        int[] sizes = {10, 100, 5000};

        for (int size : sizes) {
            System.out.println("Array size: " + size);

            int[] randomArray = sorter.generateRandomArray(size);
            int[] sortedArray = Arrays.copyOf(randomArray, randomArray.length);
            Arrays.sort(sortedArray);

            long bubbleRandom = measureSortTime(randomArray, "basic");
            long quickRandom = measureSortTime(randomArray, "advanced");
            long searchRandom = measureSearchTime(randomArray, randomArray[0]);

            System.out.println("Random Array:");
            System.out.println("Bubble Sort Time: " + bubbleRandom + " ns");
            System.out.println("Quick Sort Time: " + quickRandom + " ns");
            System.out.println("Binary Search Time: " + searchRandom + " ns");

            long bubbleSorted = measureSortTime(sortedArray, "basic");
            long quickSorted = measureSortTime(sortedArray, "advanced");
            long searchSorted = measureSearchTime(sortedArray, sortedArray[0]);

            System.out.println("\nSorted Array:");
            System.out.println("Bubble Sort Time: " + bubbleSorted + " ns");
            System.out.println("Quick Sort Time: " + quickSorted + " ns");
            System.out.println("Binary Search Time: " + searchSorted + " ns");

            System.out.println("\n----------------------------\n");
        }
    }
}