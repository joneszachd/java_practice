// A basic programming introducing various data types in Java

// Primitive Data Type Variables
class types {
	public static void main(String[] args) {
// Integer
		int Num = 7;
// Float
		float floatNum = 3.14f;
// Character
		char theAlpha = 'r';
// Boolean
		boolean yes = true;

// Non-Primitive/Reference Data Types... 

//String
		String hello = "Hey hey hey!";

//... Okay, that's not all, Arrays, Classes, and Interfaces are all non-primitive as well. This is because they all technically refer to objects. A String is simply a collection of char 

		System.out.println(Num);

// Casting

// Converting our Integer to a larger Data Type
double trouble = Num;
System.out.println(trouble);

long boy = Num;
System.out.println(boy);

//short man = Num; can't happen, this is a conversion from a 4 byte int to a 2 byte short
//System.out.println(man);
	}
}
