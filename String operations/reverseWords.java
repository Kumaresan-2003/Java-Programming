import java.util.*;
public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st=new Stack<>();
		String str =" ";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				continue;
			}
			else {
				st.add(str.charAt(i));
			}
		}

	}

}
