package in.school.model;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Classe {
	@Id
	private Long classeId;
	private String nomClasse;
	@OneToMany(mappedBy = "classe",fetch = FetchType.LAZY)
	private Collection<Etudiant> etudiants;
	@OneToMany(mappedBy = "classe",fetch = FetchType.LAZY)
	private Collection<Cours> cours;
}
