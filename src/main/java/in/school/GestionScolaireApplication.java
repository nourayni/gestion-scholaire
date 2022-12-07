package in.school;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import in.school.model.Role;
import in.school.model.Utilisateur;
import in.school.service.AppService;

@SpringBootApplication
public class GestionScolaireApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionScolaireApplication.class, args);
	}
	@Bean
	CommandLineRunner start(AppService appService) {
		return args ->{
			
			/*Utilisateur user=new Utilisateur();
			user.setEmail("odrame");
			user.setNom("ousmane");
			user.setPassword("password");
			user.setPrenom("ousmane");
			appService.adduser(user);
			
			Role role1=new Role();
			role1.setRoleName("etudiant");
			appService.addRole(role1);
			
			appService.addRoleToUser("odrame", "etudiant");*/
			
		};
	}

}
