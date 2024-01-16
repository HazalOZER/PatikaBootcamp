package week5.c08_TreeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new OrderNameComparator().reversed());//Paranter içine nasıl sıralayacağımızı yazıyoruz
        students.add(new Student("Mustafa", 20));
        students.add(new Student("Ahmet", 100));
        students.add(new Student("Bihter", 100));
        students.add(new Student("Zehra", 67));
        students.add(new Student("Zehra", 23));
        //Notları kıyaslayınca aynı olan notu 2 kere yazdırmıyor ancak isim aynı olsa da not farklıysa iki kere yazdırıyor
        //Notlar küçükten büyüğe sıralanıyor. reversed ile tam tersi sıralanbiliyor
        //isim sıralaması alfabetik
        //Aynı isimli olanları yazdırmıyor, aynı not olsa da yazzdırıyor

        for (Student stu : students) {
            System.out.println(stu.getName());

        }
    }
}

