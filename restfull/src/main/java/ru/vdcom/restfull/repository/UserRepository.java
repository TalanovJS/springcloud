package ru.vdcom.restfull.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vdcom.restfull.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
