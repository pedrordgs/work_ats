
import java.util.Comparator;
import java.io.Serializable;
/**
 * Compara dois produtos pelo valor unitário. Se forem iguais, compara pelo código de produto. 
 *
 * @author Anabela Pereira - A87990, Fernando Lobo - A87988, Márcia Cerqueira - A87992; 
 * @version 20200611
 */

public class CompProdutos implements Comparator<Produto>, Serializable
{
    public int compare(Produto a, Produto b){
        if(a.getValorUnitario() < b.getValorUnitario()) return 1;
        if(a.getValorUnitario() > b.getValorUnitario()) return -1;
        return a.compareTo(b);
    }
}