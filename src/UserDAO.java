import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {

    Statement statement;
    ResultSet resultSet;
    User user;

    public UserDAO() {
        try {
            statement = DBConnUtils.getConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void select() {
        String query = "select * from user";
        try {
            resultSet = statement.executeQuery(query);
            user = new User();
            while (resultSet.next()) {
                user.setId(resultSet.getString("user_id"));
                user.setPassword(resultSet.getString("password"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));

                System.out.println(user.toString());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
        }
    }


}
