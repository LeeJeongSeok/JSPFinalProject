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

                setUserData();

                users.add(user);
            }
            resultSet.close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
        }

        return users;
    }

    public User findUser(String userId, String password) {

        String query = "select * from user where user_id = '" + userId +"' AND password = '" + password + "'";

        try {
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                if (resultSet.getString("user_id") != null) {

                    setUserData();
                    System.out.println(user.toString());

                } else {
                    System.out.println("유저가 없습니다.");
                }
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return user;
    }


    private void setUserData() throws SQLException {
        user = new User();

        user.setId(resultSet.getInt("id"));
        user.setUser_id(resultSet.getString("user_id"));
        user.setPassword(resultSet.getString("password"));
        user.setName(resultSet.getString("name"));
        user.setEmail(resultSet.getString("email"));
        user.setCreate_date(resultSet.getTimestamp("create_date"));
        user.setModified_date(resultSet.getTimestamp("modified_date"));
    }


}
