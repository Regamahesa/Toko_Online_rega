package com.tugas.tokoonline.service;

import com.tugas.tokoonline.exception.InternalErrorException;
import com.tugas.tokoonline.model.User;
import com.tugas.tokoonline.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public Object getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        String email = user.getEmail();
        var validasi = userRepository.findByEmail(email);
        if (validasi.isPresent()) {
            throw new InternalErrorException( "Email Already Axist");
        } else {
            return userRepository.save(user);
        }
    }

    @Override
    public Object getUser(Long Id) {
        return userRepository.findById(Id).get();
    }

    @Override
    public Object editUser(Long Id, String username, String email, int age, String address, int phoneNumber) {
        User user = userRepository.findById(Id).get();
        user.setUsername(username);
        user.setEmail(email);
        user.setAge(age);
        user.setAddress(address);
        user.setPhoneNumber(phoneNumber);
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long Id) {
        userRepository.deleteById(Id);
    }
}
