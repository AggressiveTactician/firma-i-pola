public class Pracownik {

    private String imie;
    private String nazwisko;
    private int wiek;

    public Pracownik() {
        imie = "Bartek";
        nazwisko = "Wozniak";
        wiek = 24;
    }


    public Pracownik(String imie) {
        this.imie = imie;
        nazwisko = "Kowalski";
        wiek = 43;
    }


    public Pracownik(String nazwisko, int wiek) {
        imie = "Kamil";
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public void dane() {
        System.out.println(" imie: " + imie + " nazwisko: " + nazwisko + " wiek: " + wiek);
    }


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
