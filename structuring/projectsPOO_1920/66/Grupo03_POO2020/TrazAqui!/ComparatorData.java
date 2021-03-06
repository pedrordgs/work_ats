import java.io.Serializable;
import java.util.Comparator;

/**
 * Comparator usado para organizar por data
 */
public class ComparatorData implements Comparator<EncDistr>, Serializable {
    /**
     * Compara a data de duas encomendas
     * @param v1 EncDistr
     * @param v2 EncDistr
     * @return Resultado invertido da comparação
     */
    public int compare(EncDistr v1, EncDistr v2) {
        return -v1.getEncomenda().getDataE().compareTo(v2.getEncomenda().getDataE());
    }
}
