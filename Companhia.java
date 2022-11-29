import java.util.ArrayList;

public class Companhia implements GetId {

    private int id;
    private String nome;
    private String cpf;


    private static ArrayList<Companhia> companhias = new ArrayList<>();

    public Companhia(int id, String numero, String cpf){
        
        this.id = GetId.getNextId(companhias);
        this.nome = nome;
        this.cpf = cpf;
        }
        
        public int getId() {
            return id;
        }
        public String getNome(){
            return nome;
        }
        public String getCpf(){
            return nome;
        }
        public void setId(int id) {
            this.id = id;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        public void setCpf(String cpf){
            this.cpf = cpf;
        }
        public static Companhia getCompanhia(int id) throws Exception {
            for (Companhia companhia : companhias) {
                if (companhia.getId() == id) {
                    return companhia;
                }
            }
            throw new Exception("Companhia não encontrada");
        }
    
        public static void removeCompanhia(int id) throws Exception {
            Companhia companhia = getCompanhia(id);
            companhias.remove(companhia);
        }
        
        @Override
        public String toString() {
            return "Nome = " + nome + "\n"
                + "CPF = " + cpf + "\n";
        }
}
