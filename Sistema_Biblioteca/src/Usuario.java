public class Usuario{
    private String nome;
    private int itensEmprestados;

    public Usuario(String nome){
        this.nome = nome;
        this.itensEmprestados = 0;
    }

    public String getNome(String nome){return nome;}
    public int getItensEmprestados() {return itensEmprestados;}

    public void setNome(String nome) {this.nome = nome;}

    public void pegarEmprestado(ItemBiblioteca item){
        if(item.getDisponivel()){
            item.emprestar();
            this.itensEmprestados ++;
        }else{
            item.emprestar();
        }
    }

    public void devolverItem(ItemBiblioteca item){
        item.devolve();
        this.itensEmprestados --;
    }

    public void exibeInfo(){
        System.out.println("""
                Nome: %s
                Quantidade de itens:%d
                """.formatted(this.nome, 
                    this.itensEmprestados));
    }

}
