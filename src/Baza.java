interface IPolaczenie {
    char get(int indeks);
    void set(int indeks, char c);
    int length();
}

class Baza {
    private char[] tab = new char[100];
    private static Baza baza;
    private static Baza getBaza()
    {
        if(baza == null) {
            baza = new Baza();
        }
        return baza;
    }
    public static IPolaczenie getPolaczenie() {
        return Polaczenie.getInstance();
    }

    private static class Polaczenie implements IPolaczenie {
        private Baza baza;
        private Polaczenie() {
            baza = getBaza();
        }
        private static Polaczenie[] polaczenia = new Polaczenie[3];
        private static int indexPolaczenia = 0;
        public static IPolaczenie getInstance() {
            indexPolaczenia = (indexPolaczenia+1) % 3;
            if(polaczenia[indexPolaczenia] == null)
                polaczenia[indexPolaczenia] = new Polaczenie();
            return polaczenia[indexPolaczenia];
        }
        /*private static Polaczenie polaczenie;
        public static IPolaczenie getInstance() {
            if(polaczenie == null)
                polaczenie = new Polaczenie();
             return polaczenie;
        }*/
        public char get(int indeks) {
            return baza.tab[indeks];
        }
        public void set(int indeks, char c) {
            baza.tab[indeks] = c;
        }
        public int length() {
            return baza.tab.length;
        }
    }
}
