package com.example.test.controller;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import test.test_io;

@RestController
@RequestMapping(value = "/get")
public class GetinputController {


    @RequestMapping(value = "/get1")
    public String addr(@RequestBody String visitIssue)
    {
        test_io io = new test_io();
        io.writeFile(visitIssue);
        System.out.println("成功");

        return "success";
    }
}
