public class ProxyListaContato implements ListaContato{

    private ListaCompleta listaCompleta;
    private String lista;
    public ProxyListaContato(String lista){
        this.lista = lista;
    }
    @Override
    public void exibir() {
        if(listaCompleta == null){
            listaCompleta = new ListaCompleta(lista);
        }
        listaCompleta.exibir();
    }
}
