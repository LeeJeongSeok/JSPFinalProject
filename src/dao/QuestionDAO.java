package dao;

import dao.DBConnUtils;
import vo.Question;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class QuestionDAO {

    Statement statement;
    ResultSet resultSet;
    Question question;
    List<Question> questions = new ArrayList<>();
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    public QuestionDAO() {
        try {
            statement = DBConnUtils.getConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Question> selectQuestion() {
        String query = "select question.id, title, contents, count_of_answer, question.create_date, question.modified_date, user.user_id from question LEFT JOIN user ON question.writer_id = user.id;";
        try {
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {

                question = new Question();

                question.setId(resultSet.getInt("id"));
                question.setTitle(resultSet.getString("title"));
                question.setContents(resultSet.getString("contents"));
                question.setCount_of_answer(resultSet.getInt("count_of_answer"));
                question.setWriter_id(resultSet.getString("user.user_id"));
                question.setCreate_date(resultSet.getTimestamp("create_date"));

                questions.add(question);

            }
            resultSet.close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
        }

        return questions;
    }

    public void insertQuestion(String title, String contents, String id) {

        String query = "insert into question (title, contents, count_of_answer, writer_id, create_date, modified_date) VALUES ('" + title + "', '" + contents + "', '" + 0 + "', '"+ Integer.parseInt(id) + "', '" + timestamp + "', '" + timestamp + "')";

        try {
            Statement statement = DBConnUtils.getConnection().createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public Question showQuestion(String id) {

        String query = "select question.id, title, contents, count_of_answer, question.create_date, question.modified_date, user.user_id from question LEFT JOIN user ON question.writer_id = user.id where question.id = '"+ id +"'";

        try {
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {

                question = new Question();

                question.setId(resultSet.getInt("id"));
                question.setTitle(resultSet.getString("title"));
                question.setContents(resultSet.getString("contents"));
                question.setCount_of_answer(resultSet.getInt("count_of_answer"));
                question.setWriter_id(resultSet.getString("user.user_id"));
                question.setCreate_date(resultSet.getTimestamp("create_date"));

                questions.add(question);

            }
            resultSet.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return question;
    }
}
