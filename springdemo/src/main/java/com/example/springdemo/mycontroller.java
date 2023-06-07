package com.example.springdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.model.employee;

@RestController
public class mycontroller {
    List<employee> list = new ArrayList<>();

    @GetMapping("/")
    public String welcome() {
        return "Welcome to my site";
    }

    @GetMapping("/start")
    public String start() {
        return "Started Application";
    }

    @PostMapping("/try")
    public String sayname(@RequestBody String name) {
        return (name);
    }

    @PostMapping("/addemp")
    public String addemp(@RequestBody employee e) {
        list.add(e);
        return "Employee Added successfully";
    }

    @GetMapping("/getemp")
    public List<employee> getemp() {
        return list;
    }

    @PostMapping("/updateemp/empid")
    public String updateemp(@RequestParam(name = "empid") String empid, @RequestBody employee e) {
        // /updateemp/123
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(e.getId())) {
                // remove
                list.remove(list.get(i));
                // add updated
                list.add(i, e);
            }
        }

        return "Updated emp Successfully";
    }

    @GetMapping("/deleteemp/id")
    public String deleteemp(@RequestParam String id) {
        // list = list.stream().filter(e -> !e.getId().equals(id)).toList();

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)) {
                list.remove(list.get(i));
            }
        }

        return "Deleted Employee Successfully";
    }

}
