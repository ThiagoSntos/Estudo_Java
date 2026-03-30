import java.util.Scanner;

public class salario {
    public static float aumento(float dinheiro){
        return (dinheiro * 25/100) + dinheiro;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float entrada_do_money;

        try {
            System.out.println("digite o vaor de entrada:");
            entrada_do_money = entrada.nextFloat();

            float res = aumento(entrada_do_money);

            System.out.println("Salario aumentado para:"+res);
            
        } catch (Exception e) {
            System.err.println("entrada invalida");
        }
        entrada.close();
    }
}
