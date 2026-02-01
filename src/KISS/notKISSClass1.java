package KISS;
//aktualne nazwy klasy czy zmiennych nic nie mówią
public class notKISSClass1 {
    int num1;
    int num2;

    public int Calculate1(int n1, int n2)//nazwa metody Calculate1() nic nie mówi
    {
        return n1 / n2;
    }

    int res1;//zmienne o dziwnych i skrótowych nazwach, są deklarowane wszędzie
    // i porozrzucane po całej powierzchni klasy a nie znajdują się w jednym miejscu
    // czyli np. na początku

    public notKISSClass1()
    {
        res1 = Calculate1(num1,num2);
    }

}
