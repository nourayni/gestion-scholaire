package in.school.model;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter @NoArgsConstructor @AllArgsConstructor
@Entity
public class Enseignant extends Utilisateur {
	private String grade;
	@ManyToMany(mappedBy ="enseignants", fetch = FetchType.EAGER)
	private Collection<Matiere> matieres = new ArrayList<>();
}
