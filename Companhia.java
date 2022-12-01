import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class Companhia implements GetId {

    private int id;
    private String nome;
    private String cpf;
    public static ArrayList<Companhia> companhias = new ArrayList<>();

    public Companhia() {

    }

    public Companhia(int id, String nome, String cpf){
        
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        }

    public Companhia(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
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
        public void setCpf(String cpf){
            this.cpf = cpf;
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
                + "CPF = " + cpf + "\n";
        }
        /* 
        public static Companhia getById(int id) {
            return new Companhia();
        }
        public static boolean getCompanhia2(int id) {
            try{
                Connection connection = DAO.createConnection();
                PreparedStatement stmt = connection.prepareStatement("SELECT * FROM companhia WHERE id = " + id + ";");
                stmt.execute();
                // Pista retornoPista = stmt; se, sendo stmt a variável que vai carregar um "array list" do bd
                stmt.close();
                // return retornoPista;
            }catch(Exception e){
                System.out.println(e);
            }

            return false;
        }    */

}
