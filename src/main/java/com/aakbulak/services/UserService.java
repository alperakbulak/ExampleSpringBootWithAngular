package com.aakbulak.services;

import com.aakbulak.model.User;
import com.aakbulak.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Alper AKBULAK<alper.akbulak@indbilisim.com.tr>
 * @since 0.0.16
 */

@Service("userService")
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByName(String name){
        return userRepository.findByName(name);
    }

    public void save (User user){
        userRepository.save(user);
    }

    public void delete(Long id){
        userRepository.delete(id);
    }

    public void deleteAll(){
        userRepository.deleteAll();
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }
    public boolean isUserExist(User user){
        return findByName(user.getName()) != null;
    }

    public User findOne(Long id){
        return userRepository.findOne(id);
    }

}
