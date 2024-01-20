package week6.c05_Serialization;



import java.io.*;

public class Main {

    public static void main(String[] args) {

       Car c1 = new Car("Audi","A3");


        try {
            FileOutputStream outputFile = new FileOutputStream("src/week6/c05_Serialization/araba.txt");
            ObjectOutputStream output = new ObjectOutputStream(outputFile);
            output.writeObject(c1);
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream inputFile =new FileInputStream("src/week6/c05_Serialization/araba.txt");
            ObjectInputStream inputStream = new ObjectInputStream(inputFile);
            Car newCar = (Car) inputStream.readObject();//tip dönüşümü istiyor ide
            System.out.println(newCar.getBrand()+"\n"+newCar.getModel());

            inputFile.close();
            inputStream.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
