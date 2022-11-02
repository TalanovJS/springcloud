package ru.vdcom.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vdcom.users.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<String> getUsers(){
        return userRepository.getUsers();
    }

    public String getUserById(Integer id){
        return userRepository.getUserById(id);
    }

}
