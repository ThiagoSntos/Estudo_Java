public class App {
    public static void main(String[] args) throws Exception {
        ItemBiblioteca[] livros = new ItemBiblioteca[3];

        livros[0] = new Livro("Clean Code", 1, "Robert Martin", 431);
        livros[1] = new Livro("Java OO", 2, "Caelum", 300);
        livros[2] = new Revista("National Geographic", 3, 150, "Janeiro/2024");

        Usuario u1 = new Usuario("Thiago");

        for(ItemBiblioteca i:livros){
            u1.pegarEmprestado(i);
            i.exibeDetalhes();
            System.out.println("----------------------------");
        }
    }
}
