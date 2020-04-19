package ch03;
import java.util.Scanner;
public class Pembagi {
	public static void main(String[]args){
	int c;
	int i;
	Scanner s = new Scanner(System.in);
	System.out.print("Masukkan Nilai = ");
	int a = s.nextInt();
	for(i = 1;i<=a;i++){
	c = a/i;
	if(i > 2 && i * c == a && a % i == 0){
		System.out.print(i+" ");
		
		
	} 	
}}}