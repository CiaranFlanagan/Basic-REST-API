package com.example.springapi.service;

import com.example.springapi.api.model.User;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

  private List<User> userList;

  public UserService() {
    this.userList = new ArrayList<>();

    //create mock database
    User user1 = new User(1738, "Ciaran", 20, "ciaran@email.com");
    User user2 = new User(800, "jack", 20, "jack@email.com");
    User user3 = new User(9, "jakob", 19, "jakob@email.com");
    User user4 = new User(1, "evan", 20, "evan@email.com");
    User user5 = new User(2, "Jake", 20, "jake@email.com");

    userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
  }


  public Optional<User> getUser(Integer id) {
    Optional optional = Optional.empty();
    for (User user : userList) {
      if (user.getId() == id) {
        optional = Optional.of(user);
        return optional;
      }
    }
    return optional;
  }
}
