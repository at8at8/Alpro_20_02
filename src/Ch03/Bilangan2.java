package ch03;
import java.util.Scanner;
public class Bilangan2 {
	public static void main(String[]args){
	Scanner s = new Scanner(System.in);
	System.out.print("Masukkan Nilai X = ");
	int x = s.nextInt();
	System.out.print("Masukkan Nilai Y = ");
	int y = s.nextInt();
	if(x>y){
		System.out.print("X Tertinggi");
	} else {
		System.out.print("Y Tertinggi");
	}
	
}}