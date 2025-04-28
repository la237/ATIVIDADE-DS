public class Exe_01 {

    //metodo 1
    public static class Olaword{
        public static void hello(){
            System.out.println("Olá Mundo!");
        }
    }
    //Metodo 2
    public static class Nome{
        public static void lastName(){
            System.out.println("Laryssa Almeida Caetano");
            System.out.println("Maria Eduarda Jardim Souza");
        }
    }
    //Metodo 3
    public static class Escola{
        public static void nomeEscolar(){
            System.out.println("Etec Uirapuru");
        }
    }
    //Metodo 4
    public static class  Numeros{
        public static void imprimirNumeros() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }
    }
    //Metodo 5
    public static class Java{
        public static void Programar(){
            System.out.println("EU AMO PROGRAMAR EM JAVA!");
        }
    }




    //EXECUÇÃO

    public static void main(String[] args) {

        //Metodo 1
        Olaword.hello();

        //Metodo 2
        Nome.lastName();

        //Metodo 3
        Escola.nomeEscolar();

        //Metodo 4
        Numeros.imprimirNumeros();

        //Metodo 5
        Java.Programar();
    }
}
