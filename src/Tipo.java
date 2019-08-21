public class Tipo {
    private int id;
    private String name;

    public Tipo(int id, String name, double precioEnvio) {
        this.id = id;
        this.name = name;
    }
    public Tipo(String name) {
        this.name = name;
    }

    public Tipo(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
