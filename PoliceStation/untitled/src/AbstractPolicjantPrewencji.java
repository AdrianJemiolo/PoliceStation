public abstract class AbstractPolicjantPrewencji extends AbstractPolicjant implements Funkcjonariusz {

    public AbstractPolicjantPrewencji(String imie, String naziwsko, String stopien, Naczelnik naczelnik){
        super(imie, naziwsko, stopien, naczelnik);

    }
    @Override
    public void zatrzymajPrzestepce() {
        System.out.println("policjant prewencji zatrzymał przestępce");
    }

    @Override
    public void wystawMandat() {
        System.out.println("policjant prewencji wystawil mandat");
    }
    @Override
    public Wydzialy wydzial() {
        return Wydzialy.PREWENCJA;
    }
}