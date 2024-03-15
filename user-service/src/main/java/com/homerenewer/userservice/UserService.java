package com.homerenewer.userservice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    public User saveUsers(User user){
        return userRepo.save(user);
    }
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }
}
