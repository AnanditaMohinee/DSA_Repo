import java.util.Arrays;

class AddOne {
    public int[] plusOne(int[] digits) {

        int n = digits.length;

        for(int i = n - 1; i >= 0; i--){
            if(digits[i] < 9){
             digits[i]++;
             return digits;
            }

            digits[i] = 0;
        }

        // If we reach here, all digits were 9 (e.g., 999 → 1000)
        int[] newDigits = new int[n + 1]; // new array
        newDigits[0] = 1;  // Set first digit to 1, rest are 0
        return newDigits;
       
      }

      public static void main(String[] args){
        AddOne addOne = new AddOne();
        int[] arr = {9};
        int[] result = addOne.plusOne(arr);
        System.out.println(Arrays.toString(result));

      }
}