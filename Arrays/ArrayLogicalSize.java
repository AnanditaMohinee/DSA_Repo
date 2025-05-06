class ArrayLogicalSize{
//The function should return the updated logical size of array.
public static int deleteFromPosition(int[] arr, int n, int pos){   
    if(pos<0 || pos>n){
        return n;
    }

    for(int i = pos; i< n - 1; i++){
        arr[i] = arr[i + 1];
    }

     return n - 1;

   }

public static void main(String[] args) {
    int[] arr1 = new int[10];
    arr1[0] = 12;
    arr1[1] = 21;
    arr1[2] = 22;
    arr1[3] = 26;
    arr1[4] = 30;

    int original_logicalsize = 5;
    //print original  array
    for(int i = 0; i< original_logicalsize; i++){
        System.out.println("original array : " + arr1[i]);
    }
    System.out.println("============================"); 

    int modifiedLogicalsize = deleteFromPosition(arr1, original_logicalsize, 3);

    //print modified array 
    for(int i = 0; i< modifiedLogicalsize; i++){
        System.out.println( "modified array : " + arr1[i]);
    }
    //logical size after deletion array element of index 3
    System.out.println("Logical size of array after element deletion: "+ modifiedLogicalsize);



   }
    
}