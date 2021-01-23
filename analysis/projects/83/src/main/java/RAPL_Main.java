public class RAPL_Main {
    public static void main(String[] args) {
        Parse parser = new Parse();
        parser.parse();
        BDGeral base = new BDGeral(parser.getBaseGeral());
        base.top10Encomendas();
        base.top10KmsPercorridos();
    }
}
