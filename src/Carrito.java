import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private double precioTotal;
    private List<Articulo> articuloList = new ArrayList<>();
    private Zona zona;
    private FormaPago formaPago;
    private boolean logueado;

    public Carrito(double precioTotal, List<Articulo> articuloList, Zona zona, FormaPago formaPago, boolean logueado) {
        this.precioTotal = precioTotal;
        this.articuloList = articuloList;
        this.zona = zona;
        this.formaPago = formaPago;
        this.logueado = logueado;
    }

    public Carrito() {
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public List<Articulo> getArticuloList() {
        return articuloList;
    }

    public void setArticuloList(List<Articulo> articuloList) {
        this.articuloList = articuloList;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public boolean isLogueado() {
        return logueado;
    }

    public void setLogueado(boolean logueado) {
        this.logueado = logueado;
    }

    public double checkout(){
        double total = 0;
        if (this.articuloList.isEmpty()){
            throw new IllegalStateException();
        }
        if(!this.logueado){
            throw new IllegalStateException();
        }

        for (Articulo art: this.articuloList) {
            total = total + art.getPrecio();
        }
        return total;
    }

    public boolean envio(){
        return this.zona.getName().equals("Mendoza") || this.zona.getName().equals("Buenos Aires");
    }

    public int costoDeEnvio(){
        if(this.articuloList.size()>=3){
            return 0;
        }
        if (this.getZona().getName().equals("Mendoza")){
            return 0;
        } else if(this.getZona().getName().equals("Buenos Aires")){
            return 100;
        } else throw new IllegalStateException();
    }
}
