package ru.vdcom.users.repository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    private final List<String> users;

    public UserRepository(List<String> users) {
        this.users = List.of("Elena", "Ivan", "Roman");
    }

    public List<String> getUsers() {
        return users;
    }

    public String getUserById(Integer id) {
        return Optional.of(users.get(id - 1))
                .orElse("Not found");
    }
}
