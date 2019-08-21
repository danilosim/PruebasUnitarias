import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CarritoTest {

    @org.junit.jupiter.api.Test
    void checkout() {
        Tipo tipo = new Tipo(1,"tipo1", 0.1);
        Articulo articulo1 = new Articulo(1, "articulo1", tipo, 100);
        List<Articulo> articuloList = new ArrayList<>();
        articuloList.add(articulo1);
        Carrito carrito = new Carrito();
        carrito.setArticuloList(articuloList);
        assertEquals(100, carrito.checkout());
    }

    @org.junit.jupiter.api.Test
    void checkoutNoArticles(){
        Carrito carrito = new Carrito();
        assertThrows(IllegalStateException.class, carrito::checkout);
    }


}