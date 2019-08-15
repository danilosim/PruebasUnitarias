public class Zona {
    private int id;
    private String name;
    private double precioEnvio;

    public Zona(int id, String name, double precioEnvio) {
        this.id = id;
        this.name = name;
        this.precioEnvio = precioEnvio;
    }

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

    public double getPrecioEnvio() {
        return precioEnvio;
    }

    public void setPrecioEnvio(double precioEnvio) {
        this.precioEnvio = precioEnvio;
    }
}
