public class Revista extends ItemBiblioteca{
    private int edicao;
    private String mesAno;

    public Revista(String titulo, int codigo, int edicao, String mesAno){
        super(titulo, codigo);
        this.edicao = edicao;
        this.mesAno = mesAno;
    }
    public int getEdicao() {return edicao;}
    public String getMesAno() {return mesAno;}

    @Override
    public void exibeDetalhes(){
        System.out.println("""
                Revista: %s
                Edição: %d
                Mês/Ano: %s
                disponivel: %s
                """.formatted(super.getTitulo(),
                    this.edicao,
                    this.mesAno,
                    super.getDisponivel() ? "sim":"não"));
    }
}
