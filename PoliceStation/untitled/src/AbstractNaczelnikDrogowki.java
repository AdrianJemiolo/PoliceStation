public abstract class AbstractNaczelnikDrogowki extends AbstractNaczelnik implements Naczelnik {

    public AbstractNaczelnikDrogowki(String imie,String nazwisko){
        super(imie,nazwisko);
    }

    @Override
    public Wydzialy wydzial() {
        return Wydzialy.DROGOWKA;
    }
}