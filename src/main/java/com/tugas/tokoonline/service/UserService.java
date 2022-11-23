package com.tugas.tokoonline.service;


import com.tugas.tokoonline.model.User;

public interface UserService {

    Object getAllUser();

   User addUser(User user);

    Object getUser(Long Id);

    Object editUser(Long Id, String username, String emil, int age, String address, int phoneNumber);

    void deleteUserById(Long Id);
}
