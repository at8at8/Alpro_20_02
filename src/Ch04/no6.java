package ch04;

public class no6 {
	public static void main(String[]args){
	int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

	System.out.println("Tampilkan Angka ganjil di apit genap");
	for (int i = 0;i<nilai.length;i++){
		try{
		if(nilai[i] % 2 != 0 && 	nilai[i-1] % 2 == 0 && nilai[i+1] % 2 == 0){
		System.out.print(nilai[i]+" ");}
		}
			
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.print(" ");
		} 
	} 
	
	}}