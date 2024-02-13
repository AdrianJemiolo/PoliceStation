public abstract class AbstractNaczelnik implements Naczelnik {
    protected String imie;
    protected String nazwisko;
    public AbstractNaczelnik(String imie,String nazwisko){
        this.imie = imie;
        this.nazwisko=nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
    public String FullName(){
        return imie+" "+nazwisko;
    }
}