public class Main {
    public static void main(String[] args) {
        IPolaczenie p1 = Baza.getPolaczenie();
        IPolaczenie p2 = Baza.getPolaczenie();
        IPolaczenie p3 = Baza.getPolaczenie();
        IPolaczenie p4 = Baza.getPolaczenie();

        for(int i=0; i<10; i++)
            p1.set(i, (char)(i+65));

        System.out.println("p1 - p2 - p3 - p4");
        for(int i=0; i<10; i++)
        {
            char c1 = p1.get(i);
            char c2 = p2.get(i);
            char c3 = p3.get(i);
            char c4 = p4.get(i);
            System.out.println(c1+"  -  "+c2+" -  "+c3+" -  "+c4);
        }

        System.out.println(p1 == p4);
    }
}