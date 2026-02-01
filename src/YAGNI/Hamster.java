package YAGNI;

import java.util.List;

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

private Hamster findHamsterByPhone(int hamsterPhoneNumber){
    return hamstersWorld.stream()
            .filter(hamster -> hamster.getHamsterPhoneNumber() == hamsterPhoneNumber)
            .findFirst().orElseThrow(() -> new RuntimeException("Chomik nie istnieje!"));

}
    public void addHamsterWithSpecificPhoneNumber(Hamster hamster)    {
        hamstersHouse.add(findHamsterByPhone(hamster.hamsterPhoneNumber));
    }

    public void removeHamsterWithSpecificPhoneNumber(Hamster hamster)    {
        hamstersHouse.remove(findHamsterByPhone(hamster.hamsterPhoneNumber));
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
