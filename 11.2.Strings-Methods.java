import java.rmi.dgc.VMID;

public class Main{
    public static void main(String[] args){
       

/*
 Strings Method in JAVA :~

 String Methods operate on
 Java Strings. They can be used to
 find length of a string , convert to 
 lowercase , etc.

 */

String name = "LordShiva";

 // METHODS :~

// .length method :~

System.out.println(name.length()); 

// .toLowerCase Method :~
System.out.println(name.toLowerCase());


// .toUpperCase Method :~
System.out.println(name.toUpperCase());


// .trim Method :~
String unTrimmed = "   Lord Shiva   ";
System.out.println(unTrimmed.trim());


// .substring Method :~
System.out.println(name.substring(4)); 
// print from index 4 of string. Indexing Start from 0.
System.out.println(name.substring(4,9)); 
// print from index 4 to index 9 of string , here 4 is included but 9 is Excluded.



// .replace Method :~
String myName = "Harry";
System.out.println(myName.replace('r','p'));
System.out.println(myName.replace("rry","t"));


// .startsWith Method :~
System.out.println(name.startsWith("Lo"));
System.out.println(name.startsWith("Go"));


// .endsWith Method :~
System.out.println(name.endsWith("va"));
System.out.println(name.endsWith("Go"));

// .charAt Method :~
System.out.println(name.charAt(0));
System.out.println(name.charAt(4));


// .indexOf Method :~
System.out.println(name.indexOf("L"));
System.out.println(name.indexOf("S"));



// .indexOf Method :~
String name1 = "Sahaswat";
System.out.println(name1.indexOf("a",2)); 
// Start to search after index 2.
System.out.println(name1.indexOf("a",4));
// Start to search after index 4.


// .lastIndexOf Method
System.out.println(name1.lastIndexOf("a"));
System.out.println(name1.lastIndexOf("a",4));
// Start to search within index 4.




// .equals Method
System.out.println(name1.equals("Sahaswat"));
System.out.println(name1.equals("SAHASWAT"));
System.out.println(name1.equals("Shaswot"));
// Note :~ Strings are Case Sensative


// .equalsIgnoreCase Method , Ignores Case Sensative
System.out.println(name1.equalsIgnoreCase("Sahaswat"));
System.out.println(name1.equalsIgnoreCase("SAHASWAT"));
System.out.println(name1.equalsIgnoreCase("SaHasWaT"));
System.out.println(name1.equalsIgnoreCase("Shaswot"));



    }
}