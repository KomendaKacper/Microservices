package com.example.restful_web_services.user.jpa;

import com.example.restful_web_services.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends
        JpaRepository<User, Integer> {

}
