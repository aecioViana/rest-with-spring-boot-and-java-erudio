package https.github.com.aecioViana.repository;

import https.github.com.aecioViana.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
