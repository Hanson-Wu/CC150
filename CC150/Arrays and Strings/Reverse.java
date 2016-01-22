
public class Reverse {

	public static String reverse(String str){
		char[] in = str.toCharArray();
	    int begin=0;
	    int end=in.length-1;
	    char temp;
	    while(end>begin){
	        temp = in[begin];
	        in[begin]=in[end];
	        in[end] = temp;
	        end--;
	        begin++;
	    }
	    return new String(in);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "abcde ghijk";
		String reversedStr = reverse(myString);
		System.out.println(reversedStr);
	}

}
