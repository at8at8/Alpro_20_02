package ch04;

public class no5 {
	public static void main(String[]args){
	int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

	System.out.println("Tampilkan Angka yang memiliki nilai 2");
	for (int i = 0;i<nilai.length;i++){
		if(nilai[i] % 2 == 0 && nilai[i] != 38 && nilai[i] != 48 && nilai[i] != 8  ){
			System.out.print(nilai[i]+" ");
		} 
	} 
	
	}}