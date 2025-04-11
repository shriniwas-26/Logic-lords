class LSearch{
	
	static int search(int arr[],int x){
		int n = arr.length;
		for(int i=0;i<n;i++){
			if(arr[i] == x){
				return i;//2
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {10,50,70,30,20};
		int key =30;
		int result = search(arr, key);
		System.out.println(result);
		key = 100;
		result = search(arr, key);
		System.out.println(result);
		
		
		
		
	}
}