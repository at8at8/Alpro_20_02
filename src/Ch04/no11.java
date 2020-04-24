package ch04;

public class no11 {
	public static void main(String[]args){
	int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

	System.out.println("Tampilkan angka yang bilangan selanjutnya lebih besar dari angka sekarang ");
	for (int i = 0;i<nilai.length;i++){
		try{
			if(nilai[i+1]>nilai[i]){
		System.out.print(nilai[i]+" ");
		}
		}
			
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.print(" ");
		} 
	} 
}
	}