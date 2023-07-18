package br.com.temgi.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.temgi.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
