import java.util.*;
class alphabet
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch;
System.out.println("enter a character");
ch=sc.next().charAt(0);
switch(ch)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
System.out.println("vowel");
break;
default:System.out.println("consonant");
}
}
}