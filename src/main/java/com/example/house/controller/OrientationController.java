package com.example.house.controller;

import com.example.house.bean.Orientation;
import com.example.house.dao.OrientationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class OrientationController {
    @Autowired
    private OrientationDAO orientationDAO;
    @RequestMapping("/orientation/add")
    @ResponseBody
    public String add(Orientation orientation){
        orientationDAO.insert(orientation);
        return "增加成功";
    }

    @RequestMapping("/orientation/del")
    @ResponseBody
    public String del(int id){
        orientationDAO.deleteByPrimaryKey(id);
        return "删除成功";
    }

    @RequestMapping("/orientation/modfiy")
    @ResponseBody
    public String modfiy(Orientation orientation){
        orientationDAO.updateByPrimaryKey(orientation);
        return "修改成功";
    }

    @RequestMapping("/orientation/listAll")
    public ModelAndView listAll(){
        List<Orientation> orientations=orientationDAO.selectListAll();
        ModelAndView andView=new ModelAndView("orientations/orientations_list");
        andView.addObject("olist",orientations);
        return andView;
    }
}
