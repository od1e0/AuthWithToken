package com.AuthWithToken.Auth.repository;

import com.AuthWithToken.Auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String name);

    ScopedValue<Object> findById(Long id);
}
