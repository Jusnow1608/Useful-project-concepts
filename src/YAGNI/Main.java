package YAGNI;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Przygotowanie środowiska (Świata i Domu)
        Hamster hamster = new Hamster();

        hamster.setHamstersWorld(new ArrayList<>());
        hamster.setHamstersHouse(new ArrayList<>());

        // 2. Dodanie chomików do "Świata"
        Hamster h1 = new Hamster("Puszek", 123456);
        Hamster h2 = new Hamster("Gryzek", 987654);

        hamster.hamstersWorld.add(h1);
        hamster.hamstersWorld.add(h2);

        System.out.println("--- ZARZĄDZANIE CHOMIKAMI ---");

        // 3. Dodanie chomika do "Domu" na podstawie jego numeru telefonu
        // Tworzymy "szablon" chomika, który ma tylko numer telefonu
        Hamster searchTemplate = new Hamster();
        searchTemplate.hamsterPhoneNumber = 123456;

        // Wywołujemy metodę, która pod spodem ma powieloną logikę wyszukiwania
        hamster.addHamsterWithSpecificPhoneNumber(searchTemplate);
        System.out.println("Pomyślnie dodano chomika o numerze 123456 do domu.");

        // 4. Próba usunięcia
        hamster.removeHamsterWithSpecificPhoneNumber(searchTemplate);
        System.out.println("Pomyślnie usunięto chomika o numerze 123456 z domu.");
    }
}