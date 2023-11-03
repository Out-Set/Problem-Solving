package String;

public class RecursivelyCountVowelAndCons {
    public static void main(String[] args) {
        
        String str = "helloindia";
	    System.out.println("Vowels: " + countVow(str));
	    System.out.println("Cons: " + countCons(str));
    }

    // Write a recursive function to compute the count of vowels and consonants in a string
	
	
	// Recursively count vowel
	static boolean isVowel(char ch) {

	    ch = Character.toLowerCase(ch);
	    
	    return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
        
	}
	
	static int countVow(String s){
	    int count = 0;
	    for(int i=0; i<s.length(); i++){
	        if(isVowel(s.charAt(i))){
	            ++count;
	        }
	    }
	    
	    return count;
	}
	
	
	// Recursively count Consonent
	static boolean isCons(char ch) {
	    
	    ch = Character.toLowerCase(ch);
	    
	    return !(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
	    
	    }
	    
	
	static int countCons(String s){
	    int count = 0;
	    for(int i=0; i<s.length(); i++){
	        if(isCons(s.charAt(i))){
	            ++count;
	        }
	    }
	    
	    return count;
	}
}
