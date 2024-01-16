package week5.Patika;

import java.util.Scanner;
import java.util.TreeSet;

public class Phone extends Product implements Operation {
    private int camera;
    private int batteryCapacity;
    private String color;
    Scanner scan = new Scanner(System.in);

    public Phone(int id, String name, double price, double disconuntRate, int stock, String brandName, String screenSize, int ram, String memory, int camera, int batteryCapacity, String color) {
        super(id, name, price, disconuntRate, stock, brandName, screenSize, ram, memory);
        this.camera = camera;
        this.batteryCapacity = batteryCapacity;
        this.color = color;
    }

    public Phone() {

    }

    private static TreeSet<Phone> phoneList = new TreeSet<>();


    @Override
    public void runMenu() {


        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Cep Telefonu Yönetim Paneli");
            System.out.println("1- Yeni Cep Telefonu Ekleme" +
                    "\n2- Cep Telefonu silme" +
                    "\n3- Id'e göre listeleme" +
                    "\n4- Markaya Göre Filtreleme" +
                    "\n5- Cep Telefonu listeleme" +
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
