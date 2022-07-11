package br.com.erudio.repositories;

import br.com.erudio.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonReposity extends JpaRepository<Person, Long> {
}
