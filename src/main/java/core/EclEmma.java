package core;

public class EclEmma {
// EclEmma is java class for coverage code testing
	public static boolean isQuestion(String question){
		if(question.contains("?")) return true; 
		else return false;
	}
public static void main(String[] args) {
	System.out.println(isQuestion("What's up?"));
}
}
