package array;

import java.util.Arrays;

public class arrayy {
		public int[] arrayy(int [] array,int divisor) {
			int cnt=0;
			
			for (int i=0;i<array.length;i++) {
				if(array[i]%divisor==0)
					cnt++;
			}
			int j=0;// arr1ÀÇ ÀÎµ¦½º
			int []arr1=new int[cnt];
			for(int i=0;i<array.length;i++) {
				if(array[i]%divisor==0)
					arr1[j++]=array[i];
			}
			/*int temp;
			for(int i=0;i<cnt-1;i++) {
				
				if(arr1[i]>arr1[i+1])
				{	
					temp=arr1[i];
					arr1[i]=arr1[i+1];
					arr1[i+1]=temp;
				}
					
			}*/
			 Arrays.sort(arr1);
			 
			return arr1;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayy a=new arrayy();
		int []array= {8,4,53,20,56};
		int divisor=2;
		System.out.println(Arrays.toString(a.arrayy(array, divisor)));
	}

}
