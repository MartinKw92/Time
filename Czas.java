public class Czas {

    private int godzina;
    private int minuty;

    public Czas(int g, int m) {
        godzina = g;
        minuty = m;
    }

    public Czas(String napis) {
        String[] s = napis.split(" h | min");
        godzina = Integer.valueOf(s[0]);
        minuty = Integer.valueOf(s[1]);
    }

    public static void main(String[] args) {
        Czas n1 = new Czas("12 h 58 min");
        Czas n2 = new Czas(12, 58);

    }

    public int getGodzina() {
        return godzina;
    }

    public void setGodzina(int godzina) {
        this.godzina = godzina;
    }

    public int getMinuty() {
        return minuty;
    }

    public void setMinuty(int minuty) {
        this.minuty = minuty;
    }

    @Override
    public String toString() {
        return godzina + " h " + minuty + " min";
    }

    public Czas dodaj(Czas t) {
        int m = this.minuty + t.minuty;
        int g = this.godzina + t.godzina;
        return new Czas(g + m / 60, m % 60);
    }

    public Czas odejmij(Czas t) {
        int m = this.minuty - t.minuty;
        int g = this.godzina - t.godzina;
        return new Czas(g + m / 60, m % 60);
    }

    public Czas pomnoz(int ile) {
        int m = this.minuty * ile;
        int g = this.godzina * ile;
        return new Czas(g + m / 60, m % 60);
    }
    public static Czas sumuj(Czas [] tab){
        int n = 0;
        int g = 0;
        for(int i=0; i < n; i++) {
            n += tab[i].minuty;
            g += tab[i].godzina;
        }
        return new Czas(g + n / 60, n % 60);


    }

}

