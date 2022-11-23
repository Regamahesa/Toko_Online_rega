package com.tugas.tokoonline.controller;

import com.tugas.tokoonline.model.User;
import com.tugas.tokoonline.response.ResponHelper;
import com.tugas.tokoonline.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Object getAllUser() {
        return ResponHelper.ok(userService.getAllUser());
    }

    @GetMapping("/{Id}")
    public Object getUser(@PathVariable("Id") Long Id) {
        return ResponHelper.ok(userService.getUser(Id));
    }

    @PostMapping
    public Object addUser(@RequestBody User user) {
        return ResponHelper.ok(userService.addUser(user));
    }

    @PutMapping("/{Id}")
    public Object editUserById(@PathVariable("Id") Long Id, @RequestBody User user) {
        return ResponHelper.ok(userService.editUser(Id, user.getUsername(), user.getEmail(), user.getAge(), user.getAddress(),user.getPhoneNumber()));
    }

    @DeleteMapping("/{Id}")
    public void deleteById(@PathVariable("Id") Long Id) {
        userService.deleteUserById(Id);
    }

}
