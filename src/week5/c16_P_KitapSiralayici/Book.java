package week5.c16_P_KitapSiralayici;

public class Book {
    //Sınıf oluşturuldu, değişkenler, yapıcı metodu ve getter setter metotları tanımlandı
    private String name;
    private int page;
    private String author;
    private int publishingDate;

    public Book(String name, int page, String author, int publishingDate) {
        this.name = name;
        this.page = page;
        this.author = author;
        this.publishingDate = publishingDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(int publishingDate) {
        this.publishingDate = publishingDate;
    }


}
