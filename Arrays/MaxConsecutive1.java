public class MaxConsecutive1 {
    
    public int findMaxConsecutiveOnes(int[] nums) {
        int current = 0;
        int max = 0;
        //current and max will be updated in each iteration, whre num would be 0 or 1.
        for (int num : nums) {   
            current = (current + num) * num;  //when num is 1, current will be 1, when num is 0(re-set on every 0)
            max = Math.max(max, current);   //update max with current if current is greater than max
        }
        return max;
    }

    public static void main(String[] args) {
        MaxConsecutive1 maxConsecutive1 = new MaxConsecutive1();
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(maxConsecutive1.findMaxConsecutiveOnes(nums));  //output:3
        
    }
}
