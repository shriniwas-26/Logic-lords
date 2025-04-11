class BubbleSort{

	static void bSort(int arr[]){
		boolean sorted = false;
		for(int i=0; i<arr.length-1; i++){
			sorted = false;
			for(int j=0; j<arr.length-i-1; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					sorted = true;
				}
			}
			if(!sorted){
				break;
			}
		}
	}
	
	static void display(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args){
		int arr[] = {13,5,2,66,72,98,64};
		display(arr);
		bSort(arr);
		display(arr);
	}
	
}