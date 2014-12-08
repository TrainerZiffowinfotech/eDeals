package com.ziffow.edeals.controller;

import com.ziffow.edeals.service.IDealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ziffow on 12/1/14.
 */

@RestController

public class DealController {
    @Autowired
    IDealService dealService;

    @RequestMapping("/greeting")
    public @ResponseBody
    List greeting(@RequestParam(value="name", defaultValue="World") String name) {

        return dealService.sayHello();
       // return "gfghf";
    }
}
