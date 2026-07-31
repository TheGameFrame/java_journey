package java_journey.Day6;

public record MinMax() {
    public static void main(String[] args) {

        // Declare and initialize the array
        int[] nums = {45, 22, 89, 16, 90, 33};

        // Initialize min and max with the first element
        int min = nums[0];
        int max = nums[0];

        // Enhanced for loop
        for (int num : nums) {
            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        // Print the smallest and largest numbers
        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}
