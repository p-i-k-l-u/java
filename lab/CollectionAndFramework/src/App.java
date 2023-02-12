import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/meetingDB", "root", "");

        Statement statement = conn.createStatement();

        String query = "SELECT NameOfParticipant FROM Meeting WHERE WEEKDAY(ScheduledDate) = 1;";

        ResultSet resSet = statement.executeQuery(query);

        boolean remaining = resSet.next();

        if (!remaining){
            System.out.println("No participants attending Tuesday meeting");
        }
        else {
            System.out.println("Participants attending Tuesday Meeting: ");
            while (remaining){
                System.out.println(resSet.getString("NameOfParticipant"));
                remaining = resSet.next();
            }
        }
    }
}
