package week4.c09_nested;

public class Local {
    public void run() {

//Local Class
        class Yerel {
            private int a;

            public Yerel(int a) {
                this.a = a;
            }

            public int getA() {
                return this.a;
            }

            public void setA() {
                this.a = a;
            }
        }

        Yerel yerel = new Yerel(07);
        System.out.println("Lokal nesnesi çalıştı");
        System.out.println(yerel.getA());
    }
}
