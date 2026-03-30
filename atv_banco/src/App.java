public class App {
    public static void main(String[] args) throws Exception {
        Banco c1 = new Banco("maria");
        //Banco c2 = new Banco();

        System.out.println("Conta 1-");
       c1.deposita(35);
    //    c1.setTitular("thiago");
       c1.setNumero(3478);
       c1.setAgencia("Caixa");
        System.out.println("redimento: "+ c1.calculaRendimeneto());
        c1.dataDeAbertura = new Data();
        c1.dataDeAbertura.preenchaData(1,7,2026);
        System.out.println(c1.getDadosConta());

        // System.out.println("----------------------------------------");
        // System.out.println("Conta 2-");

        // c2.deposita(35);
        // c2.setTitular("Thiago");
        // c2.setNumero(3478);
        // c2.setAgencia("Caixa");
    
        // c1 = c2;
        // if(c1 == c2){
        //     System.out.println("são iguais");
        // }else{
        //     System.out.println("Não são iguais");
        // }
       
        
       
    }   
}
