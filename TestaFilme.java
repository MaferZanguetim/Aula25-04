public class TestaFilme {
    public static void main(String[] args) {
		Filme f = new Filme();
		f.setCodigo(23);
		f.setNome(" A Era do Gelo");
		f.setValor( 2.30);
		
        f.mostra();

		f.setCodigo(39);
		f.setNome("Procurando o nemo");
		f.setValor( 2.50);

        f.mostra();
		
	}
}
