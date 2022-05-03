package com.domain.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.domain.cart.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

public User findByUserid(int userid);
}
