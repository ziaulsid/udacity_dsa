class AddOne{
    public int[] plusOne(int[] digits) {
        
        int length = digits.length;
        int[] result = new int[length + 1];
      
        
        for(int i = length-1; i >= 0; i--){
            
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        result[0]++;
        return result;
    } 
}