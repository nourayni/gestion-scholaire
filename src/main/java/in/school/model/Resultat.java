package in.school.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Resultat {
	@Id
	private Long resultId;
	private int note;
	private String dateControle;
	@ManyToOne
	private Controle controle;
	@ManyToOne
	private Etudiant etudiant;
}
