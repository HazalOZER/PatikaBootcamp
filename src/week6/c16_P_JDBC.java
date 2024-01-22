package week6;

import java.sql.*;

public class c16_P_JDBC {
//url, kullanıcı adı şifre tanımlandı
    public static final String DB_URL = "jdbc:mysql://localhost/patika_pratik";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {

        String sql ="SELECT * FROM employees"; //sorgu String olarak atandı

        Connection connect=null; //Connection çağırıldı

        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD); //DB'e bağlantı sağlandı

            Statement st = connect.createStatement();//Statement oluşturuldu
            ResultSet data = st.executeQuery(sql);//sorgu ResultSet nesnesine atandı

            while (data.next()){//nesne while ile döndürüldü ve ekrana yazdırıldı
                System.out.println("ID: "+data.getInt("id")+
                        "\nİSİM: "+data.getString("name")+
                        "\nPozisyon: "+data.getString("position")+
                        "\nMaaş: "+data.getInt("salary"));
                System.out.println("---------------------------");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
