
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    public UsersService usersService;

    @RequestMapping("/api/users")
    @ResponseBody
    public Object users(
            @RequestParam(name = "page-number", defaultValue = "1") Integer pageNumber,
            @RequestParam(name = "page-size", defaultValue = "20") Integer pageSize)
    {
        return this.usersService.getUsers(pageNumber, pageSize);
    }

}