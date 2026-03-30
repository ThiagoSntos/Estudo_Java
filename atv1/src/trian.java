import java.util.Scanner;

public class trian {
    public static int triangulo(int base, int altura){
        return (base * altura) / 2;
    }

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int ba, al;
        try {
            System.out.println("Digite a base:");
            ba = entrada.nextInt();

            System.out.println("Digite a altura:");
            al = entrada.nextInt();

            int resultado = triangulo(ba, al);

            System.out.println("a área do triangulo é:"+resultado);

        } catch (Exception e) {
            System.out.println("Entrada inválida");
        }
        entrada.close();
    }
}
