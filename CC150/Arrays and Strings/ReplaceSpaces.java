
public class ReplaceSpaces {

	/**Write a method to replace all spaces in a string with '%20'. You may assume that the
		string has sufficient space at the end of the string to hold the additional characters,
		and that you are given the "true" length of the string. 
	 * @param str
	 * @param length
	 */
	public static void replaceSpaces(char[] str, int length){
		int spaceCount = 0, newLength, i;
		for(i = 0; i < length; i++){
			if(str[i] == ' ')spaceCount++;
		}
		newLength = length + spaceCount * 2;
		str[newLength] = '\0';//take a location
		for(i = length - 1; i >= 0; i--){
			if(str[i] == ' '){
				str[newLength - 1] = '0';
				str[newLength - 2] = '2';
				str[newLength - 3] = '%';
				newLength = newLength - 3;
			}else{
				str[newLength - 1] = str[i];
				newLength = newLength - 1;
			}
			System.out.println(str);
		}
		//System.out.println(str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str_array = new char[100];
		String myString = "abc efg";
		str_array = myString.toCharArray();
		System.out.println(myString+ " "+ myString.length());
		replaceSpaces(str_array, myString.length());
	}

}
