package no9;

public class angka2 {
	public static void main(String[]args){
	int [] nilai = {92, 12, 51, 38, 29, 26, 19, 48, 10, 55, 28, 32, 5};

	System.out.println("Tampilkan Angka yang memiliki nilai 2");
	for (int i = 0;i<nilai.length;i++){
		if(nilai[i] % 2 == 0 && nilai[i] != 38 && nilai[i] != 48 && nilai[i] != 8  ){
			System.out.print(nilai[i]+" ");
		} 
	} 
	
	}}