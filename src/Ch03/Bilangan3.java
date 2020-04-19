package ch03;
import java.util.Scanner;
public class Bilangan3 {
	public static void main(String[]args){
	Scanner s = new Scanner(System.in);
	System.out.print("Masukkan Nilai X = ");
	int x = s.nextInt();
	System.out.print("Masukkan Nilai Y = ");
	int y = s.nextInt();
	System.out.print("Masukkan Nilai Z = ");
	int z = s.nextInt();
	if(x>y){
		if(x>z){
		System.out.print("X Tertinggi");	
		} else {
			System.out.print("Z Tertinggi");	
		}
	} else {
		if(y>z){
			System.out.print("Y Tertinggi");
		} 
		else {System.out.print("Z Tertinggi");}
		
	}
	
}}