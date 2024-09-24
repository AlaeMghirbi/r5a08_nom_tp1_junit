package r5a08.tp1;

public class UserGreeting {
    public String formatGreeting (String nom) {

        if ( nom.isEmpty())
            throw new UserGreatingFailureException("Le nom ne doit pas etre vide") ;

        return "Bonjour , " + nom ;
    }
}