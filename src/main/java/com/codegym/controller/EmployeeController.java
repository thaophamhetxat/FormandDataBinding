package com.codegym.controller;

import Servicec.EmployeeService;
import models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;


@Controller
public class EmployeeController {
    EmployeeService employeeService = new EmployeeService();

    @RequestMapping("/info")
    public ModelAndView info() {
        ModelAndView modelAndView = new ModelAndView("info");
        modelAndView.addObject("list", employeeService.list);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("list", new Employee());
        return modelAndView;
    }


    @PostMapping("/create")
    public String create(@ModelAttribute Employee employee) throws IOException {
        employeeService.save(employee);
        return "redirect:/info";
    }

}
