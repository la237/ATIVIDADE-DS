import java.util.Calendar;

public class    Exe_2 { // primeiro codigo do bloco 2

    // metodo 1 do ano atual
   public static int getAno(){
       return Calendar.getInstance().get(Calendar.YEAR);
   }
   //metodo de retorno nome completo
    public static String nomeCompleto(){
       return "Laryssa Almeida Caetano e Maria Eduarda Jardim Sousa";
    }
    // metodo numero 3
    public static int getNumero(){
       return 100;
    }
    // metodo 4  booleano
    public static boolean getVerdade(){
       return true;
    }
    //metodo 5 pi
    public static double getPI(){
       return Math.PI;
    }

    //EXECUÇÃO

    public static void main(String[] args) { // apos o import da classe ano no java, criamos um metodo
        //metodo 1
        System.out.println("Ano: " + getAno());
        //metodo 2
        String nome = nomeCompleto();
        System.out.println("Nosso nomes completos é: " + nomeCompleto());
        // metodo 3
        System.out.println("Número: " + getNumero());
        //metodo 4
        System.out.println("Booleano: " + getVerdade());
        //metodo 5
        System.out.println("PI: " + getPI());

    }

}

