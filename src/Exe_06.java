public class Exe_06 {

    public static class Pessoa {
        private String nome;
        private int idade;

        // Getter para nome
        public String getNome() {
            return nome;
        }

        // Setter para nome
        public void setNome(String nome) {
            this.nome = nome;
        }

        // Getter para idade
        public int getIdade() {
            return idade;
        }

        // Setter para idade
        public void setIdade(int idade) {
           this.idade = idade;
        }

        //METODO  PRODUTO 2
        public static class Produto {
            private String nome;
            private double preco;

            public String getNome() {
                return nome;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public double getPreco() {
                return preco;
            }

            public void setPreco(double preco) {
                this.preco = preco;
            }
        }


        //Metodo titulo e autor - 3
        public static class Livro{
            private String titulo;
            private String autor;

            public String getTitulo(){// getter titulo
                return titulo;
            }

            public void setTitulo(String titulo) { // setter titulo
                this.titulo = titulo;
            }

            public String getAutor() {
                return autor;
            }

            public void setAutor(String autor) {
                this.autor = autor;
            }
        }

        //Metodo animal
        public static class Animal{
            private String tipo;
            private String som;

            public String getTipo() {
                return tipo;
            }
            public void setTipo(String tipo) {
                this.tipo = tipo;
            }
            public String getSom() {
                return som;
            }
            public void setSom(String som) {
                this.som = som;
            }
        }

        //Metodo conta bancaria - 5
        public static class ContaBancaria{
            private double saldo;
            private String titular;

            public double getSaldo() {
                return saldo;
            }
            public void setSaldo(double saldo) {
                this.saldo = saldo;
            }
            public String getTitular() {
                return titular;
            }
            public void setTitular(String titular) {
                this.titular = titular;
            }
        }







        public static void main(String[] args) {

            //Metodo 1
            Pessoa pessoa = new Pessoa();
            pessoa.setNome("Melissa");
            pessoa.setIdade(23);

            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());


            //Metodo 2
            Produto produto = new Produto();
            produto.setNome("Celular");
            produto.setPreco(1200.00);

            System.out.println("Produto: " + produto.getNome());
            System.out.println("Preço: R$ " + produto.getPreco());


            //Metodo 3
            Livro livro = new Livro();
            livro.setTitulo("Jantar Secreto");
            livro.setAutor("Rafael Montes");

            System.out.println("Titúlo: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());

            //Metodo 4
            Animal animal = new Animal();
            animal.setTipo("Leão");
            animal.setSom("RUARRR!");

            System.out.println("Tipo de Animal: "+ animal.getTipo());
            System.out.println("Som do Animal: "+ animal.getSom());

            //Metodo 5
            ContaBancaria contaBancaria = new ContaBancaria();
            contaBancaria.setSaldo(1390.50);
            contaBancaria.setTitular("Diego");

            System.out.println("O saldo da conta se encontra em : " + contaBancaria.getSaldo());
            System.out.println("O titúlar da conta é : " + contaBancaria.getTitular());


        }
    }
}