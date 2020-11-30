import vo.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    Statement statement;
    ResultSet resultSet;
    User user;
    List<User> users = new ArrayList<>();

    public UserDAO() {
        try {
            statement = DBConnUtils.getConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> selectUser() {
        String query = "select * from user";
        try {
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {

                user = new User();

                user.setId(resultSet.getInt("id"));
                user.setUser_id(resultSet.getString("user_id"));
                user.setPassword(resultSet.getString("password"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCreate_date(resultSet.getTimestamp("create_date"));
                user.setModified_date(resultSet.getTimestamp("modified_date"));

                users.add(user);
            }
            resultSet.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
        }

        return users;
    }


}
