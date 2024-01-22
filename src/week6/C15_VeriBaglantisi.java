package week6;

import java.sql.*;

public class C15_VeriBaglantisi {

    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;
        // String url ="jdbc:mysql://localhost/university?user=root&password=mysql";
        String sql = "SELECT * FROM student";
        String insertSql = "INSERT INTO student (student_name,student_class) VALUES ('Ayten ÖZER',4)";
        String prSql = "INSERT INTO student (student_name,student_class) VALUES (?,?)";
        String stUpdateSql = "UPDATE student SET student_name ='Hazal ÖZER' WHERE student_id=2";
        String prUpdateSql = "UPDATE student SET student_name = ? WHERE student_id = ?";

        String stDeleteSql = "DELETE FROM student WHERE student_id = 3";
        String prDeleteSql = "DELETE FROM student WHERE student_id = ?";
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);// main içerisinde string olarak tanımladığımız urli parantez içine yazabilirdik(url)
            //ama bu daha temiz gözüküyor

            Statement st = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);//parantez içine yazılanlar first metodu kullanabilmek içn
            ResultSet data = st.executeQuery(sql);

           /* while (data.next()){
                System.out.println("ID: "+data.getInt("student_id"));
                System.out.println("Ad: "+data.getString("Student_name"));
                System.out.println("Sınıf: "+data.getInt("Student_class"));
            }*///data nexti görebilmek için yoruma aldım

            data.next();
            data.next();
            System.out.println(data.getString("Student_name"));
            data.first();
            System.out.println(data.getString("Student_name"));
            data.last();
            System.out.println(data.getString("Student_name"));

            data.absolute(1);
            System.out.println(data.getString("Student_name"));

            PreparedStatement prSt = null;
           /*VERİ EKLEME
           st.executeUpdate(insertSql);
           prSt = connect.prepareStatement(prSql);
            prSt.setString(1,"Ali ÖZER");
            prSt.setInt(2,5);
            prSt.executeUpdate();*/

            //VERİ UPDATE

         /*   st.executeUpdate(stUpdateSql);
            prSt= connect.prepareStatement(prUpdateSql);
            prSt.setString(1,"Ayten KARTAL");
            prSt.setInt(2,3);
            prSt.executeUpdate();*/


            //VERİ SİLME

            st.executeUpdate(stDeleteSql);
            prSt = connect.prepareStatement(prDeleteSql);
            prSt.setInt(1, 2);
            prSt.executeUpdate();


            //TOPLU KOMUT

            prSt = connect.prepareStatement(prSql);//tek sorguyla birden fazla işlem yapabiliriz, yiğit ve şevvalin eklenmeis gibi

            connect.setAutoCommit(false);//otomatik eklemeyi kapatıyor commit komutunu görene kadar hafızaya kaydediypr ama işlem yapmıyor

            prSt.setString(1, "Yiğt Altun");
            prSt.setInt(2, 5);
            prSt.executeUpdate();

            if (true) {
                throw new SQLException();
            }//buradaki örnek gibi bir hatayla karşılaştığında autocommitin kapandığından bu yana olan işlemler gerçekleştirilemiyor. çünkü commit koduna ulaşamadı

            prSt.setString(1, "Şevval Altun");
            prSt.setInt(2, 8);
            prSt.executeUpdate();

            connect.commit();//commit yapan komut. Default olarak otomatik commit yapar ama istersek kapatabilirz


            data.close();
            st.close();
            prSt.close();
            connect.close();

            //rollback var bir de ama ne işe yarıyor bilmiyorum


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
