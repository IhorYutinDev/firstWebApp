package app.servlets;

import app.entities.User;
import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/del.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");

        Model model = Model.getInstance();
        String nameDelUser = model.getUserById(id).getName();

        boolean isUserDel = model.delete(id);
        if (isUserDel) {
            req.setAttribute("idDel", "User by ID: " + id + " name: " + nameDelUser);
        } else {
            req.setAttribute("idDel", null);
            req.setAttribute("idNotDel", id);
        }
        doGet(req, resp);
    }
}
