package no9;
import java.util.Scanner;
public class angka {
	public static void main(String[]args){
	int [] nilai = {92, 12, 51, 38, 29, 26, 19, 48, 10, 55, 28, 32, 5};
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