package Desafios.modelo;

public class ConversorMoeda implements ConversaoFinanceira {
    private static final double TAXA_CONVERSAO = 5.50; // Exemplo de taxa de conversão

    @Override
    public double converterDolarParaReal(double valorDolar) {
        return valorDolar * TAXA_CONVERSAO;
    }

    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        double valorDolar = 100.0;
        double valorReal = conversor.converterDolarParaReal(valorDolar);
        System.out.println("Valor em dólares: $" + valorDolar);
        System.out.println("Valor em reais: R$" + valorReal);
    }
}