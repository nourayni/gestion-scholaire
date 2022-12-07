package in.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.school.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
	Utilisateur findByEmail(String email);

}
