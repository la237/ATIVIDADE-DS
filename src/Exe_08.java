public class Exe_08 {
    //Metodo zoologico - 1
    public static class Animal{
        public void emitirSom(){
            System.out.println("Som qualquer");
        }
    }
    static class Cachorro extends Animal{
        @Override // para mostrar que esta sendo carregado de outa classe
        public void emitirSom(){
            System.out.println("AU AU!");
        }
    }

    //Metodo transporte - 2
    public static  class Transporte{
        public void mover(){
            System.out.println("O transporte está se movendo!");
        }
    }
    static class Carro extends Transporte{
        @Override
        public void mover(){
            System.out.println("O carro está se movendo!");
        }
    }

    //Metodo forma - 3
    public static class Forma{
        public void desenhar(){
            System.out.println("Desenhando Formas: *&@");
        }
    }
    static class Circulo extends Forma{
        @Override
        public void desenhar(){
            System.out.println("Desenhando Circulos: 0000");
        }
    }
    static class Quadrado extends Forma{
        @Override
        public void desenhar(){
            System.out.println("Desenhando Quadrados: |_|");
        }
    }

    //Metodo trabalho - 4
    public static class Funcionario{
        public void trabalhar(){
            System.out.println("Funcionario público");
        }
    }
    static class Professor extends Funcionario{
        @Override
        public void trabalhar(){
            System.out.println("Professor Paulo Rogério ensina Java!");
        }
    }

    //Metodo esportes - 5
    public static class Esportes{
        public void jogar(){
            System.out.println("Pratiquem mais esportes!");
        }
    }
    static class Futebol extends Esportes{
       @Override
        public void jogar() {
           System.out.println("Brasil o país do futebol!");
        }
    }
    static class Basquete extends Esportes{
        @Override
        public void jogar(){
            System.out.println("2DS a melhor sala de basquete feminino!");
        }
    }


    // EXECUÇÃO

    public static void main(String[] args) {

         //Metodo 1
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        animal.emitirSom();
        cachorro.emitirSom();

        //Metodo 2
        Transporte transporte = new Transporte();
        Carro carro = new Carro();

        transporte.mover();
        carro.mover();

        //Metodo 3
        Forma forma = new Forma();
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();

        forma.desenhar();
        circulo.desenhar();
        quadrado.desenhar();

        //Metodo 4
        Funcionario funcionario = new Funcionario();
        Professor professor = new Professor();

        funcionario.trabalhar();
        professor.trabalhar();

        //Metodo 5
        Esportes esportes = new Esportes();
        Futebol futebol = new Futebol();
        Basquete basquete = new Basquete();

        esportes.jogar();
        futebol.jogar();
        basquete.jogar();
    }
}
