package com.example.demo;

import org.apache.tomcat.jni.File;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import static org.springframework.cglib.core.ReflectUtils.getClass;

@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping("/example")
    public String index() {
        return "index";
    }

    @RequestMapping("/test/{user}-{age}")
    @ResponseBody
    public String test(@PathVariable String user, @PathVariable Integer age) {
        return "Hello " + user + " " + age;
    }

    @PostMapping("/photos/{imgName}")
    @ResponseBody
    public File upload(@RequestPart String imgName) {
        File image = new File("static/" + imgName);
        return image;
    }

    @GetMapping(
            value = "/get-image-with-media-type",
            produces = MediaType.IMAGE_JPEG_VALUE
    )
    public @ResponseBody byte[] getImageWithMediaType() {
        InputStream in = getClass()
                .getResourceAsStream("/static/img1.jpg");
        return IOUtils.toByteArray(in);
    }
}