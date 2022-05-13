package Operations;

public class Strings {

	public static void main(String[] args) {
		String str1="Zainab";
		String str2="Saba";
		String str3="Is a Java Developer  ";
 System.out.println("Name :  "+str1 + " " + str2);
 System.out.println("Designation : "+str3 );
 System.out.println("Length : "+str3.length());
 System.out.println("Compare: "+str1.compareTo(str2));
 System.out.println("Uppercase : "+str1.toUpperCase());
 System.out.println("Lowercase : "+str2.toLowerCase());
 System.out.println("Empty : "+str1.isEmpty());
 System.out.println("Blank : "+str3.isBlank());
 System.out.println("Trim : "+str3.trim());
 System.out.println("StartsWith : "+str1.startsWith("Z"));
 System.out.println("EndsWith : "+str1.endsWith("a"));
 System.out.println("Replace : "+str1.replace("a","x"));
 System.out.println("ReplaceAll: "+str3.replaceAll("e","a"));
 System.out.println("Contains : "+str3.contains("Java") );
 System.out.println("Substring : "+str3.substring(2, 8) );
 System.out.println("CharAt : "+str1.charAt(0));
 System.out.println("Matches: "+str2.matches(str3));
 System.out.println("equalsIgnoreCase : "+str3.equalsIgnoreCase(str1));
	}

}
