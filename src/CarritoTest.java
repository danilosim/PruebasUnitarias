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
        carrito.setLogueado(true);
        carrito.setArticuloList(articuloList);
        assertEquals(100, carrito.checkout());
    }

    @org.junit.jupiter.api.Test
    void checkoutNoArticles(){
        Carrito carrito = new Carrito();
        carrito.setLogueado(true);
        assertThrows(IllegalStateException.class, carrito::checkout);
    }

    @org.junit.jupiter.api.Test
    void checkoutNoLog(){
        Tipo tipo = new Tipo(1,"tipo1", 0.1);
        Articulo articulo1 = new Articulo(1, "articulo1", tipo, 100);
        List<Articulo> articuloList = new ArrayList<>();
        articuloList.add(articulo1);
        Carrito carrito = new Carrito();
        carrito.setArticuloList(articuloList);
        carrito.setLogueado(false);
        assertThrows(IllegalStateException.class, carrito::checkout);
    }

    @org.junit.jupiter.api.Test
    void envioZonaPermitida(){
        Zona mendoza = new Zona();
        mendoza.setName("Mendoza");
        Carrito carrito = new Carrito();
        carrito.setZona(mendoza);
        assertTrue(carrito.envio());
    }

    @org.junit.jupiter.api.Test
    void envioZonaNoPermitida(){
        Zona sanJuan = new Zona();
        sanJuan.setName("San Juan");
        Carrito carrito = new Carrito();
        carrito.setZona(sanJuan);
        assertFalse(carrito.envio());
    }

    @org.junit.jupiter.api.Test
    void costoEnvioMendoza(){
        Zona mendoza = new Zona();
        mendoza.setName("Mendoza");
        Carrito carrito = new Carrito();
        carrito.setZona(mendoza);
        assertEquals(0, carrito.costoDeEnvio());
    }

    @org.junit.jupiter.api.Test
    void costoEnvioBuenosAires(){
        Zona buenosAires = new Zona();
        buenosAires.setName("Buenos Aires");
        Carrito carrito = new Carrito();
        carrito.setZona(buenosAires);
        assertEquals(100, carrito.costoDeEnvio());
    }

    @org.junit.jupiter.api.Test
    void costoEnvioMenosTresArticulos(){
        List<Articulo> articuloList = new ArrayList<>();
        for (int i=0; i<2 ; i++){
            Articulo articulo = new Articulo();
            articuloList.add(articulo);
        }
        Zona buenosAires = new Zona();
        buenosAires.setName("Buenos Aires");
        Carrito carrito = new Carrito();
        carrito.setZona(buenosAires);
        carrito.setArticuloList(articuloList);
        assertEquals(100, carrito.costoDeEnvio());
    }

    @org.junit.jupiter.api.Test
    void costoEnvioTresArticulos(){
        List<Articulo> articuloList = new ArrayList<>();
        for (int i=0; i<3 ; i++){
            Articulo articulo = new Articulo();
            articuloList.add(articulo);
        }
        Zona buenosAires = new Zona();
        buenosAires.setName("Buenos Aires");
        Carrito carrito = new Carrito();
        carrito.setZona(buenosAires);
        carrito.setArticuloList(articuloList);
        assertEquals(0, carrito.costoDeEnvio());
    }

    @org.junit.jupiter.api.Test
    void costoEnvioMasTresArticulos(){
        List<Articulo> articuloList = new ArrayList<>();
        for (int i=0; i<4 ; i++){
            Articulo articulo = new Articulo();
            articuloList.add(articulo);
        }
        Zona buenosAires = new Zona();
        buenosAires.setName("Buenos Aires");
        Carrito carrito = new Carrito();
        carrito.setZona(buenosAires);
        carrito.setArticuloList(articuloList);
        assertEquals(0, carrito.costoDeEnvio());
    }
    @org.junit.Test
        public void calcularPrecio() throws Exception {
            //TODO: hacerlo bien
            double precioCorrecto = 85;
            Carrito carrito = new Carrito();
            Articulo art1 = new Articulo(1,"microondas",new Tipo("electronico"), 100);
            List<Articulo> articuloList = new ArrayList<>();
            articuloList.add(art1);
            articuloList.add(art1);
            articuloList.add(art1);
            carrito.setArticuloList(articuloList);
            assertEquals(precioCorrecto, carrito.calcularPrecio(new GregorianCalendar(2019, Calendar.AUGUST, 20).getTime(), art1), 0);

        }




}
