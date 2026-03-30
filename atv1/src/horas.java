import java.util.Scanner;

public class horas {
    public static void main(String[] args) throws Exception{
         Scanner entrada = new Scanner(System.in);
         int hora, minutos, total_horas;

        try {
            System.out.println("Digite as horas:");
            hora = entrada.nextInt();

            System.out.println("Digite os minutos:");
            minutos = entrada.nextInt();

            total_horas = (hora* 60) + minutos;

            System.out.println("total:"+ total_horas);

        } catch (Exception e) {
            System.out.println("entada invalida");
        }
        entrada.close();
    }
}
