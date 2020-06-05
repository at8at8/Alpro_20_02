package no9;

public class kelipatan3 {
	public static void main(String[]args){
	int [] nilai = {92, 12, 51, 38, 29, 26, 19, 48, 10, 55, 28, 32, 5};

	System.out.println("Tampilkan Angka Kelipatan 3");
	for (int i = 0;i<nilai.length;i++){
		if(nilai[i] % 3 == 0){
			System.out.print(nilai[i]+" ");
		} 
	} 
	
	}}