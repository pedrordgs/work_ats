package MVC;

import MVC.Exceptions.NaoExisteException;
import MVC.Models.Model;

public class RAPL_Main {
    public static void main(String[] args) throws NaoExisteException {
        Model model = new Model();
        model.carregaLog();
        model.getTop10Transportadoras();
        model.getTop10Utilizadores();
    }
}
