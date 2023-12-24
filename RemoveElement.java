  import java.util.Arrays;
 
  public class RemoveElement {
    public static void main(String[] args) {
       //test case1
        int[] nums1 = {0, 0, 2, 1, 2, 2, 2, 3, 3, 4};
         int val1 = 2; 
        System.out.println("Test Case 1:");
          System.out.println("Original Array: " + Arrays.toString(nums1));
         int newSize1 = removeElement(nums1, val1);
         System.out.println("New Size: " + newSize1);
         System.out.println("Remaining Elements: " + Arrays.toString(Arrays.copyOf(nums1, newSize1)));
       
        // Test Case 2:
       
        int[] nums2 = {1, 1, 2};
          int val2 = 1;
        System.out.println("\nTest Case 2:");
         System.out.println("Original Array: " + Arrays.toString(nums2));
          int newSize2 = removeElement(nums2, val2);
        System.out.println("New Size: " + newSize2);
          System.out.println("Remaining Elements: " + Arrays.toString(Arrays.copyOf(nums2, newSize2)));
    }
    static int removeElement(int nums[], int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }}
        return count;
     }}
