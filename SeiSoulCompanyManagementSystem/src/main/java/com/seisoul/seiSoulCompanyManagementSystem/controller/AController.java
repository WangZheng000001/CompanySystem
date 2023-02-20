package com.seisoul.seiSoulCompanyManagementSystem.controller;

import com.seisoul.seiSoulCompanyManagementSystem.serviceImpl.UserServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AController {
    @RequestMapping("/login")
    public String loginCheck(HttpServletRequest request){
//        request.getParameter("account");
//        request.getParameter("password");
        //UserServiceImpl userService = new UserServiceImpl();

        return "success";
    }
}
