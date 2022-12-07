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
public class Controle {
	@Id
	private Long controleId;
	private String controleNom;
	@OneToMany(mappedBy = "controle",fetch = FetchType.LAZY)
	private Collection<Resultat> resultats;

}
