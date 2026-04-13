public abstract class ItemBiblioteca {
    private String titulo;
    private int codigo;
    private boolean disponivel;

    public ItemBiblioteca(String titulo, int codigo){
        this.titulo = titulo;
        this.codigo = codigo;
        this.disponivel = true;
    }

    //metodos Geters
    public String getTitulo() {return titulo;}
    public int getCodigo() {return codigo;}
    public boolean getDisponivel(){return disponivel;}

    //metodos setters
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setCodigo(int codigo) {this.codigo = codigo;}

    public abstract void exibeDetalhes(); // metodo abstrato, logica implementada as classes filhas.

    public void emprestar(){
        if(this.disponivel== true){
            this.disponivel = false;
            System.out.println("Item emprestado");
        }else{
            System.out.println("Item indisponivel");
        }
    }

    public void devolve(){
        this.disponivel = true;
        System.out.println("Item devolvido");

    }
}
