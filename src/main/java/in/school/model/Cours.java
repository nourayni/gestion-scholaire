package in.school.model;

import java.io.File;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
public class Cours {
	@Id
	private Long coursId;
	private String nomCours;
	private File containe;
	@ManyToOne
	private Classe classe;
	@ManyToOne
	private Matiere matiere;
}
