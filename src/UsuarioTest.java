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

}