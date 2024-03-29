package week6.c18_Enum;

public enum Day {

    PAZARTESI(1),
    SALI(2),
    CARSAMBA(3),
    PERSEMBE(4),
    CUMA(5),
    CUMARTESI(6),
    PAZAR(7);

    private int day;

    private Day(int day) {
        this.day = day;
    }

    public int getDay() {
        return this.day;
    }


    public void getDayName(){
        String dayName =null;
        switch (this.getDay()){
            case 1:
                dayName = "Pazartesi";
                break;
            case 2:
                dayName=  "Salı";
                break;
            case 3:
                dayName = "Çarşamba";
                break;
            case 4:
                dayName = "Perşembe";
                break;
            case 5:
                dayName = "Cuma";
                break;
            case 6:
                dayName = "Cumartes";
                break;
            case 7:
                dayName = "Pazar";
                break;

        }
        System.out.println(dayName);
    }
}
