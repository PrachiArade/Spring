package perscholas.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletRequest;

@Controller
public class IndexController {

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public ModelAndView index() throws Exception {
        ModelAndView response = new ModelAndView();
        response.setViewName("index");

        return response;
    }


    @RequestMapping(value = "/indexSubmit", method = RequestMethod.GET)
    public ModelAndView indexSubmit(ServletRequest request ) throws Exception {


        //name should be same as on the html form
        String fullname = request.getParameter("fullname");
        String email = request.getParameter("email");

        System.out.println("fullname = " + fullname);
        System.out.println("email = " + email);


        ModelAndView response = new ModelAndView();

        response.addObject("fullname", fullname);
        response.addObject("email", email);
        response.setViewName("indexController");

        return response;
    }








}





















 /* create a login controller
    create a success.jsp
    create a login.jsp page with a form that has username and password
    make the form submit to loginSubmit
    in the loginSubmit function check if the username is tom and password is jerry
    if true then add tom to the session and return the success view
    otherwise return the login view
    in the login method check if the username tom is in the session & so return the success view
  */
