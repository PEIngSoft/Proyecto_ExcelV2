package com.service;

 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class userService {

   /* @Autowired
    UserRepository userRepository;

    public User registerUser(User user){

        User newUser= new User(user.getId(), user.getNombre(),user.getPrioridad(),user.getEdad());
        userRepository.registerUser(newUser);
        return newUser;
    }*/
}
