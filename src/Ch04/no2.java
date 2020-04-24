package ch04;
import java.util.Scanner;
public class no2 {
	public static void main(String[]args){
	int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
	System.out.println("Tampilkan Angka Yang Dicari");
	Scanner s = new Scanner(System.in);
	System.out.print("Masukkan Angka = ");
	int a = s.nextInt();
	for (int i = 0;i<nilai.length;i++){
		if(nilai[i] == a){
			System.out.print(nilai[i]+" ");
		} 
	} 
	
	}}