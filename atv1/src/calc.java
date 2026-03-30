import java.util.Scanner;

public class calc{
    public static int soma(int n1,int n2){
        return n1 + n2;
    }

    public static void main(String[] args) throws Exception{
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2, resul;
        try {
            numero1 = entrada.nextInt();
            numero2 = entrada.nextInt();

            resul = soma(numero1, numero2);

            System.out.println("A soma de "+numero1+" e "+numero2+" é: "+resul);
        } catch (Exception e) {
            System.out.println("entrada inválida");
        }
        entrada.close();
    }
}