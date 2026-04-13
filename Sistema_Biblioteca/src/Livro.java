public class Livro extends ItemBiblioteca{
    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, int codigo, String autor, int numeroPaginas){
        super(titulo, codigo);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    public String getAutor() {return autor;}
    public int getNumeroPaginas() {return numeroPaginas;}

    public void setAutor(String autor){this.autor = autor;}
    public void setNumeroPaginas(int numeroPaginas){this.numeroPaginas = numeroPaginas;}

    @Override
    public void exibeDetalhes(){
        System.out.println("""
                Livro:%s
                Autor:%s
                Paginas:%d
                Disponivel:%s
                """.formatted(super.getTitulo(), 
                this.autor, 
                this.numeroPaginas, 
                super.getDisponivel() ? "sim": "não"));
    }
}
