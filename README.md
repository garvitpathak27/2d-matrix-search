# 2D Matrix Search Using Binary Search

## Description

This Java program searches for a specific element in a 2D matrix. Each row of the matrix is sorted, and the code efficiently finds the target element using binary search. The matrix is treated as an array of rows, and for each row, binary search is applied to quickly locate the element.

### Functions Overview:

1. **`findelement(int[][] arr, int token)`**:
   - This function checks each row in the matrix to find the target element (`token`).
   - It calls the `binarysearch` function for every row.
   - Returns `true` if the element is found in any row; otherwise, returns `false`.

2. **`binarysearch(int[] arr, int token)`**:
   - This function performs a binary search on a **sorted 1D array** (each row of the matrix).
   - It reduces the search space by half in each iteration to efficiently locate the target.
   - Returns `true` if the target is found, otherwise returns `false`.

### Code Explanation:

The `findelement` function iterates over each row of the matrix and applies `binarysearch` on each row. Binary search, being O(log n), is a highly efficient way to search through each sorted row. The overall complexity is O(m * log n), where `m` is the number of rows and `n` is the number of columns.

## Code:

```java
public class MatrixSearch {

    // Function to find the target element in a 2D matrix
    public static boolean findelement(int arr[][] , int token) {
        for (int i = 0; i < arr.length; i++) {
            if (binarysearch(arr[i], token)) {
                return true;  // Return true if the element is found in any row
            }
        }
        return false;  // Return false if the element is not found
    }

    // Function to perform binary search on a 1D array
    public static boolean binarysearch(int[] arr, int token) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == token) {
                return true;  // Return true if the target is found
            }
            if (arr[mid] > token) {
                right = mid - 1;  // Search the left half
            } else {
                left = mid + 1;  // Search the right half
            }
        }
        return false;  // Return false if the target is not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int token = 5;
        System.out.println("Element found: " + findelement(matrix, token));
    }
}
