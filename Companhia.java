import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class Companhia implements GetId {

    private int id;
    private String nome;
    private String cnpj;
    public static ArrayList<Companhia> companhias = new ArrayList<>();

    public Companhia() {

    }

    public Companhia(int id, String nome, String cnpj){
        
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        companhias.add(this);

        }

    public Companhia(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
        }
        
        public int getId() {
            return id;
        }        
        public void setId(int id) {
            this.id = id;
        }
        public String getNome(){
            return nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        public String getCpf(){
            return nome;
        }
        public void setCnpj(String cnpj){
            this.cnpj = cnpj;
        }
        
        public static Companhia getById(int id) throws Exception {
            for (Companhia companhia : companhias) {
                if (companhia.getId() == id) {
                    return companhia;
                }
            }
            throw new Exception("Companhia não encontrada");
        }  
        public static void removeCompanhia(int id) throws Exception {
            Companhia companhia = getById(id);
            companhias.remove(companhia);
        }

                
        @Override
        public String toString() {
            return "Nome = " + nome + "\n"
                + "CPF = " + cnpj + "\n";
        }
        public static ArrayList<Companhia> getCompanhias() {
            return companhias;
        }

}
