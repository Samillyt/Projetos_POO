public class Variaveis {
    public static void main(String[] args){

double precoProduto=115.0;
double percentualDesconto=10.0;
double desconto=precoProduto*percentualDesconto/100;
double precoComDesconto=precoProduto-desconto;

System.out.println("O preço do produto é de "+precoProduto+" reais");
System.out.println("O desconto será de "+percentualDesconto+" %");
System.out.println("Com o desconto o produto sai por "+precoComDesconto+" reais");

    }
}
