package in.school.model;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @NoArgsConstructor @AllArgsConstructor
@Setter
@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	private String nom;
	private String prenom;
	private String password;
	@ManyToMany(mappedBy = "utilisateurs",fetch =FetchType.EAGER)
	private Collection<Role> roles=new ArrayList<>();  
}
