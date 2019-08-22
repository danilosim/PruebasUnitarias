import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void setTelefono12Digits() {
        Usuario usuario = new Usuario();
        usuario.setTelefono(123456789012L);
        assertEquals(123456789012L, usuario.getTelefono());
    }

    @Test
    void setTelefonoLessDigits() {
        Usuario usuario = new Usuario();
        assertThrows(IllegalStateException.class, () ->{
            usuario.setTelefono(12345678901L);
        });
    }

    @Test
    void setTelefonoMoreDigits() {
        Usuario usuario = new Usuario();
        assertThrows(IllegalStateException.class, () ->{
            usuario.setTelefono(1234567890123L);
        });
    }

    @Test
    void setAnioNacimientoYdni(){
        Usuario usuario = new Usuario();
        usuario.setAnioNacimiento(2003);
        assertThrows(IllegalStateException.class, () ->{
            usuario.setAnioNacimiento(2003);
        });
        usuario.setDni(40597260);
        assertThrows(IllegalStateException.class, () ->{
            usuario.setDni(40597260);
        });
    }

}