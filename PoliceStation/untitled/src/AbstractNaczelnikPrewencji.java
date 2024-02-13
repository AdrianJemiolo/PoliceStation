
    public abstract class AbstractNaczelnikPrewencji extends AbstractNaczelnik implements Naczelnik {

        public AbstractNaczelnikPrewencji(String imie,String nazwisko){
            super(imie, nazwisko);
        }

        @Override
        public Wydzialy wydzial() {
            return Wydzialy.PREWENCJA;
        }
    }