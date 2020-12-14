package dao;

import vo.Question;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

public class AnswerDao {

    Statement statement;
    ResultSet resultSet;
    Question question;
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public AnswerDao() {
        try {
            statement = DBConnUtils.getConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertAnswer(String contents) {

        String query = "insert into answer (id, contents, create_date, modified_date) values ('" + 10 + "', '" + contents + "', '" + timestamp + "', '" + timestamp + "')";

        try {
            Statement statement = DBConnUtils.getConnection().createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
