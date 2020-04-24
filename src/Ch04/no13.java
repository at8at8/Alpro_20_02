package ch04;

public class no13 {
	public static void main(String[]args){
	int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
	int selisih = 0;
	
	for (int i = 0;i<nilai.length;i++){
		try{
		selisih += Math.abs(nilai[i+1]-nilai[i]); }
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.print(" ");
		} 		
	}
	System.out.println("Total Seluruh selisih per angka adalah "+selisih);
	
}
	}