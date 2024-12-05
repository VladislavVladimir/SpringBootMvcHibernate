package org.example.springbootmvchibernate.dao;

import org.example.springbootmvchibernate.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
}