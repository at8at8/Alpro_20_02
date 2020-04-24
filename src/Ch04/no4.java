package ch04;

public class no4 {
	public static void main(String[]args){
	int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

	System.out.println("Tampilkan Angka Kelipatan 3");
	for (int i = 0;i<nilai.length;i++){
		if(nilai[i] % 3 == 0){
			System.out.print(nilai[i]+" ");
		} 
	} 
	
	}}