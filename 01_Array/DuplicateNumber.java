public class DuplicateNumber {

    public int findDuplicate(int[] nums) {

        int arraySum = 0;
        int rangeSum = 0;
        int duplicate = 0;
        int arrayLength = nums.length;

        //Range of elements present in the array
        int range = arrayLength - 2;

        //Sum of elements in the given range
        rangeSum = range*(range + 1)/2;

        //Sum of elements in the entire array
        for(int i=0; i <= arrayLength-1; i++){

            arraySum += nums[i];

        }

        duplicate = arraySum - rangeSum;
        return duplicate;
    }
}