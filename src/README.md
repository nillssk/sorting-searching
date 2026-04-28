#  Sorting and Searching Algorithm Analysis

## Project Overview

In this project, I used three algorithms:

* Bubble Sort
* Quick Sort
* Binary Search

The purpose of this project was to compare sorting and searching algorithms and check which one works faster.

I tested the program with different array sizes:

* Small array (10 elements)
* Medium array (100 elements)
* Large array (5000 elements)

I also tested:

* Random arrays
* Sorted arrays

I used `System.nanoTime()` to measure execution time.

---

## Algorithm Description

## Bubble Sort

Bubble Sort compares two neighboring elements and swaps them if they are in the wrong order.

It repeats this process until the whole array becomes sorted.

### Time Complexity

* O(n²)

Bubble Sort is simple, but it is slow for big arrays.

---

## Quick Sort

Quick Sort chooses one element as a pivot and separates smaller and bigger elements.

After that, it sorts both parts again.

### Time Complexity

* O(n log n)

Quick Sort is much faster than Bubble Sort.

---

## Binary Search

Binary Search works only with sorted arrays.

It checks the middle element and finds the target faster by dividing the array into two parts.

### Time Complexity

* O(log n)

Binary Search is very fast for large arrays.

---

## Experimental Results

## Experimental Results

### Random Array

| Size | Bubble Sort | Quick Sort | Binary Search |
| ---- | ----------: | ---------: | ------------: |
| 10   |     6600 ns |    5600 ns |       1700 ns |
| 100  |   206700 ns |   31300 ns |       1700 ns |
| 5000 | 21797800 ns |  589300 ns |       2700 ns |

---

### Sorted Array

| Size | Bubble Sort | Quick Sort | Binary Search |
| ---- | ----------: | ---------: | ------------: |
| 10   |     2500 ns |    3600 ns |       1100 ns |
| 100  |   135500 ns |  231200 ns |       1400 ns |
| 5000 | 18067300 ns | 5077500 ns |       6500 ns |


## Analysis

### Which sorting algorithm was faster?

Quick Sort was faster than Bubble Sort.

Bubble Sort needs more comparisons, so it becomes slow for large arrays.

Quick Sort works better with big arrays.

---

### How does size affect performance?

When array size becomes bigger, Bubble Sort becomes much slower.

Quick Sort also becomes slower, but not too much.

Binary Search stays very fast.

---

### How does sorted data affect performance?

Bubble Sort works better with sorted arrays because there are fewer swaps.

Binary Search needs sorted arrays to work correctly.

---

### Does it match Big-O?

Yes, the results are similar to Big-O theory.

Bubble Sort is slower because it is O(n²).

Quick Sort is faster because it is O(n log n).

Binary Search is the fastest because it is O(log n).

---

### Why is Binary Search better?

Binary Search is better because it checks the middle first and cuts the array into half.

It does not check every element like Linear Search.

---

### Why does Binary Search need sorted array?

Because it must know where to move: left or right.

If the array is not sorted, Binary Search cannot work correctly.

---

## Screenshots

### Small Array Output

![1](docs/screenshots/output1.png)

### Medium Array Output

![2](docs/screenshots/output2.png)

### Large Array Output

![3](docs/screenshots/output3.png)


---

## Reflection

This project helped me understand the difference between simple and fast algorithms.

I saw that Quick Sort is much better than Bubble Sort for large arrays.

Binary Search is also very useful, but it needs a sorted array.

The hardest part for me was Quick Sort because of recursion and measuring time correctly.
