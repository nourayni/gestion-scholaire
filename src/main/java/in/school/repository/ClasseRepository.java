package in.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.school.model.Classe;

public interface ClasseRepository extends JpaRepository<Classe, Long> {

}
