package com.hkh112ht.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hkh112ht.common.entity.HelloEntity;
import com.hkh112ht.serivce.HelloService;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value="hello")
    public String init(Model model) {

        helloService.save();
        List<HelloEntity> list = helloService.selectName();
        model.addAttribute("list",list);

        return "hello";
    }
}