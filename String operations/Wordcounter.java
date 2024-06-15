public Wordcounter{
Void wordcount(string str ){
	if (str==null||str.isEmpty()){
		return 0;
	}
	else{
		String word[]=str.split();
		return word.lenght();
	}
}
}
public static void main(String[] args){
	String str="one two three four ";
	 wordcount(str );
	 
}