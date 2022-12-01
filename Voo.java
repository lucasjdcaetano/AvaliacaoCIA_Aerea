public class Voo{

    private int id;
    private String numero;
    private String data;
    private String hora;
    private String origem;
    private String destino;
    private String piloto;
    private String copiloto;
    private String observacao;
    private Pista pista;
    private int idPista;
    private Aviao aviao;
    private int idAviao;
    private Helicoptero helicoptero;
    private int idHelicoptero;
    private Jato jato;
    private int idJato;

    public Voo(){

     }

    public Voo( int id,
     String numero,
     String data,
     String hora,
     String origem,
     String destino,
     String piloto,
     String copiloto,
     String observacao,
     Pista pista,
     int idPista,
     Aviao aviao,
     int idAviao,
     Helicoptero helicoptero,
     int idHelicoptero,
     Jato jato,
     int idJato) throws Exception{

        this.id = id;
        this.numero = numero;
        this.data = data;
        this.hora = hora;
        this.origem = origem;
        this.destino = destino;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.observacao = observacao;
        this.pista = Pista.getById(idPista);
        this.idPista = idPista;
        this.aviao = Aviao.getById(idAviao);
        this.idAviao = idAviao;
        this.helicoptero = Helicoptero.getById(idHelicoptero);
        this.idAviao = idHelicoptero;
        this.jato = Jato.getById(idJato);
        this.idAviao = idJato;
    }
    
    public Voo(String numero,
     String data,
     String hora,
     String origem,
     String destino,
     String piloto,
     String copiloto,
     String observacao,
     Pista pista,
     int idPista,
     Aviao aviao,
     int idAviao,
     Helicoptero helicoptero,
     int idHelicoptero,
     Jato jato,
     int idJato) throws Exception {
        this.numero = numero;
        this.data = data;
        this.hora = hora;
        this.origem = origem;
        this.destino = destino;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.observacao = observacao;
        this.pista = Pista.getById(idPista);
        this.idPista = idPista;
        this.aviao = Aviao.getById(idAviao);
        this.idAviao = idAviao;
        this.helicoptero = Helicoptero.getById(idHelicoptero);
        this.idAviao = idHelicoptero;
        this.jato = Jato.getById(idJato);
        this.idAviao = idJato;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public String getDestino(){
        return destino;
    }
    public void setDestino(String destino){
        this.destino = destino;
    }
    public String getPiloto(){
        return piloto;
    }
    public void setPiloto(String piloto){
        this.piloto = piloto;
    }
    public String getCoPiloto(){
        return copiloto;
    }
    public void setCoPiloto(String copiloto){
        this.copiloto = copiloto;
    }
    public String getObservacao(){
        return observacao;
    }
    public void setObservacao(String observacao){
        this.observacao = observacao;
    }
    public int getIdPista(){
        return idPista;
    }
    public void setIdPista(int idPista){
        this.idPista = idPista;
    }
    public Pista getPista() throws Exception {
        return Pista.getById(idPista);
    }
    public void setPista(Pista pista){
        this.pista = pista;
    }
    public int getIdAviao(){
        return idAviao;
    }
    public void setIdAviao(int idAviao){
        this.idAviao = idAviao;
    }
    public Aviao getAviao() throws Exception{
        return Aviao.getById(idAviao);
    }
    public void setAviao(Aviao aviao){
        this.aviao = aviao;
    }
    public int getIdHelicoptero(){
        return idHelicoptero;
    }
    public void setIdHelicoptero(int idHelicoptero){
        this.idHelicoptero = idHelicoptero;
    }
    public Helicoptero getHelicoptero() throws Exception {
        return Helicoptero.getById(idHelicoptero);
    }
    public void setHelicoptero(Helicoptero helicoptero){
        this.helicoptero = helicoptero;
    }
    public int getIdJato(){
        return idJato;
    }
    public void setIdJato(int idJato){
        this.idJato = idJato;
    }
    public Jato getJato() throws Exception {
        return Jato.getById(idJato);
    }
    public void setJato(Jato jato){
        this.jato = jato;
    }

    @Override
        public String toString() {
            return "Nome = " + numero + "\n"
                + "Data = " + data + "\n"
                + "Origem = " + origem + "\n"
                + "Destino = " + destino + "\n"
                + "Piloto = " + piloto + "\n"
                + "Co Piloto = " + copiloto + "\n"
                + "Observação = " + observacao + "\n"
                + "Pista = " + pista + "\n"
                + "ID pista = " + idPista + "\n"
                + "Avião = " + aviao + "\n"
                + "ID avião = " + idAviao + "\n"
                + "Helicóptero = " + helicoptero + "\n"
                + "ID helicóptero = " + idHelicoptero + "\n"
                + "Jato = " + jato + "\n"
                + "ID jato = " + idJato + "\n";
        }

}
