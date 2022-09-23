//Duplicate Array
//To find duplicate elements and copy to another array. 

public class DuplicateArray{

public static  void dup(int []arr,int n,int []arr1) {
	
		for(int i = 0 ; i< n; i++ ) {
			int index = arr[i] % n ;
			arr[index] +=n;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<1;j++) {
			if((arr[i]/n)>=2) {
				arr1[j]=i;
				System.out.println(" dup element="+" "+i);
            
          
            System.out.println("copy element is="+" "+arr1[j]);
			}
			
			}	
		
		}
	}
	public static void main (String[]args) {
		 int[] arr= {1,3,4,2,3,4};
		int arr_size=arr.length;
		int arr1[]=new int[arr_size];
		
		dup(arr,arr_size,arr1);
		 	
		}
}
		

