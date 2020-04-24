package ch04;

public class no12 {
	public static void main(String[]args){
	int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

	System.out.println("Tampilkan angka yang mana apabila ditambah dengan nilai selanjutnya berhasilkan genap");
	for (int i = 0;i<nilai.length;i++){
		try{
		if((nilai[i]+nilai[i+1]) % 2 == 0)
			System.out.print(nilai[i]+" ");
		}
			
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.print(" ");
		} 
	} 
}
	}