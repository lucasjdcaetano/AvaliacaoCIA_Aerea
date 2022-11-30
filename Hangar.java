import java.util.ArrayList;

public class Hangar implements GetId {

    private int id;
    private String local;
    private Aviao aviao;
    private int idAviao;


    private static ArrayList<Hangar> hangares = new ArrayList<>();

    public Hangar(){

    }

    public Hangar(int id, String local, Aviao aviao, int idAviao){
        
        this.id = GetId.getNextId(hangares);
        this.local = local;
        this.aviao = Aviao.getById(idAviao);
        this.idAviao = idAviao;
        }

    public Hangar(String local, Aviao aviao, int idAviao){
    
        this.local = local;
        this.aviao = Aviao.getById(idAviao);
        this.idAviao = idAviao;
        }
        
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getLocal(){
            return local;
        }        
        public void setLocal(String local){
            this.local = local;
        }
        public static Hangar getHangar(int id) throws Exception {
            for (Hangar hangar : hangares) {
                if (hangar.getId() == id) {
                    return hangar;
                }
            }
            throw new Exception("Hangar não encontrado");
        }
    
        public static void removeHangar(int id) throws Exception {
            Hangar hangar = getHangar(id);
            hangares.remove(hangar);
        }
        
        @Override
        public String toString() {
            return "Local =" + local + "\n";
        }
}
