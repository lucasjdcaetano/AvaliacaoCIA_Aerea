import java.util.ArrayList;

public class Helicoptero extends Aeronave{

    private int capacidade;
    private String cor;


    private static ArrayList<Helicoptero> helicopteros = new ArrayList<>();

    public Helicoptero(int id, String marca, String modelo, int capacidade, String cor){
        
        super(GetId.getNextId(helicopteros), marca, modelo);
        this.capacidade = capacidade;
        this.cor = cor;

        helicopteros.add(this);
    }

    public int getCapacidade(){
        return capacidade;
    }
    public String getCor(){
        return cor;
    }
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public static Helicoptero getHelicoptero(int id) throws Exception {
        for (Helicoptero helicoptero : helicopteros) {
            if (helicoptero.getId() == id) {
                return helicoptero;
            }
        }
        throw new Exception("Helicóptero não encontrada");
    }

    public static void removeHelicoptero(int id) throws Exception {
        Helicoptero helicoptero = getHelicoptero(id);
        helicopteros.remove(helicoptero);
    }
    
    @Override
    public String toString() {
        return super.toString() 
        + "Capacidade =" + capacidade + "\n"
        + "Cor =" + cor + "\n";
    }
}
