import java.util.ArrayList;

public class Pista implements GetId {

    private int id;
    private String numero;


    private static ArrayList<Pista> pistas = new ArrayList<>();

    public Pista(int id, String numero){
        
        this.id = GetId.getNextId(pistas);
        this.numero = numero;
        pistas.add(this);
        }
        
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getNumero(){
            return numero;
        }        
        public void setNumero(String numero){
            this.numero = numero;
        }
        public static Pista getById(int id) throws Exception {
            for (Pista pista : pistas) {
                if (pista.getId() == id) {
                    return pista;
                }
            }
            throw new Exception("Pista não encontrada");
        }
    
        public static void removePista(int id) throws Exception {
            Pista pista = getById(id);
            pistas.remove(pista);
            // remover pista: Pista pistaExcluida =  "select *from pista where id_pista =" +id;

            // remover pista: "delete from pista where id_pista =" +id;
            // return pistaExcluida;
        }
        
        @Override
        public String toString() {
            return "Número =" + numero + "\n";
        }
        /*
        public static Pista getById(int id) {
            for(Pista pista : pistas){
                if(pista.getId() == id){
                    return pista;
                }
            }
            // String query = "Select * from pista where id_pista =" + id;
            // PrepareStatement stmp = naoseioq.execute(query); 

            return null;
        }*/
}
