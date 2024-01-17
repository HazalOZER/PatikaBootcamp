package week5.c18_Patika;

import org.jetbrains.annotations.NotNull;

import java.util.TreeSet;

public class Brand implements Comparable<Brand> {
    private int id ;
    private String name;
    private static int idCounter=1;

    private static TreeSet<Brand> brandList = new TreeSet<>();

    public Brand(String name) {
        this.id = idCounter++;
        this.name = name;
    }

    public Brand() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeSet<Brand> getBrandList() {
        return brandList;
    }

    public void setBrandList(TreeSet<Brand> brandList) {
        this.brandList = brandList;
    }
    static {
        brandList.add(new Brand("Samsung"));
        brandList.add(new Brand("Lenova"));
        brandList.add(new Brand("Apple"));
        brandList.add(new Brand("Huawei"));
        brandList.add(new Brand("Casper"));
        brandList.add(new Brand("Asus"));
        brandList.add(new Brand("Hp"));
        brandList.add(new Brand("Xiaomi"));
        brandList.add(new Brand("Monster"));

    }

    @Override
    public int compareTo(@NotNull Brand o) {
        return this.name.compareTo(o.getName());

    }
    public void printBrand(){
        for (Brand b:brandList) {
            System.out.println("- "+b.getName());
        }
    }
}
