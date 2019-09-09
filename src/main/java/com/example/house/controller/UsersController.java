package com.example.house.controller;

import com.example.house.bean.HouseInformation;
import com.example.house.bean.Users;
import com.example.house.dao.HouseInformationDAO;
import com.example.house.dao.UsersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UsersController {

    @Autowired
    private UsersDAO usersDAO;

    @RequestMapping("/user/listAll")
    public ModelAndView listAll(){
        List<Users> users = usersDAO.listAll();
        ModelAndView mav = new ModelAndView("user/user_list");
        mav.addObject("users", users);
        return mav;
    }

    @RequestMapping("/user/findById")
    @ResponseBody
    public Users findById(Integer id){
        Users user = usersDAO.selectByPrimaryKey(id);
        return user;
    }

    @RequestMapping("/user/add")
    @ResponseBody
    public String add(Users users){
        usersDAO.insertSelective(users);
        return "新增成功";
    }

    @RequestMapping("/user/modify")
    @ResponseBody
    public String update(Users users){
        usersDAO.updateByPrimaryKeySelective(users);
        return "修改成功";
    }

    @RequestMapping("/user/remove")
    @ResponseBody
    public String delete(Integer id){
        usersDAO.deleteByPrimaryKey(id);
        return "删除成功";
    }
}
