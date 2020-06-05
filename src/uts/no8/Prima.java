package no8;
import java.util.Scanner;
public class Prima {
	public static void main(String[]args){

	Scanner s = new Scanner(System.in);
	System.out.print("Masukkan Nilai = ");
	int a = s.nextInt();
	if(a<2){
		System.out.print(a+" Bukan Bilangan Prima");
	} else if((a % 2 == 0 || a % 3 == 0 || a % 5 ==0 || a % 7==0) && (a != 2 && a != 3 && a != 5 && a != 7)){
		System.out.print(a +" Bukan Bilangan Prima");
	} else {
		System.out.print(a +" adalah Bilangan Prima");
	}
	
	
	}}