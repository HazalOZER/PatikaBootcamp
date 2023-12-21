package week2;

public class C17_TekBoyutluDiziler {
    public static void main(String[] args) {
      //double [] list1;
      //double []list1=new double[5];
        //veya
        //double [] list1 ={1,2,3,4,5};

        double [] list1 = new double[5];
        list1[0] = 10;
        list1[1] = 20;
        list1[2] = 30;

        String[] days ={"Pazartesi","Salı","Çarşamba","ördek"};
        days [3]="Perşembe";
        String[] weekendDays = new String[]{"Cumartesi","Pazar"};
        System.out.println(weekendDays.length);
        for (int i = 0; i <days.length ; i++) {
            System.out.println(days[i]);

        }
    }
}
