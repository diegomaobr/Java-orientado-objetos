package Desafios.modelo;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    private double altura;
    private double largura;

    public CalculadoraSalaRetangular(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura * altura;
    }

    @Override
    public double calcularPerimetro(){
        return 2 * (altura + largura);
    }

    public static void main(String[] args) {
        double altura = 5.0;
        double largura = 10.0;

        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular(altura, largura);
        double area = sala.calcularArea();
        double perimetro = sala.calcularPerimetro();

        System.out.println("Altura: " + altura + "metros");
        System.out.println("Largura " + largura + "metros");
        System.out.println("Area " + area + "metros quadrados");
        System.out.println("Perimetro "+ perimetro + "metros");
    }
}
