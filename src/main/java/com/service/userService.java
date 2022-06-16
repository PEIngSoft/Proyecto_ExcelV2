package com.service;

 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

@Service
@Transactional

public interface userService {

	void save(User user);

    User findByUsername(String username);
	
   /* @Autowired
    UserRepository userRepository;

    public User registerUser(User user){

        User newUser= new User(user.getId(), user.getNombre(),user.getPrioridad(),user.getEdad());
        userRepository.registerUser(newUser);
        return newUser;
    }*/
}
