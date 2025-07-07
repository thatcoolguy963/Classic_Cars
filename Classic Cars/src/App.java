import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class App {
    public static void main(String[] args) throws Exception {
        String sql = "SELECT * FROM american_muscle";
        String url = "jdbc:MySQL://localhost:3306/classic_cars?serverTimezone=UTC";
        String user = "root";
        String password = "";

        Connection con = DriverManager.getConnection(url, user, password);
        PreparedStatement st = (PreparedStatement) con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        while(rs.next()) {
        int id = rs.getInt("id");
        String make = rs.getString("make");
        String model = rs.getString("model");
        
        System.out.println(id);
        System.out.println(make);
        System.err.println(model);
        }
        rs.close();
        st.close();
        con.close();

    }
}
