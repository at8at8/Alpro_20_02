package ch03;
import java.util.Scanner;
public class Prima {
	public static void main(String[]args){

	Scanner s = new Scanner(System.in);
	System.out.print("Masukkan Nilai = ");
	int a = s.nextInt();
	if(a<2){
		System.out.print(a+" Bukan Bilangan Prima");
	} else if(a % 2 == 0 || a % 3 == 0 || a % 5 ==0 || a % 7==0 && a>7){
		System.out.print(a +" Bukan Bilangan Prima");
	} else {
		System.out.print(a +" Bilangan Prima");
	}
	
	
	}}