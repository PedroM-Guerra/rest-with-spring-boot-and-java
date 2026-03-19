package pedroMGuerra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pedroMGuerra.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {}
