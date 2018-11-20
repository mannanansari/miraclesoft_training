import java.util.Stack;

public class ValidParantheses_Stack {
	public static void main(String[] args) {
		ValidParantheses_Stack vps = new ValidParantheses_Stack();
		vps.isValid("(p)");
	}
	
boolean isValid(String s) {
	char[] c = s.toCharArray();
	Stack<Character>  s1 = new Stack<Character>(); 
	for(int i=0;i<c.length;i++) {
		if(c[i]=='(') {
			s1.push(')');
		}
		else if(c[i]=='[') {
			s1.push(']');
		}
		else if(c[i]=='{') {
			s1.push('}');
		}
	}
	return true;
}
}
