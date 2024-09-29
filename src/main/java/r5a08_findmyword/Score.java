package r5a08_findmyword;

public class Score {
    public String w;
    public Letter l;
    public Score(String word) {
        w = word;}

    public void assess ( int i, String attempt){
            if(w==attempt){
                l=Letter.CORRECT;}
            else
                l=Letter.INCORRECT;
    }
    public Letter letter(int i) {

        return l;

    }
}