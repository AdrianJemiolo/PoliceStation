
public abstract class AbstractPolicjant {
    protected String  imie;
    protected String naziwsko;
    protected String stopien;
    protected Naczelnik szef;
    public AbstractPolicjant(String imie, String naziwsko, String stopien, Naczelnik naczelnik){
        this.imie = imie;
        this.naziwsko=naziwsko;
        this.stopien=stopien;
        this.szef=naczelnik;
    }

    public String getImie() {
        return imie;
    }

    public String getNaziwsko() {
        return naziwsko;
    }

    public String getStopien() {
        return stopien;
    }

    public void Wylegitymuj(){
        System.out.println(imie+" "+ naziwsko+" "+ stopien);
    }
}