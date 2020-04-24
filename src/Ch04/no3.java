package ch04;
import java.util.Scanner;
public class no3 {
	public static void main(String[]args){
	int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
	Scanner s = new Scanner(System.in);
	System.out.println("Tampilkan Angka Ganjil");
	for (int i = 0;i<nilai.length;i++){
		if(nilai[i] % 2 != 0){
			System.out.print(nilai[i]+" ");
		} 
	} 
	
	}}