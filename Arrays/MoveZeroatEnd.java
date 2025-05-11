public class MoveZeroatEnd {
    
    public void moveZeroes(int[] nums) {
      int lastNotZero = 0;
      for(int i = 0; i < nums.length; i++){
        //swappping the non-zero element with the zero element
        if(nums[i] != 0){
            int temp = nums[lastNotZero]; 
            nums[lastNotZero] = nums[i];
            nums[i] = temp;
            lastNotZero++;
            
        }
      }

    }

    public static void main(String[] args) {
        MoveZeroatEnd obj = new MoveZeroatEnd();
        int[] nums = {4,5,0,2,0,1,2};
        obj.moveZeroes(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
    }
}
}
    

