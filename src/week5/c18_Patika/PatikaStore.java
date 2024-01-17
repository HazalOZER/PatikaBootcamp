package week5.c18_Patika;

import java.util.Scanner;

public class PatikaStore {
    Scanner scan = new Scanner(System.in);

    boolean isRunning = true;

    public void run(){
        while (isRunning){
            System.out.println("Patika Store Yönetim Paneli");
            System.out.println("1- NoteBook işlemleri"+
                    "\n2- Cep telefonu işlemleri"+
                    "\n3- Markaları Listele"+
                    "\n0- Çıkış yap");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
            int select = scan.nextInt();

            switch (select){
                case 0:
                    isRunning=false;
                    break;
                case 1:
                    Notebook notebook = new Notebook();
                    notebook.runMenu();
                    break;
                case 2:
                    Phone phone = new Phone();
                    phone.runMenu();
                    break;
                case 3:
                    Brand brand = new Brand();
                    brand.printBrand();
                    break;
            }
        }
    }
}
