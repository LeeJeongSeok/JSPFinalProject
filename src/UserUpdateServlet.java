import vo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

@WebServlet(name = "UserUpdateServlet", urlPatterns = "/user/update")
public class UserUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());


        System.out.println(request.getParameter("id"));

        int id = Integer.parseInt(request.getParameter("id"));
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String email = request.getParameter("email");


        //String query = "UPDATE student SET Name='John', Address='New York', Course='M.Tech' WHERE RollNo=1";
        String query = "UPDATE user SET USER_ID='"+userId+"', PASSWORD='"+password+"', NAME='"+name+"', EMAIL='"+email+"', MODIFIED_DATE='"+timestamp+"' WHERE ID='"+id+"'";
        //String query = "INSERT INTO USER (USER_ID, PASSWORD, NAME, EMAIL, CREATE_DATE) VALUES ('"+userId+"', '"+password+"', '"+name+"', '"+email+"', '"+timestamp+"')";

        try {
            Statement statement = DBConnUtils.getConnection().createStatement();
            statement.executeUpdate(query);
        } catch (NullPointerException | SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect("/JSPFinalProject/index3.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
