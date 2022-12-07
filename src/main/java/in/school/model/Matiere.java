package in.school.model;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Matiere {
	@Id
	private Long matiereId;
	private String nomMatiere;
	private int coef;
	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<Enseignant> enseignants = new ArrayList<>(); 
	@OneToMany(mappedBy = "matiere",fetch =FetchType.LAZY)
	private Collection<Cours> cours;
}
