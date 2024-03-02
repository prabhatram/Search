public class Search {

    /**
     * Performs a binary search on the given sorted array to find the target element.
     *
     * @param  sortedArray  the array to be searched
     * @param  target       the element to be found
     * @return             the index of the target element if found, -1 otherwise
     */
    public static int binarySearch(int[] sortedArray, int target) {
        int left = 0;
        int right = sortedArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("Left: " + left + ", Mid: " + mid + ", Right: " + right);

            if (sortedArray[mid] == target) {
                return mid; 
            } else if (sortedArray[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return -1; 
    }

    
    public static void main(String[] args) {
        int[] data = {3, 8, 15, 17, 22, 36, 45}; 
        int target = 15; 

        int resultIndex = binarySearch(data, target);
        if (resultIndex == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + resultIndex);
        }
    }
}
