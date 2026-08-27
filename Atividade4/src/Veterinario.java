import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Veterinario {
    private final ArrayList<Animal> animais = new ArrayList<>();
    private final ArrayList<Animal> carrocinha = new ArrayList<>();

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void examinarAnimaisELevarParaCarrocinha() {
        for (Animal animal : animais) {
            animal.emitirSom();
            carrocinha.add(animal);
        }
    }

    public List<Animal> getAnimais() {
        return Collections.unmodifiableList(animais);
    }

    public List<Animal> getCarrocinha() {
        return Collections.unmodifiableList(carrocinha);
    }
}
