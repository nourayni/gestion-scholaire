package in.school.model;



import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter @NoArgsConstructor @AllArgsConstructor
@Entity
public class Etudiant extends Utilisateur {
	private Date dateNaissance;
	private String photo;
	private String lieuDeNaissance;
	@ManyToOne
	private Classe classe;
	@OneToMany(mappedBy = "etudiant",fetch = FetchType.LAZY)
	private Collection<Resultat> resultats;

}
