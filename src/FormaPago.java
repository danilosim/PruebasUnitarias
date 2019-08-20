import java.util.Calendar;
import java.util.Date;

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

    public double getPromoDia(double precio){
        double nuevo_precio = 0;
        Date theDate = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(theDate);
        boolean tuesday = cal.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY;

        if (tuesday){
            return precio*0.95;
        }

        return nuevo_precio;
    }
}
