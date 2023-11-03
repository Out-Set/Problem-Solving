public class Program15_CheckWhethertheCharacterIsVowelorConsonant {
    public static void main(String[] args) {

        // General Method
        VowelOrConsonent.checkChar('g');
        VowelOrConsonent.checkChar('a');
        VowelOrConsonent.checkChar('G');
        VowelOrConsonent.checkChar('A');

        // indexOf() Method
        System.out.println(VowelOrConsonent.checkChar2('g'));
        System.out.println(VowelOrConsonent.checkChar2('a'));
        System.out.println(VowelOrConsonent.checkChar2('G'));
        System.out.println(VowelOrConsonent.checkChar2('A'));
    }
}

class VowelOrConsonent{
    static void checkChar(char ch){
        if(ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch =='I' || ch == 'O' || ch == 'U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonent");
        }
    }

    // indexOf() Method
    static String checkChar2(char ch){
        String str = "aeiouAEIOU";
        return (str.indexOf(ch) != -1) ? "Vowel" : "Consonant";
    }

}

