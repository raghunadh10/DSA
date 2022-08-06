package mywork;

public class Day1 {
	
	//Shifting the zeros to left side and ones to right side without using sorting method
	public static void main(String[] args) {
	 
	 int arr[]={1,1,1,1,0,0,0,0};

	 int i=0,j=arr.length-1;
	 int temp;
	 while(i<j) {
		 if(arr[i]!=0 && arr[j]!=1) {
			 temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
			 i++;
			 j--;
		 }
		 if(arr[i]==0) {
			 i++;
		 }
		 if(arr[j]==1) {
			 j--;
		 }
	 }
	 for(i=0;i<arr.length;i++) {
		 System.out.print(arr[i]);
	 }
	}
}
