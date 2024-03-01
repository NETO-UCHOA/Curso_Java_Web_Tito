public class Cachorro {
    private int id;
    private String nome;
    private String sexo;
    private String raca;
    
    
    
    
    public Cachorro(int id, String nome, String sexo, String raca) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.raca = raca;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }


}
