package week4.c02_Static;

public class Calculate {
    public static void calcAvarage (int [] notes){
        double total = 0;
        for (int i: notes) {
            total +=i;
        }

        double avarage = total / notes.length;
        System.out.println("Not ortalamanız: "+avarage);
        
    }

    public static void calcAvarage (Course [] dersler){
        double total = 0;

        for (Course i :dersler) {
            total +=i.note;
        }
        double avarage = total/ dersler.length;
        System.out.println("Not ortalamanız: "+ avarage);
    }
}
