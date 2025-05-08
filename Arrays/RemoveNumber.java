class RemoveNumber {
    public int removeElement(int[] nums, int val) {
         
        if(nums.length == 0)
         return 0;
        int k = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];  // modify given array
                k++;
            }

        }
        return k; // gives length of new array
    }

    public static void main(String[] args){

        int[] arr = new int[]{1,2,3,5,6,2,2,4};
        RemoveNumber removeNumber = new RemoveNumber();
        int val = 2; //given val to remove
        int newArrLength = removeNumber.removeElement(arr, val);

        for(int i = 0; i < newArrLength; i++){
            System.out.println(arr[i]);
        }


    }
}