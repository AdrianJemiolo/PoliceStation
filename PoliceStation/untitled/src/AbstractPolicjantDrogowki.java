public abstract class AbstractPolicjantDrogowki extends AbstractPolicjant implements Funkcjonariusz {

    public AbstractPolicjantDrogowki(String imie, String naziwsko, String stopien, Naczelnik naczelnik){
        super(imie, naziwsko, stopien, naczelnik);
    }
    @Override
    public void zatrzymajPrzestepce() {
        System.out.println("policjant drogowki zatrzymał przestępce");
    }

    @Override
    public void wystawMandat() {
        System.out.println("policjant drogowki wystawil mandat");
    }
    @Override
    public Wydzialy wydzial() {
        return Wydzialy.DROGOWKA;
    }
}