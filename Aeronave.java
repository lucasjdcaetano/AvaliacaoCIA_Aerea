import java.util.ArrayList;

public abstract class Aeronave implements GetId{
    
    private int id;
    private String marca;
    private String modelo;
    public static ArrayList<Aeronave> aeronaves = new ArrayList<>();
    protected Aeronave(){

    }

    protected Aeronave(int id, String marca, String modelo){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        aeronaves.add(this);
    }

    protected Aeronave(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        aeronaves.add(this);

    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    } 
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Id=" + id + "\n"
            + "Marca=" + marca + "\n"
            + "Modelo=" + modelo + "\n";
    }

    public static Aeronave getById(int id) {
        for(Aeronave aero : aeronaves){
            if(aero.getId() == id){
                return aero;
            }
        }
        return null;
    }
}
