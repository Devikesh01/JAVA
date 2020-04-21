
/********************************************************
*
*	This program demonstrate that string class is immutable
* 		the String class gives you no method to change a character in existing String.
*
*
********************************************************/
class StringDemo{
	public static void main(String args[])
	{
		String s1 = "hello java";
		
		s1 = s1.substring(0,6)+"world";		
		System.out.println(s1);

		String s2="hello devikesh";
		s2.concat("Shende");
		//s2=s2.concat("Shende");
		System.out.println(s2);
		


	}


}

/**************************************************************
in above scenario the output comes out to be Hello world but we need to remember that the actual string "Hello java" remains as it is the string pool whwn we use the 
substring method a new string gets created as "Hello World" and it gets referenced by s1.

string class is immutable is hence proved by looking at string s2.
we concat the string s2 but after printing s2 we still get output as "hello devikesh" because after concatination a new string gets created as "hello devikeshShende"
but the reference variab;e still refers to the older string...if we refer the new string than the output will be
 "hello devikeshshende" as shown by commments in th code

**************************************************************/


