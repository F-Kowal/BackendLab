package com.example.demo;

import org.apache.tomcat.jni.File;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

// ZADANIE 1 *****************************
@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }

// ZADANIE 2 *******************************
    @RequestMapping("/example")
    public String index() {
        return "index";
    }


// Params requests

    @RequestMapping("/test/{user}-{age}")
    @ResponseBody
    public String test(@PathVariable String user, @PathVariable Integer age) {
        return "Hello " + user + " your age is " + age;
    }


}