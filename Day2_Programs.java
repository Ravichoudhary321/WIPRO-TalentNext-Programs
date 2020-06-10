// Write a program to accept a number N and print whether it is positive, negative or zero 
/*
import java.io.*;
import java.util.Scanner;
public class Day2_Programs
{
 public static void main(String args[])throws Exception
 {
  Scanner myobj=new Scanner(System.in);
  System.out.println("Enter the Number : ");
  int a=myobj.nextInt();
  if(a>0)
   System.out.println("Number is an positive Number");
  else if(a<0)
   System.out.println("Number is negative Number");
  else
   System.out.println("Number is Zero");
 }
}

OUTPUT:

D:\>javac Day2_Programs.java

D:\>java Day2_Programs
Enter the Number :
12
Number is an positive Number

D:\>java Day2_Programs
Enter the Number :
-98
Number is negative Number

D:\>java Day2_Programs
Enter the Number :
0
Number is Zero  
 



// Write a program to accept two numbers and print the greater value of the two 

import java.io.*;
import java.util.Scanner;
public class Day2_Programs
{
 public static void main(String args[])throws Exception
 {
  Scanner myobj=new Scanner(System.in);
  System.out.println("Enter the Number : ");
  int a=myobj.nextInt();
  int b=myobj.nextInt();
  if(a>b)
   System.out.println(a+" is greater than "+b);
  else if(b>a)
   System.out.println(b+" is greater than "+a);
  else
   System.out.println(a+" is equal to "+b);
 }
}

OUTPUT:

D:\>javac Day2_Programs.java

D:\>java Day2_Programs
Enter the Number :
12
23
23 is greater than 12

D:\>java Day2_Programs
Enter the Number :
0
0
0 is equal to 0


// Write a program to accept a number N and print whether the number is EVEN or ODD 

import java.io.*;
import java.util.Scanner;
public class Day2_Programs
{
 public static void main(String args[])throws Exception
 {
  Scanner myobj=new Scanner(System.in);
  System.out.println("Enter the Number : ");
  int a=myobj.nextInt();
  if(a%2==0)
   System.out.println(a+" is an Even Number");
  else
   System.out.println(a+" is an Odd Number");
 }
}

OUTPUT:

D:\>javac Day2_Programs.java

D:\>java Day2_Programs
Enter the Number :
23
23 is an Odd Number

D:\>java Day2_Programs
Enter the Number :
24
24 is an Even Number



// Write a program to accept two numbers and print whether their sum is EVEN or ODD 

import java.io.*;
import java.util.Scanner;
public class Day2_Programs
{
 public static void main(String args[])throws Exception
 {
  System.out.println("Enter the Numbers: ");
  Scanner myobj=new Scanner(System.in);
  int a=myobj.nextInt();
  int b=myobj.nextInt();
  int c=(a+b);
  if(c%2==0)
   System.out.println("Sum is Even");
  else
  System.out.println("Sum is Odd");
 }
}

OUTPUT:

D:\>javac Day2_Programs.java

D:\>java Day2_Programs
Enter the Numbers:
34
54
Sum is Even

D:\>java Day2_Programs
Enter the Numbers:
54
57
Sum is Odd



// Write a program to print all numbers from 1 to 100 i.e. 1 2 3 4 5 6 7 . . . 98 99 100 

import java.io.*;
public class Day2_Programs
{
 public static void main(String args[])throws Exception
 {
  int i=1; 
  while(i<=100)
  {
   System.out.print(i);
   System.out.print(" ");
   i++;
   }
 }
}

OUTPUT:

D:\>javac Day2_Programs.java

D:\>java Day2_Programs
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100


// Write a program to print alternate numbers starting from 1 to 99 i.e. 1 3 5 7 9 11 13 . . . 95 97 99
import java.io.*;
public class Day2_Programs
{
 public static void main(String args[])throws Exception
 {
  int i=1; 
  while(i<=100)
  {
   System.out.print(i);
   System.out.print(" ");
   i=i+2;
   }
 }
}

OUTPUT:

D:\>javac Day2_Programs.java

D:\>java Day2_Programs
1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59 61 63 65 67 69 71 73 75 77 79 81 83 85 87 89 91 93 95 97 99

// Write a program to print alternate numbers starting from 0 to 100 i.e. 0 2 4 6 8 10 12 . . . 96 98 100
import java.io.*;
public class Day2_Programs
{
 public static void main(String args[])throws Exception
 {
  int i=0; 
  while(i<=100)
  {
   System.out.print(i);
   System.out.print(" ");
   i=i+2;
   }
 }
}

OUTPUT:

D:\>javac Day2_Programs.java

D:\>java Day2_Programs
0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100


// Write a program to print all numbers backwards from 100 to 0 i.e. 100 99 98 97 96 . . . 4 3 2 1 0 
import java.io.*;
public class Day2_Programs
{
 public static void main(String args[])throws Exception
 {
  int i=100; 
  while(i>=0)
  {
   System.out.print(i);
   System.out.print(" ");
   i--;
   }
 }
}

OUTPUT:

D:\>javac Day2_Programs.java

D:\>java Day2_Programs
100 99 98 97 96 95 94 93 92 91 90 89 88 87 86 85 84 83 82 81 80 79 78 77 76 75 74 73 72 71 70 69 68 67 66 65 64 63 62 61 60 59 58 57 56 55 54 53 52 51 50 49 48 47 46 45 44 43 42 41 40 39 38 37 36 35 34 33 32 31 30 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0


// Write a program to print numbers backwards from 100 to 1 by skipping 2 numbers i.e. 100 97 94 91 88 85 82 79. . . 22 19 16 13 10 7 4 1 
import java.io.*;
public class Day2_Programs
{
 public static void main(String args[])throws Exception
 {
  int i=100; 
  while(i>=0)
  {
   System.out.print(i);
   System.out.print(" ");
   i=i-3;
   }
 }
}

OUTPUT:

D:\>javac Day2_Programs.java

D:\>java Day2_Programs
100 97 94 91 88 85 82 79 76 73 70 67 64 61 58 55 52 49 46 43 40 37 34 31 28 25 22 19 16 13 10 7 4 1

*/

