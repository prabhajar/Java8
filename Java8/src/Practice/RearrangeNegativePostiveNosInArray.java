package Practice;

import java.util.Arrays;

public class RearrangeNegativePostiveNosInArray {
	/*2.Rearrange the array in such a way as one negative one positive 
	a[] = {1,2,3,-1.-2,5,6,-6}
	out put a = {-6,1,-2,2,-1,3,5,6}"
*/	public static void main(String[] args) {
		int a[] = {1,2,3 ,-1,-2,5,6,-6};
		Arrays.sort(a);
		int arr[]=a;
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] +" " );
		System.out.println();
		int j=0;
		for(int i=0; i<arr.length; i=i+2) {
				if(arr[i]>0) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					j++;
				}
		}
		for(int i=0; i<arr.length; i++)
		System.out.print(arr[i] +" " );
	}

}
