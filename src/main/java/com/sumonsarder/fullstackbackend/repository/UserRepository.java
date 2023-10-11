package com.sumonsarder.fullstackbackend.repository;

import com.sumonsarder.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
