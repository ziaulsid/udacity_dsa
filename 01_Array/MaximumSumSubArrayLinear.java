public class MaximumSumSubArrayLinear {

    public int maxSumArray(int[] input){

        int currentSum = 0;
        int currentSumMax = 0;

        for (int i=0; i<input.length;i++){

            currentSum = currentSum + input[i];
            if(currentSum < 0){
                currentSum = 0;
            }
             else if(currentSumMax < currentSum){
                 currentSumMax = currentSum;
            }
        }
        return currentSumMax;
    }
}
