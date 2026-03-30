

public class ExercicioX {
    public void NumerosDe150a300(){
        int cont;
        for(cont = 150; cont <=300;cont++){
            System.out.println(cont);
        }
    }

    public void Soma(){
        int cont, soma=0;
        for(cont = 1; cont <=100;){
            soma += cont;
        }
        System.out.println(soma);
    }

    public long fatorial(int numero){
        if(numero <=1){
            return 1;
        }
        return numero * fatorial(numero -1);
    }

    public void escolhe(int x){
        if((x % 2)==0){
            x /=2;
            System.out.println(x);
        } else{
            x = 3*x +1;
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.in);
        ExercicioX chama = new ExercicioX();
        //System.out.println(chama.fatorial(60));
        chama.escolhe(7);

    }
}
