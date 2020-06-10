//Is Even? 
//Write a function to find whether the given input number is Even.
//If the given number is even, the function should return 2 else it should return 1.
//Note: The number passed to the function can be negative, positive or zero. Zero should be treated as Even. 
/*
import java.io.*;
import java.util.Scanner;
public class Day3_Programs
{
 public static void main(String args[])throws Exception
 {
  System.out.println("Enter the Number :");
  Scanner a=new Scanner(System.in);
  int n=a.nextInt();
  int result=isEven(n);
  System.out.println(result);
 } 
 public static int isEven(int n)
 {
  if(n%2==0)
    return 2;
  else
    return 1;
 }

}

OUTPUT:

D:\>javac Day3_Programs.java

D:\>java Day3_Programs
Enter the Number :
23
1

D:\>java Day3_Programs
Enter the Number :
24
2




//Is Odd? Write a function to find whether the given input number is Odd.
//If the given number is odd, the function should return 2 else it should return 1.
//Note: The number passed to the function can be negative, positive or zero.
//Zero should NOT be treated as odd
import java.io.*;
import java.util.Scanner;
public class Day3_Programs
{
 public static void main(String args[])throws Exception
 {
  System.out.println("Enter the Number :");
  Scanner a=new Scanner(System.in);
  int n=a.nextInt();
  int result=isOdd(n);
  System.out.println(result);
 } 
 public static int isOdd(int n)
 {
  if(n%2!=0)
    return 2;
  else
    return 1;
 }
}


OUTPUT:

D:\>javac Day3_Programs.java

D:\>java Day3_Programs
Enter the Number :
23
2

D:\>java Day3_Programs
Enter the Number :
24
1



//Return last digit of the given number 
//Write a function that returns the last digit of the given number. 
//Last digit is being referred to the least significant digit i.e.
//the digit in the ones (units) place in the given number.
//The last digit should be returned as a positive number. 
//for example,if the given number is 197, the last digit is 7 
//if the given number is -197, the last digit is 7 

import java.io.*;
import java.util.Scanner;
public class Day3_Programs
{
 public static void main(String args[])throws Exception
 {
  System.out.println("Enter the Number :");
  Scanner a=new Scanner(System.in);
  int n=a.nextInt();
  int result=LastDigit(n);
  System.out.println(result);
 } 
 public static int LastDigit(int n)
 {
  if(n>0)
   return n%10;
  else
   return -(n%10);
 }
}

OUTPUT:

D:\>javac Day3_Programs.java

D:\>java Day3_Programs
Enter the Number :
197
7

D:\>java Day3_Programs
Enter the Number :
-197
7



//Return second last digit of the given number 
//Write a function that returns the second last digit of the given number.
//Second last digit is being referred to the digit in the tens place in the given number. 
//for example,  if the given number is 197, the second last digit is 9 
//Note1 - The second last digit should be returned as a positive number.
//i.e. if the given number is -197, the second last digit is 9 
//Note2 - If the given number is a single digit number, then the second last
//digit does not exist. In such cases, the function should return -1.
//i.e. if the given number is 5, the second last digit should be returned as -1

import java.io.*;
import java.util.Scanner;
public class Day3_Programs
{
 public static void main(String args[])throws Exception
 {
  System.out.println("Enter the Number :");
  Scanner a=new Scanner(System.in);
  int n=a.nextInt();
  int result=SecondLastDigit(n);
  System.out.println(result);
 } 
 public static int SecondLastDigit(int n)
 {
  if((Math.abs((n%100)/10))==0)
   return (-1);
  else
   return (Math.abs((n%100)/10));
 }
}
 

OUTPUT:

D:\>javac Day3_Programs.java

D:\>java Day3_Programs
Enter the Number :
23
2

D:\>java Day3_Programs
Enter the Number :
-23
2

D:\>java Day3_Programs
Enter the Number :
9
-1



//Sum of last digits of two given numbers Rohit wants to add the last digits of two
//given numbers. For example, If the given numbers are 267 and 154, 
//the output should be 11. Below is the explanation - Last digit of the 
//267 is 7 Last digit of the 154 is 4 Sum of 7 and 4 = 11.
//Write a program to help Rohit achieve this for any given two numbers.

import java.io.*;
import java.util.Scanner;
public class Day3_Programs
{
 public static void main(String args[])throws Exception
 {
  System.out.println("Enter the Number :");
  Scanner a=new Scanner(System.in);
  int input1=Math.abs(a.nextInt());
  int input2=Math.abs(a.nextInt());
  int result=addLastDigits(input1,input2);
  System.out.println(result);
 } 
 public static int addLastDigits(int input1,int input2)
 {
  return (input1%10)+(input2%10);
 }
}
 
OUTPUT:

D:\>javac Day3_Programs.java

D:\>java Day3_Programs
Enter the Number :
12
23
5

D:\>java Day3_Programs
Enter the Number :
-98
-87
15

D:\>java Day3_Programs
Enter the Number :
3
-6
9

*/
