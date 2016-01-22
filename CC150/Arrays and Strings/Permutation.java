
public class Permutation {
	
	/**
	 * Given two strings, write a method to decide if one is a permutation of the other
	 * Thought: Check if the two strings have identical character counts.
	 * @param s
	 * @param t
	 * @return
	 */
	public static boolean permutation(String s, String t){
		if(s.length() != t.length()){
			return false;
		}else{
			int[] letters = new int[256];
			char[]  s_array = s.toCharArray();
			for(char c : s_array){
				letters[c]++;
			}
			for(int j = 0; j<256; j++){
				if(letters[j]!=0)System.out.println(j);
			}
			for (int i = 0; i < t.length(); i++) {
				int c = t.charAt(i);
				if (--letters[c] < 0) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aaabbb";
		String s2 = "ababab";
		String s3 = "abcabc";
		System.out.println(permutation(s1, s2));
		System.out.println(permutation(s1, s3));
	}

}
