import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThirdLargestNo {

    public int thirdMax(int[] nums) {
       Set<Integer> distinct = new HashSet<>(); // HashSet stored distinct elements
       for(int num : nums){
        distinct.add(num);
       }

       List<Integer> sorted = new ArrayList<>(distinct); //list of array elements

    //sort(list, operation) menthod sorted the list of element in descending order
       Collections.sort(sorted, Collections.reverseOrder()); 
       return sorted.size() >= 3 ? sorted.get(2) : sorted.get(0);
        
    }   
    
    public static void main(String[] args) {
        ThirdLargestNo obj = new ThirdLargestNo();
        int[] nums = {2, 2, 3, 1};
        //int[] nums = {1, 2}; // Output: 2
        //int[] nums = {3,1,2}; // Output: 1

        System.out.println(obj.thirdMax(nums)); // Output: 1
    }
        
}
    

