import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle {
    private ArrayList<String> words;
    private String word;
    private String guesses;

    public Puzzle() {
        words = new ArrayList<String>();

        try {
            File file = new File("words.txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNext()) {
                String tempWord = scanner.next();
                if(!Character.isUpperCase(tempWord.charAt(0))) {
                    words.add(tempWord.toUpperCase());
                }
            }
            scanner.close();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        int x = (int) (words.size()*Math.random());
        word = words.get(x);
        guesses = "";
    }

    public boolean isUnsolved() {
        for(int i = 0; i < word.length(); i++) {
            if(!guesses.contains(word.charAt(i) + "")) return true;            
        }
        return false;
    }

    public String getWord() {
        return this.word; 
    }

    public boolean makeGuess(String guess) {
        guesses += guess;
        if(word.contains(guess)) return true;        
        return false;        
    }

    public void show() {
        for(int i = 0; i < word.length(); i++) {
            if(guesses.contains(word.charAt(i) + "")) System.out.print(word.charAt(i));
            else System.out.print("_");
        }
        System.out.println();
        System.out.print("Guesses: ");
        for(int j = 0; j < guesses.length(); j++) {
            System.out.print(guesses.charAt(j));
            if(j != guesses.length()-1) System.out.print(",");            
        }

    }
}
