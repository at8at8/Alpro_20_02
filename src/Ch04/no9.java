package ch04;

public class no9 {
	public static void main(String[]args){
	int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

	System.out.println("Tampilkan Selisih angka ");
	for (int i = 0;i<nilai.length;i++){
		try{
		System.out.println("Nilai sekarang = "+nilai[i]+" Selisih dengan Nilai Selanjutnya "+Math.abs(nilai[i+1] - nilai[i]));
		}
			
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.print(" ");
		} 
	} 
}
	}