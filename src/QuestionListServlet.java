import vo.Question;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "QuestionListServlet", urlPatterns = "/questionList")
public class QuestionListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Question> questionList = new QuestionDAO().selectQuestion();
        request.setAttribute("questionList", questionList);
        request.getRequestDispatcher("questionList.jsp").forward(request, response);

    }
}
