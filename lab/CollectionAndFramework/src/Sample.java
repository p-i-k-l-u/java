import java.sql.*;
class Sample{
    public static void main(String[] args) {
        try{
            //Connect to database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/meetingdb", "root", "");
            Statement stmt = con.createStatement();
            String query = "Select NameOfParticipant from meeting WHERE WEEKDAY(ScheduledDate) = 1";
            ResultSet rs = stmt.executeQuery(query);
            System.out.print("Participants attending Tuesday's meeting ");
            while(rs.next()){
                System.out.print(rs.getString(1)+", ");
            }
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
