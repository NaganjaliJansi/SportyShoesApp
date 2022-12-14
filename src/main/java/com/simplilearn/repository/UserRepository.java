package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.simplilearn.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	 @Query("SELECT u FROM User u WHERE u.email = ?1")    
	 User findUserByEmail(String email);
}
