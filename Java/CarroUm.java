class CarroUm {
    private String marca;
    private String modelo;
    private int ano;

    public CarroUm(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String detalhes() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;
    }
}

public class Main {
    public static void main(String[] args) {
        CarroUm carro1 = new CarroUm("Toyota", "Corolla", 2020);
        CarroUm carro2 = new CarroUm("Honda", "Civic", 2018);
        CarroUm carro3 = new CarroUm("Ford", "Mustang", 2022);

        System.out.println(carro1.detalhes());
        System.out.println(carro2.detalhes());
        System.out.println(carro3.detalhes());
    }
}
