import org.junit.Test;
import static org.junit.Assert.*;
public class ListaContatoTest {

    //verifica se alista completa é exibida corretamente quando o metodo exibir é chamado
    //na instancia de ListaCompleta
    @Test
    public void testExibirListaCompleta(){
        ListaContato listaContato = new ListaCompleta("Lista 1");
        listaContato.exibir();
        assertEquals("Visualzando lista telefonica",toString().trim());
    }
}
