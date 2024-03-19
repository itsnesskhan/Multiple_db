package com.multi.db.h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.multi.db.h2.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

}
