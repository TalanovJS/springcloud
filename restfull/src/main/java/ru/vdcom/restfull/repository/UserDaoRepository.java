package ru.vdcom.restfull.repository;

import org.springframework.stereotype.Repository;
import ru.vdcom.restfull.entity.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Repository
public class UserDaoRepository {

    private static final List<User> users = new ArrayList<>();

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if(user.getId() == null) {
            user.setId(users.size() + 1);
            users.add(user);
        }
        return user;
    }

    public User findById(Integer id) {
        for (User user : users) {
            if(Objects.equals(user.getId(), id)) {
                return user;
            }
        }
        return null;
    }

    public boolean delete(Integer id) {
       return users.removeIf(user -> Objects.equals(user.getId(), id));
    }
}
