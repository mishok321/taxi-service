package org.example.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.example.lib.Injector;
import org.example.service.ManufacturerService;

@WebServlet(urlPatterns = "/manufacturers")
public class DisplayAllManufacturersController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("org.example");
    private final ManufacturerService manufacturerService
            = (ManufacturerService) injector.getInstance(ManufacturerService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute("manufacturers", manufacturerService.getAll());
        req.getRequestDispatcher("/WEB-INF/views/all-manufacturers.jsp").forward(req, resp);
    }
}
