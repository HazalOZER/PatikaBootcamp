package week4.c04_Encapsulation;
//İlkeler

//Encapsulation(kapsülleme-sarmalama)

//Bir sınıfa ait değişkenlerin veya niteliklerin ancak o sınıfa ait metotlar tarafından değiştirilebilmesi ve okunabilmesi ilkesidir



//Inheritance (kalıtım)
//Plimorphism (çok biçimlilik)
//Abstraction (Soyutlama)

public class Book {

    private String name;
    private  int pageNumber=0;

    Book  (String name,int pageNumber){
        this.name =name;
        if (pageNumber>0){
        this.pageNumber =pageNumber;
        }
    }
    //Getter private olan değişkeni getitir
    public String getName(){
        return this.name;
    }
    //setter private olan değişkeni değiştirir
    public void setName(String name){
        this.name=name;
    }

    public int getPageNumber(){
        return this.pageNumber;
    }
    public void setPageNumber(int pageNumber){
        if (pageNumber>0){
            this.pageNumber=pageNumber;
        }else this.pageNumber=0;
    }
}
//getter returnlü
//setter void
