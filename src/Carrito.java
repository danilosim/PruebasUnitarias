import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private double precioTotal;
    private List<Articulo> articuloList = new ArrayList<>();
    private Zona zona;
    private FormaPago formaPago;

    public Carrito(double precioTotal, List<Articulo> articuloList, Zona zona, FormaPago formaPago) {
        this.precioTotal = precioTotal;
        this.articuloList = articuloList;
        this.zona = zona;
        this.formaPago = formaPago;
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

    public double checkout(){
        double total = 0;
        for (Articulo art: this.articuloList
             ) {
            total = total + art.getPrecio();
        }
        return total;
    }
}
