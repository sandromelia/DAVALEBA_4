package generateText;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;

public class Generator implements GenerateText {
    private  Hashtable alphabet;
    private String language;
    private ArrayList parameters;
    private Random random;

    public Generator(String language, ArrayList parameters) {
        alphabet = new Hashtable();
        random = new Random();
        this.language = language;
        this.parameters = parameters;
        System.out.println(parameters);
        generateAlphabet();
        String test =  generateWord((int)parameters.get(3), (int)parameters.get(4));
        System.out.println(test);
    }

    @Override
    public void generateAlphabet() {
//        System.out.println(alpha);
//        System.out.println((int)'a');
//        System.out.println((int)'ა');
        alphabet.put("en", alphabet('a', 'z'));
        alphabet.put("ge", alphabet('ა', 'ჰ'));
        System.out.println(alphabet.get("en"));
        System.out.println(alphabet.get("ge"));
    }

    public String alphabet(char starter, char ender){
        String alpha = "";
        for(int i=(int)starter; i<=(int)ender; i++){
            alpha += (char)i;
        }
        return alpha;
    }

    @Override
    public char generateChar() {
        String  symbols =  alphabet.get(language).toString();
        char symbol = symbols.charAt(random.nextInt(symbols.length()));
        return symbol;
    }

    @Override
    public String generateWord(int min, int max) {
        String word = "";
        int rand = random.nextInt(max-min+1)+min;
        for(int i=0; i<rand; i++){
            word += generateChar();
        }
        return word;
    }

    @Override
    public String generateeSentenc(int min, int max) {
        return null;
    }
}
