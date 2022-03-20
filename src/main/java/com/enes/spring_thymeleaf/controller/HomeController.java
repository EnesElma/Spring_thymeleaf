package com.enes.spring_thymeleaf.controller;

import com.enes.spring_thymeleaf.model.Address;
import com.enes.spring_thymeleaf.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class HomeController {

    @Autowired
    private IAddressService service;

    @GetMapping("secondPage")
    public String secondPage(){
        return "secondPage";
    }

    @PostMapping("listData")
    public String listData(@ModelAttribute Address address,Model model){
        service.save(address);
        List<Address> list = service.allAddress();
        model.addAttribute("list",list);
        System.out.println(list);
        return "lastPage";
    }
}
