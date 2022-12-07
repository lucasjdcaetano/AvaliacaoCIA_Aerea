import java.util.ArrayList;

public class Hangar implements GetId {

    private int id;
    private String local;
    private Aviao aviao;
    private int idAviao;


    private static ArrayList<Hangar> hangares = new ArrayList<>();

    public Hangar(){

    }

    public Hangar(int id, String local, Aviao aviao, int idAviao)throws Exception{
        
        this.id = GetId.getNextId(hangares);
        this.local = local;
        this.aviao = Aviao.getById(idAviao);
        this.idAviao = idAviao;

        hangares.add(this);
        }

    public Hangar(String local, Aviao aviao, int idAviao)throws Exception{
    
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
        public static Hangar getById(int id) throws Exception {
            for (Hangar hangar : hangares) {
                if (hangar.getId() == id) {
                    return hangar;
                }
            }
            throw new Exception("Hangar não encontrado");
        }
    
        public static void removeHangar(int id) throws Exception {
            Hangar hangar = getById(id);
            hangares.remove(hangar);
        }
        
        @Override
        public String toString() {
            return "Local =" + local + "\n";
        }
        public static ArrayList<Hangar> getHangares() {
            return hangares;
        }
}
