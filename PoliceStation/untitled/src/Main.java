public class Main {
    public static void main(String[] args) {
        NaczelnikPrewencji p1 = new NaczelnikPrewencji("Jan","Kowalski",false);
        System.out.println(p1.FullName());
        System.out.println(p1.wydzial());
        System.out.println(p1.isCzyJestDobry());
        p1.PoprawHumor();
        System.out.println(p1.isCzyJestDobry());
        NaczelnikDrogowki d1 = new NaczelnikDrogowki("Mariusz","Jak");
        System.out.println(d1.wydzial());
        PolicjantDrogowki pd1 = new PolicjantDrogowki("Jan","Błaszczak","komsiarz",p1,20);
        pd1.zatrzymajPrzestepce();
        pd1.schudnij(2);
        System.out.println(pd1.getKilogramyNadwagi());
        System.out.println(pd1.wydzial());
        pd1.wystawMandat();
        PolicjantPrewencji pp1 = new PolicjantPrewencji("Kazimierz","Wokulski","szeregowy",d1);
        pp1.zatrzymajPrzestepce();
        pp1.wystawMandat();
        pp1.Wylegitymuj();
        pd1.Wylegitymuj();


    }
}