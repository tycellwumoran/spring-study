package com.springboot.controller;

import com.springboot.service.StudyJavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user_info")
public class StudyJavaController {

    @Autowired
    private StudyJavaService studyJavaService;


    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Integer getUser(@PathVariable Integer id) {
        return studyJavaService.getUser(id);
    }

}
