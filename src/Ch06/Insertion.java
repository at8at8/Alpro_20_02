package ch06;
public class Insertion{
public static void main(String args[])
{
int a[]={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
for(int i=0;i<a.length;i++)
{
int min=a[i];
int j=i;
while((j>0)&&(min<a[j-1]))
{
a[j]=a[j-1];
j--;
}
a[j]=min;
}
// mencetak hasil
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+",");
}
}
}