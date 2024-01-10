package week4.c07_Interface;

public class ABankasi implements IBanka, IDeneme {
    private String bankaAdi;
    private String terminalId;
    private String password;

    ABankasi(String bankaAdi, String terminalId, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalId = terminalId;
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanıcı Ip " + ipAddress);
        System.out.println("Makine Ip " + this.hostIpAdress);
        System.out.println(this.bankaAdi + " Bağlanıldı");
        return true;
    }

    @Override
    public boolean payment(double price, String cardNumber, String expiryDate, String cvv) {
        System.out.println("Bankadan cevap bekleniyor");
        //Banka ödeme işlemleri
        System.out.println("İşlem başarılı oldu");
        return true;
    }

    public String getBankaAdi() {
        return this.bankaAdi;
    }

    public String getTerminalId() {
        return this.terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.terminalId = terminalId;
    }


}
