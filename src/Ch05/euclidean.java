package ch05;
import java.util.Scanner;
public class euclidean {
 
public static void main(String[] args) {
int a1,b1;
Scanner s = new Scanner(System.in);
System.out.println("Program Algoritma Euclidean - FPB");
System.out.print("Masukkan nilai ke 1 : ");
int a = s.nextInt();
System.out.print("Masukkan nilai ke 2 : ");
int b = s.nextInt();


if(a>b){
	 a1 = b;
	 b1 = a;
} else {
	 a1 = a;
	 b1 = b;
}
for (int i = b1; i>0; i--){
    if(b1%i==0&&a1%i==0){
    int fpb =i;
    System.out.println("Nilai FPB dari "+a+" dan "+b+" adalah "+ fpb);     
    break;
            }}}}