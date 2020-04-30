package ch05;
import java.util.Scanner;
public class kadane{
public int maxSequenceSum(int[] arr) {        
int maxSoFar = arr[0], maxEndingHere = arr[0];

for (int i = 1; i < arr.length; i++){
if (maxEndingHere < 0){
maxEndingHere = arr[i]; }
else
{maxEndingHere += arr[i];}
if(maxEndingHere >= maxSoFar){
maxSoFar = maxEndingHere;}

        }
        return maxSoFar;
    }    
public static void main (String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Program Algoritma Kadane");
kadane k = new kadane();
System.out.print("Masukkan Panjang array : ");
int N = s.nextInt();
System.out.print("Masukkan "+ N +" array : ");
int[] arr = new int[N];
for (int i = 0; i < N; i++){
arr[i] = s.nextInt();}
int total = k.maxSequenceSum(arr);
System.out.println("Total Maksimum sequence = "+ total);	


    }

}