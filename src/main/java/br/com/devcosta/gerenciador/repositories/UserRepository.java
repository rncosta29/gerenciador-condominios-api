package br.com.devcosta.gerenciador.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.devcosta.gerenciador.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
