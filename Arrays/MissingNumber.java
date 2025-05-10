import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
     Arrays.sort(nums);                       //sort array nums
     int missingNum = 0;
       for(int i = 0; i < nums.length; i++){
        if(nums[i] != i){ // if index no. is not equal to the value at the index, return index
            return i;
        }
        missingNum = i+1;  // if value is missing at the end of the array
       } 
       return missingNum;

    }
   public static void main(String[] args) {
    MissingNumber ms = new MissingNumber();
   
    int[] nums = new int[5];
    nums[0] = 1;
    nums[1] = 2;
    nums[2] = 3;
    nums[3] = 4;

   
   
   System.out.println(ms.missingNumber(nums)); 
   }
    
}
