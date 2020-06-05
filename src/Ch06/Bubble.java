package ch06;
public class Bubble{
	public static void main(String[]args){
		int i,j,swap;
		
		
		int array[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
		
		for(i=0;i<(array.length-1);i++){
			for(j=0;j<array.length-i-1;j++){
				if(array[j] > array[j+1]){
					swap = array[j];
					array[j] = array[j+1];
					array[j+1] = swap;
				}
			}
		}
		for(i=0;i<array.length;i++)
			System.out.print(array[i]+ " ");
		
	}
	
	
}