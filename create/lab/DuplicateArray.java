//Duplicate Array
//To find duplicate elements and copy to another array. 

public class DuplicateArray{

public static  void dup(int []arr,int n) {
		for(int i = 0; i< n; i++ ) {
			int index = arr[i] % n ;
			arr[index] +=n;
		}
		for(int i=0;i<n;i++) {
			if((arr[i]/n)>=2)
System.out.println(i+" ");

		}
		
			
	}
	
	public static void main (String[]args) {
		int []arr= {1,3,4,2,3};
		int arr_size=arr.length;
		
		System.out.println(" dup element");
		dup(arr,arr_size);
		int []array=new int[arr_size];
		for(int i=0;i<arr.length;i++) {
			System.out.println(array);
			array=arr;
		 } 
		 System.out.print("dupilcate");
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
	}
		 
		 
			
			
			
	}
}
