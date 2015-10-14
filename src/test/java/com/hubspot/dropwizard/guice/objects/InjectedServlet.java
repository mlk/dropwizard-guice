package com.hubspot.dropwizard.guice.objects;

import com.google.inject.Singleton;
import com.hubspot.dropwizard.guice.ServletPath;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@ServletPath("/test/servlet")
@Singleton
public class InjectedServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        resp.getWriter().write("from the servlet");
        resp.getWriter().close();
    }
}
