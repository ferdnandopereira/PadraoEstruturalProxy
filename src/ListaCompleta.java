public class ListaCompleta implements ListaContato{

    private  String lista;
    public ListaCompleta(String lista){
        this.lista = lista;
    }
    @Override
    public void exibir() {
        System.out.println("Visualizando lista telefonica");
    }
    public void imprimirListaCompleta(String lista){
        System.out.println("Imprimindo lista telefonica");
    }
}
