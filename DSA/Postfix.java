class Postfix{
    static int prec(char c){
        if(c=='^')
            return 3;
        else if(c=='/' || c=='*')
            return 2;
        else if(c=='+' ||c=='-')
            return 1;
        else
            return -1;
    }
    static char ass(char c ){
        if(c=='^')
            return 'R';
        return 'L';
    }
    static void infixtopostfix(String s){
        StringBuilder result=new StringBuilder();
        Stack<Character> st=new Stack<();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            // Scanned operand 
            if((c>='a' && c<='z')||(c>'A'&&c<='z')||(c>='0'&&c<='9')){
                result.append(c);
            }
             //scanned is "("
            else if(c=='('){
                st.push(c);
            }
            //scanned is ")"
            else if(c==")"){
                while(!st.isEmpty() && st.peek()!='('){
                    result.append(st.pop());
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && (prec(s.charAt(i))<prec(st.peek()) || prec(s.charAt(i))== prec(st.peek()) && ass(s.charAt(i))=="L")){
                    result.append(st.pop());
                }
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        String exp="a+b*(c^d-e)^(f+g*h)-i";
        infixtopostfix(exp);
    }
}