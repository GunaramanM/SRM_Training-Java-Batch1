import java.util.Arrays;

class BiSerSort{  
    public static void main(String args[]){  
        int arr[] = {8,17,3,22,56};  
        int key = 22;  
        int result = Arrays.binarySearch(arr,key);  
        if (result < 0)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  

            Arrays.sort(arr);
 
        System.out.printf("Sorted array is :"+ Arrays.toString(arr));
    }  
}
