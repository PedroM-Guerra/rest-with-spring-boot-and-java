package PedroM_Guerra.repository;

import PedroM_Guerra.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}
