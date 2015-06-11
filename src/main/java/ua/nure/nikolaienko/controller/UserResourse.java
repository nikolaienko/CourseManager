// ============================================================================
//  File          : UserResouce
//  Created       : 23.05.15
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Nikolaienko Vlasyslav, Ukraine
// ============================================================================
package ua.nure.nikolaienko.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ua.nure.nikolaienko.entity.User;
import ua.nure.nikolaienko.repository.UserRepository;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author by Nikolaienko Vladyslav on 23.05.15.
 * @version 1.0
 */
@RestController
public class UserResourse {

    private static final Logger logger = LoggerFactory.getLogger(UserResourse.class);
    @Autowired
    private UserRepository userRepository;


    @RequestMapping(value = "/login", method = POST)
    public User login(@RequestParam(value = "login") String login,
                      @RequestParam(value = "password") String password) {
        System.out.println("login==>" + login);
        User user = userRepository.findByLogin(login);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

}
