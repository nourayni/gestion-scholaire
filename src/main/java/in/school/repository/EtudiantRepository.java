package in.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.school.model.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
