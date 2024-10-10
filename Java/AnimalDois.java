import java.util.ArrayList;
import java.util.List;

abstract class AnimalDois {
    protected String nome;

    public AnimalDois(String nome) {
        this.nome = nome;
    }

    public abstract String som();
}

class Cachorro extends AnimalDois {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String som() {
        return nome + " faz: Au Au!";
    }
}

class Gato extends AnimalDois {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String som() {
        return nome + " faz: Miau!";
    }
}

public class Main {
    public static void emitirSons(List<AnimalDois> animais) {
        for (AnimalDois animal : animais) {
            System.out.println(animal.som());
        }
    }

    public static void main(String[] args) {
        List<AnimalDois> animais = new ArrayList<>();
        animais.add(new Cachorro("Valente"));
        animais.add(new Gato("Marley"));
        animais.add(new Cachorro("Sansão"));
        animais.add(new Gato("Luna"));

        emitirSons(animais);
    }
}
