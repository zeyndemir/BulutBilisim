
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class VeritabaniBaglantisi {
  static int port=3306;
  static String local="localhost";
  static String db="kullanici";
  static String kullanici_adi="root";
  static String parola="";
    static Connection getConnection(){
        Connection cn=null;
        MysqlDataSource dataSource=new MysqlDataSource();
    dataSource.setPortNumber(port);
    dataSource.setServerName(local);
    dataSource.setDatabaseName(db);
    dataSource.setUser(kullanici_adi);
    dataSource.setPassword(parola);
        try {
            cn=(Connection)dataSource.getConnection();
           
        } catch (Exception e) {
            System.out.println("Veritabanı bağlantısı sağlanmadı:"+e);
        }
        return cn;
    }
    public static void main(String[] args) {
        getConnection();
    }
}
