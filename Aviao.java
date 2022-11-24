import java.util.ArrayList;

public class Aviao extends Aeronave{

    private int capacidade;
    private String prefixo;


    private static ArrayList<Aviao> avioes = new ArrayList<>();

    public Aviao(int id, String marca, String modelo, int capacidade, String prefixo){
        
        super(GetId.getNextId(avioes), marca, modelo);
        this.capacidade = capacidade;
        this.prefixo = prefixo;

        avioes.add(this);
    }

    public int getCapacidade(){
        return capacidade;
    }
    public String getPrefixo(){
        return prefixo;
    }
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    public void setPrefixo(String prefixo){
        this.prefixo = prefixo;
    }
    public static Aviao getAviao(int id) throws Exception {
        for (Aviao aviao : avioes) {
            if (aviao.getId() == id) {
                return aviao;
            }
        }
        throw new Exception("Avião não encontrada");
    }

    public static void removeAviao(int id) throws Exception {
        Aviao aviao = getAviao(id);
        avioes.remove(aviao);
    }
    
    @Override
    public String toString() {
        return super.toString() 
        + "Capacidade =" + capacidade + "\n"
        + "Prefixo =" + prefixo + "\n";
    }
}