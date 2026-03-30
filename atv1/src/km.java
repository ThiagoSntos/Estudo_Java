import java.util.Scanner;

public class km {
    public static void main(String[] args) throws Exception{
        try(Scanner entrada = new Scanner(System.in)){
            double ms, km;

            System.out.println("digite a velocidade em m/s:");
            ms = entrada.nextDouble();
            km = ms * 3.6;

            System.out.println("velocidade em km/h: "+km);
        }
    }
}
