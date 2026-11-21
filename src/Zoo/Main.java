package Zoo;


import Zoo.Anfibio.Rana;
import Zoo.Anfibio.Salamandra;
import Zoo.Reptiles.DragonDeKomodo;
import Zoo.Reptiles.Tortuga;
import Zoo.Ave.Loro;
import Zoo.Mamifero.Elefante;
import Zoo.Insecto.Abeja;
import Zoo.Pez.PezEspada;
import Zoo.Insecto.Hormiga;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("¡Bienvenidos al Zooilógico!");
        System.out.println("Vamos a observar a nuestros animales.\n");

        List<Animal> listaDeAnimales = new ArrayList<>();
        listaDeAnimales.add(new Rana());
        listaDeAnimales.add(new Salamandra());
        listaDeAnimales.add(new Tortuga());
        listaDeAnimales.add(new Loro());
        listaDeAnimales.add(new Elefante());
        listaDeAnimales.add(new PezEspada());
        listaDeAnimales.add(new Hormiga());

        DragonDeKomodo.listaDeAnimales = listaDeAnimales;
        // Igualo la lista creada en la clase con la lista de todos los animales.
        // Asi conoce los animales de la lista y... podrá morderlos!!
        listaDeAnimales.add(new DragonDeKomodo());

        // Cada alumno puede añadir su animal así:
        // listaDeAnimales.add(new SuAnimal());

        for (Animal animal : listaDeAnimales) {
            System.out.println("Observando las acciones de " + animal.getClass().getSimpleName() + ":");
            animal.verAnimal();
            System.out.println();
            esperar(500);
        }
    }

    private static void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Interrupción durante la espera.");
        }
    }
}
