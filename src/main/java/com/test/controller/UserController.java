package com.test.controller;

import com.test.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = "用户")
@RestController
public class UserController {
    @ApiOperation("用户列表")
    @GetMapping("/listUser")
    public String listUser(User user, String qq, String token) {
        return "success";
    }
    @ApiOperation("用户新增")
    @GetMapping("/addUser")
    public String addUser(@RequestBody User user) {
        return "success";
    }
}
