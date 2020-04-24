package ch04;

public class no10 {
	public static void main(String[]args){
	int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

	System.out.println("Tampilkan Selisih angka genap yang mana selisih selanjutnya juga genap ");
	for (int i = 0;i<nilai.length;i++){
		try{
			if(nilai[i] % 2 == 0 && nilai[i+1] % 2 == 0){
		System.out.println("Nilai sekarang = "+nilai[i]+" Selisih dengan Nilai Selanjutnya "+Math.abs(nilai[i+1] - nilai[i]));
			}
		}
			
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.print(" ");
		} 
	} 
}
	}