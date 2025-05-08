class DuplicateRemove {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int k = 1;  // take k pointer, pointing to the unique valued array.
        for (int i = 1; i < nums.length; i++) { // iteration started from index-1, index-0 value fixed for comparision
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
     public static void main(String[] args){
        int[] arr = new int[]{1,1,2,2,3,4,5,6,6,6};
        DuplicateRemove dr = new DuplicateRemove(); 
        int newLength = dr.removeDuplicates(arr); // Call the method ONCE to process the entire array
        for(int i = 0; i < newLength; i++){
         System.out.println(arr[i]);

        }
        
     }

}