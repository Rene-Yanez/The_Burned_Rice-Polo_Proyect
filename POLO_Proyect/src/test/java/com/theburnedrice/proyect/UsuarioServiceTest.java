import com.theburnedrice.proyect.models.Usuario;
import com.theburnedrice.proyect.repository.UsuarioRepository;
import com.theburnedrice.proyect.service.UsuarioService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UsuarioServiceTest {

    @Mock
    private UsuarioRepository usuarioRepository;

    @InjectMocks
    private UsuarioService usuarioService;

    private Usuario usuario;

    @BeforeEach
    public void setUp() {
        usuario = new Usuario();
        usuario.setEmail("test@example.com");
        usuario.setPassword("password");
    }

    @Test
    public void testLoginSuccess() {
        when(usuarioRepository.findByEmailAndPassword("test@example.com", "password"))
            .thenReturn(Optional.of(usuario));

        Optional<Usuario> result = usuarioService.login("test@example.com", "password");

        assertTrue(result.isPresent());
        assertEquals("test@example.com", result.get().getEmail());
    }

    @Test
    public void testLoginFailure() {
        when(usuarioRepository.findByEmailAndPassword("test@example.com", "wrongPassword"))
            .thenReturn(Optional.empty());

        Optional<Usuario> result = usuarioService.login("test@example.com", "wrongPassword");

        assertFalse(result.isPresent());
    }
}