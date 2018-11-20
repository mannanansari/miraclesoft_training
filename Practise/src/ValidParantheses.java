
public class ValidParantheses {
	public static void main(String[] args) {
		ValidParantheses vp = new ValidParantheses();
		vp.isValid("(p)");
		
	}
	boolean isValid(String s) {
        char a[] = s.toCharArray();
        
        for (int i=0;i<a.length;i++) {
        	
            if(a[i]=='('){
            	//char x = ')';
            	
                
				while(a[i]==')') {
                    //if(a[i]==')') {
                        return true;
                    //}
                }
            }
            else {System.out.println("Not Checking");}
            //else if(a[i]=='[') {
              //   char x = ']';
                //while(x) {
                  //  if(a[i]==']') {
                    //    return true;
                    //}
                //}
            //}
            //else if(a[i]=='{') {
              //   char x = '}';
               // while(x) {
                 //   if(a[i]=='}') {
                   //     system.out.println("valid");
                    //}
                //}
            //}
            
        }
		return false;
    }

}