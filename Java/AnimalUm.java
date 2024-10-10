abstract class AnimalUm {
    protected String nome;

    public AnimalUm(String nome) {
        this.nome = nome;
    }

    public abstract String som();
}

class Cachorro extends AnimalUm {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String som() {
        return nome + " faz: Au Au!";
    }
}

class Gato extends AnimalUm {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String som() {
        return nome + " faz: Miau!";
    }
}

public class Main {
    public static void main(String[] args) {
        AnimalUm cachorro = new Cachorro("Thor");
        AnimalUm gato = new Gato("Mel");

        System.out.println(cachorro.som());
        System.out.println(gato.som());
    }
}
