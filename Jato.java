import java.util.ArrayList;

public class Jato extends Aeronave{

    private int velocidade;
    private String cor;


    private static ArrayList<Jato> jatos = new ArrayList<>();

    public Jato(){

    }

    public Jato(int id, String marca, String modelo, int velocidade, String cor){
        
        super(GetId.getNextId(jatos), marca, modelo);
        this.velocidade = velocidade;
        this.cor = cor;

        jatos.add(this);
    }
    public Jato(String marca, String modelo, int velocidade, String cor){
        
        super(marca, modelo);
        this.velocidade = velocidade;
        this.cor = cor;

        jatos.add(this);
    }

    public int getVelocidade(){
        return velocidade;
    }
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    public String getCor(){
        return cor;
    }    
    public void setCor(String cor){
        this.cor = cor;
    }


    public static Jato getById(int id) throws Exception {
        for (Jato jato : jatos) {
            if (jato.getId() == id) {
                return jato;
            }
        }
        throw new Exception("Jato não encontrado");
    }

    public static void removeJato(int id) throws Exception {
        Jato jato = getById(id);
        jatos.remove(jato);
    }
    
    @Override
    public String toString() {
        return super.toString() 
        + "Velocidade =" + velocidade + "\n"
        + "Cor =" + cor + "\n";
    }
    public static ArrayList<Jato> getJatos() {
        return jatos;
    }
}
