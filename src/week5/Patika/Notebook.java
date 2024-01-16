package week5.Patika;

import java.util.ArrayList;
import java.util.Scanner;

public class Notebook extends Product implements Operation {

    private static int id = 1;
    private static ArrayList<Notebook> notebooks = new ArrayList<>();

    public Notebook(int id, String name, double price, double disconuntRate, int stock, String brandName, String screenSize, int ram, String memory) {
        super(id, name, price, disconuntRate, stock, brandName, screenSize, ram, memory);
    }

    public Notebook() {
    }
    public Notebook(String name){

        this.id = id++;
        this.setName( name);
    }

    Scanner scan = new Scanner(System.in);

    @Override
    public void runMenu() {

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("NoteBook Yönetim Paneli");
            System.out.println("1- Yeni NoteBook Ekleme" +
                    "\n2- Notebook silme" +
                    "\n3- Id'e göre listeleme" +
                    "\n4- Markaya Göre Filtreleme" +
                    "\n5- NoteBook listeleme" +
                    "\n0- Çıkış yap.");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
            int select = scan.nextInt();
            switch (select) {
                case 0:
                    isRunning = false;
                    break;
                case 1:
                    this.addProduct();
                    break;
                case 2:
                    this.deleteProduct();
                    break;
                case 3:
                    this.filterByProductId();
                    break;

                case 4:
                    this.filterByProductBrand();
                    break;
                case 5:
                    this.showProductList();
                    break;
            }
        }

    }

    @Override
    public void showProductList() {

    }

    @Override
    public void addProduct() {

        notebooks.add(new Notebook(scan.nextLine()));


    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void filterByProductId() {

    }

    @Override
    public void filterByProductBrand() {

    }
}
