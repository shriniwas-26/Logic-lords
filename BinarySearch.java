class BinarySearch{
	static int bSearch(int[] arr,int key, int l, int r){
		if(l<=r){
			int mid = l+ (r-l)/2;
			if(key>arr[mid]){
				bSearch(arr,key,mid+1,r);
			}else if(key<arr[mid]){
				bSearch(arr,key,l,mid-1);
			}else{
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int[] arr = {24,80,46,28,32,2,8,9,66};
		int res = bSearch(arr,32,0,arr.length-1);
		if(res!=-1)
			System.out.println("Element found at index "+res);
		else
			System.out.println("Element not found");
	}
}