public class NaczelnikPrewencji extends AbstractNaczelnikPrewencji {
    private boolean czyJestDobry;
    private boolean dobryHumor=false;
    public NaczelnikPrewencji(String imie, String nazwisko,boolean czyJestDobry) {
        super(imie, nazwisko);
        this.czyJestDobry=czyJestDobry;
    }
    public void PoprawHumor(){
        if (!dobryHumor){
            System.out.println("Poprawiłeś humor naczelnika (może będzie premia)");
            dobryHumor=true;
        }
        System.out.println("Naczelnik ma się dobrze");
    }

    public boolean isCzyJestDobry() {
        if(dobryHumor) {
            czyJestDobry = true;
        }
        else{
            czyJestDobry=false;
        }
        return czyJestDobry;
    }
}