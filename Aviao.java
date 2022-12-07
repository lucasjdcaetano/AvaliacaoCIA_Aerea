import java.util.ArrayList;

public class Aviao extends Aeronave{

    private int capacidade;
    private String prefixo;

    private static ArrayList<Aviao> avioes = new ArrayList<>();

    public Aviao(){

    }

    public Aviao(int id, String marca, String modelo, int capacidade, String prefixo){
        
        super(id, marca, modelo);
        this.capacidade = capacidade;
        this.prefixo = prefixo;

        avioes.add(this);
    }

    public Aviao(String marca, String modelo, int capacidade, String prefixo){
        
        super(GetId.getNextId(avioes), marca, modelo);
        this.capacidade = capacidade;
        this.prefixo = prefixo;

        avioes.add(this);
    }

    public int getCapacidade(){
        return capacidade;
    }
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    public String getPrefixo(){
        return prefixo;
    }    
    public void setPrefixo(String prefixo){
        this.prefixo = prefixo;
    }

    public static Aviao getById(int id) throws Exception {
        for (Aviao aviao : avioes) {
            if (aviao.getId() == id) {
                return aviao;
            }
        }
        throw new Exception("Avião não encontrada");
    }

    public static void removeAviao(int id) throws Exception {
        Aviao aviao = getById(id);
        avioes.remove(aviao);
    }

    @Override
    public String toString() {
        return super.toString() 
        + "Capacidade =" + capacidade + "\n"
        + "Prefixo =" + prefixo + "\n";
    }
    /*
    public static Aviao getById(int id) {
        return new Aviao();
    }*/

    public static Aviao verificaId(int id) {
        for(Aviao aviao : avioes){
            if(aviao.getId() == id){
                return aviao;
            }
        }
        return null;
    }
    public static ArrayList<Aviao> getAvioes() {
        return avioes;
    }
}
