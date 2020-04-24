package ch04;

public class no14 {
	public static void main(String[]args){
	int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

	System.out.println("Tampilkan angka, beserta angka sebelumnya ");
	for (int i = 0;i<nilai.length;i++){
		try{
		
		System.out.println("Nilai sekarang = "+nilai[i]+" Nilai Sebelumnya adalah "+nilai[i-1]);
		}
			
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.print("");
		} 
	} 
}
	}