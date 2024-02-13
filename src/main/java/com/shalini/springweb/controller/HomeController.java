package com.shalini.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//@Controller
//public class HomeController {
//    @RequestMapping("/")
//    public String home(){
//        System.out.println("hello");
//        return "index.jsp";
//    }
//}


@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("Home method called");
        return "index";
    }

    @RequestMapping("add")

//    public String add (HttpServletRequest req, HttpSession session){
//        int num1= Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1+num2;
//        session.setAttribute( "result", result);
//        return "result.jsp";
//    }

//    public String add (@RequestParam("num1") int num, @RequestParam("num2") int nums, HttpSession session){
//        int result = num+nums;
//        session.setAttribute( "result", result);
//        return "result.jsp";
//    }

//    public String add (int num1, int num2, HttpSession session){
//        int result = num1+num2;
//        session.setAttribute( "result", result);
//        return "result.jsp";
//    }

//    public String add (@RequestParam("num1") int num, @RequestParam("num2") int nums, Model model){
//        int result = num+nums;
//        model.addAttribute( "result", result);
//        return "result";
//    }

    public ModelAndView add (@RequestParam("num1") int num, @RequestParam("num2") int nums, ModelAndView mv){
        int result = num+nums;
        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;
    }

//    @RequestMapping("submit")
//    public ModelAndView add (int eid, String ename, ModelAndView mv){
//        System.out.println("hellloooooo");
//        Employee employee = new Employee();
//        employee.setEid(eid);
//        employee.setEname(ename);
//        mv.addObject("employee", employee);
//        mv.setViewName("employee");
//        return mv;
//    }

//    @RequestMapping("submit")
//    public ModelAndView add (Employee employee, ModelAndView mv){
//        mv.addObject("employee", employee);
//        mv.setViewName("employee");
//        return mv;
//    }
    @ModelAttribute("student")
    public String student(){
        return "Employee";
    }

    @RequestMapping("submit")
    public String add (Employee employee){
        return "employee";
    }


}