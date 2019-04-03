import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Event> events = Arrays.asList(new Event(1,"casa", new Location(1, "bsas", new City(1, "Mar del Plata"))),
                new Event(2,"asado", new Location(2, "san carlos", new City(2, "Balcarse"))),
                new Event(3,"cumpleanios", new Location(3, "salon de fiestas", new City(3, null))),
                new Event(5,"electronica", new Location(5, "tecnopolis", new City(5, "Buenos aires"))),
                new Event(6,"paella", new Location(1, "centro cultural", new City(1, "Mar del Plata"))),
                new Event(4,"tejo", new Location(1, "kioso", new City(1, "San nicolas"))),
                new Event(7,"arbeja", new Location(1, "salta", new City(1, "jujuy"))));

        // get primeros 5 por id ordenados limit 5 o top 5 fijate
        List<Integer> primeros_5_id = (events.stream()
                .sorted(Comparator.comparing(Event::getId))
                .map(Event::getId)
                .limit(5)
                .collect(Collectors.toList()));

        ////get ordenados alfabeticamente
        List<Event> eventos_alfabeticamente = (events.stream()
                .sorted(Comparator.comparing(Event::getName))
                .collect(Collectors.toList()));

        System.out.println(String.format("Primeros 5 ID: %s", primeros_5_id));

        System.out.println(String.format("Ordenados Alfabeticamente: %s", eventos_alfabeticamente));



    }
}


// get primeros 5 por id ordenados limit 5 o top 5 fijate
////get ordenados alfabeticamente