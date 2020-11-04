package cn.csq.springboot.controller;

import cn.csq.springboot.pojo.User;
import cn.csq.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author csq
 * @date 2020/11/4 20:22:12
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Integer id) {
       return userRepository.getOne(id);
    }

    @PostMapping
    public void insertUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @PutMapping
    public void updateUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") Integer id) {
         userRepository.deleteById(id);
    }
}
