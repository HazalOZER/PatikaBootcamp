package week4.c09_nested;
//Outer Class

public class Out {
    public int a = 5;
    public static int b=4;
//Inner Class
    public class In {
        public int a = 10;

        public void run(){
            int a=1;
            System.out.println(a);//1
            System.out.println(this.a);//10
            System.out.println(Out.this.a);//5
        }
    }
    public static class InStatic{
        public static int a=0;
        public static void run(){
            int a =3;
            System.out.println(a);
            System.out.println(InStatic.a);
            System.out.println(Out.b);
            Out out= new Out();
            System.out.println(out.a);
        }
    }
    public void run(){
        In in = new In();
        in.run();
    }

    public In getIn(){

        return new In();
    }
}
