public class FormaPago {
    private int id;
    private String name;
    private double interes;

    public FormaPago(int id, String name, double interes) {
        this.id = id;
        this.name = name;
        this.interes = interes;
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

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
}
