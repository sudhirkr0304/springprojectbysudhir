package com.sudhir.springproject1.services;

import com.sudhir.springproject1.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    List<User> users = new ArrayList<>();

    public UserService() {
        users.add(new User(1L,"sudhir1","sudhir1@gmail.com","sudhir1"));
        users.add(new User(2L,"sudhir2","sudhir2@gmail.com","sudhir2"));
        users.add(new User(3L,"sudhir3","sudhir3@gmail.com","sudhir3"));
        users.add(new User(4L,"sudhir4","sudhir4@gmail.com","sudhir4"));
    }

    public List<User> getAllUsers() {
        return this.users;
    }

    public User getUserById(Long id) {
        List<User> filteredUsers = users.stream().filter((us) -> us.getId() == id).collect(Collectors.toList());
        if(filteredUsers.size() == 0) {
            return null;
        }
       return filteredUsers.get(0);
    }

    public void AddUser(User user) {
        this.users.add(user);
    }

}
