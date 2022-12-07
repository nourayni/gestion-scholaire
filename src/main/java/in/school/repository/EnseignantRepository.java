package in.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.school.model.Enseignant;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {

}
