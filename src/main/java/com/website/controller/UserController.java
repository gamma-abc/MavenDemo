package com.website.controller;

import com.website.bean.User;
import com.website.service.UserService;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {
     @Resource
     private UserService userService;
    @RequestMapping("/QueryUser")
    public String toIndex(MockHttpServletRequest request , Model model){
        int userId=Integer.parseInt(request.getParameter("id"));
        User user=this.userService.getUserById(userId);
        model.addAttribute("user",user);
        return "User";
    }




}
