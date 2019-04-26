import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by zcl on 2019-04-26.
 */
public class AppCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        HttpSession httpSession = req.getSession();
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            if (name.equals("ceshi01")) {
                PrintWriter printWriter = resp.getWriter();
                printWriter.write(cookie.getValue());
            }
        }
    }
}
