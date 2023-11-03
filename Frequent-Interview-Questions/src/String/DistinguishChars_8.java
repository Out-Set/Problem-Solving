package String;

public class DistinguishChars_8 {
    public static void main(String[] args) {
     
        new DistinguishChars_8().distChars("sAJSeoe1234@$#$%nnm@^%1667AD");
    }

    void distChars(String s){

        String capVowel = "";
        String capLett = "";

        String samllVowel = "";
        String smallLett = "";

        String number = "";

        String speChar = "";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                    capVowel = capVowel + s.charAt(i);
                }
                capLett = capLett + s.charAt(i);
            }

            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                    samllVowel = samllVowel + s.charAt(i);
                }
                smallLett = smallLett + s.charAt(i);
            }

            else if(s.charAt(i)>='1' && s.charAt(i)<='9'){
                number = number + s.charAt(i);
            }
            
            else{
                speChar = speChar + s.charAt(i);
            }
        }

        System.out.println(capVowel);
        System.out.println(capLett);
        System.out.println(samllVowel);
        System.out.println(smallLett);
        System.out.println(number);
        System.out.println(speChar);
    }
}
