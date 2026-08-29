public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicio 01 ");
        String nome = "João Pedro";
        int idade = 24;
        String curso = "Ciencias da computação";
        String periodo = "Primeiro";
        boolean statusdaMatricula = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Período: " + periodo);
        System.out.println("Status da Matricula: " + statusdaMatricula);

    
        System.out.println("Exercicio 02 ");
        String produto = "Perfume";
        double precounitario = 155.50;
        int quantidadeemestoque = 15;
        double total = precounitario*quantidadeemestoque;
        
        System.out.println("Produto: " + produto);
        System.out.println("Preço Unitario: " + precounitario);
        System.out.println("Quantidade em estoque: " + quantidadeemestoque);
        System.out.println("Total R$: " + total);
        
        System.out.println("Exercicio 03 ");

        int pontuacao = 100;
        int pontuacaoatual = 175;

        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Pontuação atual: " + pontuacaoatual);
        System.out.println("Valor Final foi 175");

        System.out.println("Exercicio 04 ");
        String nome1 = " João Pedro";
        int idadeatual = 24;  
        int idadefutura = idadeatual + 5;

        System.out.println("Nome: " + nome1 );
        System.out.println("Idade atual: " + idadeatual);
        System.out.println("Idade em 5 anos:" + idadefutura);
        
        System.out.println("Exercicio 05 ");
        double altura = 5.30;
        int largura = 8;
        double perimetro = 2 * (largura+altura);
        double area = largura*altura;
        System.out.println("Altura: " + altura );
        System.out.println("Largura: " + largura );
        System.out.println("Area: " + area );
        System.out.println("Perimetro: " + perimetro);

        System.out.println("Exercicio 06 ");
        int nota1 = 35;
        int nota2 = 45;
        double nota3 = 45.7;
        double resultado = nota1 + nota2 + nota3 / 3;

        System.out.println("Nota 1: " + nota1 );
        System.out.println("Nota 2: " + nota2 );
        System.out.println("Nota 3: " + nota3 );
        System.out.println("Media: " + resultado );
        
        
    }
}
