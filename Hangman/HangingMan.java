public class HangingMan {
    private int numWrongGuesses;
    String[] HangmanImage = {"+----+\n"+
                                "|\n"+
                                "|\n"+
                                "|\n"+
                                "/\\\n",

                                "+----+\n"+
                                "|    O\n"+
                                "|\n"+
                                "|\n"+
                                "/\\\n",

                                "+----+\n"+
                                "|    O\n"+
                                "|    +\n"+
                                "|\n"+
                                "/\\\n",

                                "+----+\n"+
                                "|    O\n"+
                                "|    +-\n"+
                                "|\n"+
                                "/\\\n",


                                "+----+\n"+
                                "|    O\n"+
                                "|   -+-\n"+
                                "|\n"+
                                "/\\\n",


                                "+----+\n"+
                                "|    O\n"+
                                "|   -+-\n"+
                                "|   / \n"+
                                "/\\\n",


                                "+----+\n"+
                                "|    O\n"+
                                "|   -+-\n"+
                                "|   / \\\n"+
                                "/\\\n",
                            };
                            
    public HangingMan() {
        numWrongGuesses = 0;       
    }
    
    public void show() {
        System.out.println(HangmanImage[numWrongGuesses]);
    }
    
    public void dieSomeMore() {
        numWrongGuesses++;
    }
    
    public boolean isntDead() {
        if(numWrongGuesses < HangmanImage.length-1) return true;
        return false;
    }
}
