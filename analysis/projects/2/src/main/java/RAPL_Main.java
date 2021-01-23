import java.util.Comparator;

public class RAPL_Main {
    public static void main(String[] args) throws EncomendaJaExisteException {
        DataBase db = new DataBase();
        Parser parser = new Parser();
        parser.parse(db);
        Comparator<Utilizador> c = new ComparatorUser();
        db.ordenarUsers(c);
    }
}
