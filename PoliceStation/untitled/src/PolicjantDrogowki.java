public class PolicjantDrogowki extends AbstractPolicjantDrogowki {

    private int kilogramyNadwagi;

    public int getKilogramyNadwagi() {
        return kilogramyNadwagi;
    }

    public void setKilogramyNadwagi(int kilogramyNadwagi) {
        this.kilogramyNadwagi = kilogramyNadwagi;
    }

    public PolicjantDrogowki(String imie, String naziwsko, String stopien, Naczelnik szef, int kilogramyNadwagi) {
        super(imie,naziwsko,stopien,szef);
        this.kilogramyNadwagi=kilogramyNadwagi;
    }
    public void schudnij(int ilosc){
        if(ilosc<kilogramyNadwagi){
            kilogramyNadwagi-=ilosc;
            System.out.println("Udało cię się zrzucić kilka zbędnych kilogramów");
        }
    }


}