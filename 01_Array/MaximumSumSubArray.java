public class MaximumSumSubArray {

    public int maxSumArray(int[] input){

        int curr_sum;
        int max_sum =0;

        for (int i=0; i<input.length;i++){

            curr_sum = 0;
            for(int j=i; j<input.length;j++){

                curr_sum += input[j];

                if(curr_sum > max_sum){
                    max_sum = curr_sum;
                }

            }
        }
        return max_sum;
    }
}
