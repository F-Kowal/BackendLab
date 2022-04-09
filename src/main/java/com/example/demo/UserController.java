package com.example.demo;

import org.apache.tomcat.jni.File;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.LinkedHashMap;
import java.util.Map;

import java.util.LinkedHashMap;
import java.util.Map;

// ZADANIE 5 *********************************
@Controller
public class UserController {
    private final Map<Long, UserEntity> users = new LinkedHashMap<>();
    private final Object locker = new Object();

    @PostConstruct
    private void onCreate() {
        users.put(1L, new UserEntity(1L, "Filip"));
    }

    @RequestMapping("/users/{id}/get")
    @ResponseBody
    public Object getUser(@PathVariable Long id) {
        synchronized (this.locker) {
            return this.users.get(id);
        }
    }
}
