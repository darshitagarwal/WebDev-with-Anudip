package test;

public class MissingNo {
//Find the Missing Number: Given an array containing n 
//distinct numbers taken from 0, 1, 2, ..., n, find 
//the missing number.

	public static void main(String[] args) {
		int [] a= {0,1,2,3};
		int i;
		for(i=0;i<a.length-1;i++){
			if((a[i+1]-a[i])!=1)
				break;
			
		}
		if(i<(a.length-1))
		System.out.println((a[i+1]-1)+" is missing.");
		else
			System.out.println("No element is missing");
	}
}
