package ch08;
import java.util.Scanner;
public class lcs { 
    int lcs(char[] X, char[] Y, int m, int n) 
    { 
        if (m == 0 || n == 0) 
            return 0; 
        if (X[m - 1] == Y[n - 1]) 
            return 1 + lcs(X, Y, m - 1, n - 1); 
        else
            return max(lcs(X, Y, m, n - 1), lcs(X, Y, m - 1, n)); 
    } 
int max(int a, int b) 
{ 
  return (a > b) ? a : b; 
  } 
    public static void main(String[] args){ 
        lcs a = new lcs(); 
		Scanner s = new Scanner(System.in);
		System.out.print("Masukkan String Pertama : ");
        String s1 = s.next();
		System.out.print("Masukkan String Kedua : ");		
        String s2 = s.next();
  
        char[] X = s1.toCharArray(); 
        char[] Y = s2.toCharArray(); 
        int m = X.length; 
        int n = Y.length; 
  
        System.out.println("Panjang LCSnya adalah "+ a.lcs(X, Y, m, n)); 
    } 
} 