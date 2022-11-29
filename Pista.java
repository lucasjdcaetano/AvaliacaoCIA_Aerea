import java.util.ArrayList;

public class Pista implements GetId {

    private int id;
    private String numero;


    private static ArrayList<Pista> pistas = new ArrayList<>();

    public Pista(int id, String numero){
        
        this.id = GetId.getNextId(pistas);
        this.numero = numero;
        }
        
        public int getId() {
            return id;
        }
        public String getNumero(){
            return numero;
        }
        public void setId(int id) {
            this.id = id;
        }
        public void setNumero(String numero){
            this.numero = numero;
        }
        public static Pista getPista(int id) throws Exception {
            for (Pista pista : pistas) {
                if (pista.getId() == id) {
                    return pista;
                }
            }
            throw new Exception("Pista não encontrada");
        }
    
        public static void removePista(int id) throws Exception {
            Pista pista = getPista(id);
            pistas.remove(pista);
        }
        
        @Override
        public String toString() {
            return "Número =" + numero + "\n";
        }
}
