package in.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.school.model.Matiere;

public interface MatiereRepository extends JpaRepository<Matiere, Long> {

}
