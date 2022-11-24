public abstract class Aeronave implements GetId{
    
    private int id;
    private String marca;
    private String modelo;

    protected Aeronave(int id, String marca, String modelo){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getId(){
        return id;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setMarca(String marca){
        this.marca = marca;
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

}
