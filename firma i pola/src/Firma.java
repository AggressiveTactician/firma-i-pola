public class Firma {

public void start() {

    Pracownik bartek = new Pracownik();
    Pracownik robert = new Pracownik("robert");
    Pracownik kamil = new Pracownik("kowalski", 20);

    Pracownik[] pracownicy = new Pracownik[3];
    pracownicy[0] = bartek;
    pracownicy[1] = robert;
    pracownicy[2] = kamil;

    for (Pracownik pracownik : pracownicy) {
        pracownik.dane();
    }

}
}
