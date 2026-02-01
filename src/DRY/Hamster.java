package DRY;

import java.util.List;
import java.util.Optional;

public class Hamster {
    public String hamsterName;
    public int hamsterPhoneNumber;

    public List<Hamster> hamstersWorld;
    public List<Hamster> hamstersHouse;

    public Hamster(String hamsterName, int hamsterPhoneNumber) {
        this.hamsterName = hamsterName;
        this.hamsterPhoneNumber = hamsterPhoneNumber;
    }

    public Hamster() {
    }

    public void addHamsterWithSpecificPhoneNumber(Hamster hamster)
    {
        Hamster found = hamstersWorld.stream()
                .filter(n -> n.getHamsterPhoneNumber() == hamster.getHamsterPhoneNumber())
                .findFirst().get();

        hamstersHouse.add(found);
    }

    public void removeHamsterWithSpecificPhoneNumber(Hamster hamster)
    {
        //duplikacja linii kodu, które szukają chomika o specyficznym numerze telefonu
        Hamster found = hamstersWorld.stream()
                .filter(n -> n.getHamsterPhoneNumber() == hamster.getHamsterPhoneNumber())
                .findFirst().get();

        hamstersHouse.remove(found);
    }

    public String getHamsterName() {
        return hamsterName;
    }

    public void setHamsterName(String hamsterName) {
        this.hamsterName = hamsterName;
    }

    public int getHamsterPhoneNumber() {
        return hamsterPhoneNumber;
    }

    public void setHamsterPhoneNumber(int hamsterPhoneNumber) {
        this.hamsterPhoneNumber = hamsterPhoneNumber;
    }

    public List<Hamster> getHamstersWorld() {
        return hamstersWorld;
    }

    public void setHamstersWorld(List<Hamster> hamstersWorld) {
        this.hamstersWorld = hamstersWorld;
    }

    public List<Hamster> getHamstersHouse() {
        return hamstersHouse;
    }

    public void setHamstersHouse(List<Hamster> hamstersHouse) {
        this.hamstersHouse = hamstersHouse;
    }
}
