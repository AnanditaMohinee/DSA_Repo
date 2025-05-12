public class MaxIncreasing {

    
    public int findLengthOfLCIS(int[] nums) {
        int count = 1; // at least one element is there
        int max = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i - 1] < nums[i]){
                count++;
                max = Math.max(max, count);
            }

            else
            count = 1;
             }

        return max;
        }

        public static void main(String[] args) {
            MaxIncreasing obj = new MaxIncreasing();
            int[] nums = {1,3,6,7,1,2,4,5,6,7,8};
            System.out.println(obj.findLengthOfLCIS(nums));
        }
}
    

