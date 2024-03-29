package week4.c05_SiniflarArasiIliskiler;

public class Student {
    private String name;
    private String surname;
    private String id;
    private String address;
    private int note = -1;

    public Student(String name, String surname, String id, String address, int note) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.address = address;
        if (note >= 0 && note <= 100) {
            this.note = note;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNote() {
        return this.note;
    }

    public void setNote(int note) {
        if (note >= 0 && note <= 100) {
            this.note = note;
        }else {
            this.note = -1;
        }
    }
}
