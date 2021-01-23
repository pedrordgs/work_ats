import Model.Parse;
import Model.TrazAqui;

public class RAPL_Main {
    public static void main(String[] args) {
        TrazAqui ta = new TrazAqui();
        Parse parser = new Parse();
        parser.parse(ta, "logs.txt");
        ta.topTenTrans();
        ta.topTenUser();

        // Tive de comentar a linha 202 da classe TrazAqui porque dava erro ao fazer parse. O método não faz nada ainda por cima.
    }
}
