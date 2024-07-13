
package stringoperations;
public class StringOperations {
public static void main(String[] args) {
String strl = "Hello";
String str2 = "World";
String concatenated = strl +"" + str2;
int length = strl.length();
String substring = strl.substring( 2);
String uppercase = strl.toUpperCase();
String lowercase = str2.toLowerCase();
boolean areEqual = strl.equals( str2);
int comparison = strl.compareTo( str2);
System.out.println("Concatenated:" + concatenated);
System.out.println("Length of strl:"+ length);
System.out.println("Substring:" + substring);
System.out.println("Uppercase:" + uppercase);
System.out.println("Lowercase:" + lowercase);
System.out.println("Are equal:" + areEqual);
System.out.println("Comparison:" + comparison);
}
}

