
public class UniqueChars {

	 /**
	  * Implement an algorithm to determine if a string has all unique characters.
	  * What if you cannot use additional data structures?
	 * @param str
	 * @return
	 */
	public static boolean isUniqueChars(String str)  {
		 if (str.length() > 256)  return false;
		 	boolean[]  char_set = new boolean[256] ;
		 for (int i = 0;  i < str.length();  i++)  {
			 int val = str.charAt(i) ;
			 if (char_set[val] )  {  // Already found this char in string
				 return false;
			 }
		 char_set[val] = true;
		 System.out.println("set char_set["+val+"] as true.");
		 }
		 return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString1 = "asdfghjk";
		String myString2 = "asdasd";
		if(isUniqueChars(myString1))System.out.println("String: "+myString1+" is unique");
		if(!isUniqueChars(myString2))System.out.println("String: "+myString2+" is not unique");
	}

}
