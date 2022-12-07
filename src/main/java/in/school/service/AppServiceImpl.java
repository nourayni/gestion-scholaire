package in.school.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.school.model.Role;
import in.school.model.Utilisateur;
import in.school.repository.RoleRepository;
import in.school.repository.UtilisateurRepository;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class AppServiceImpl implements AppService {
	
	private UtilisateurRepository userRepo;
	private RoleRepository roleRepo;

	@Override
	public Utilisateur adduser(Utilisateur user) {
		
		return userRepo.save(user);
	}

	@Override
	public Role addRole(Role role) {
		
		return roleRepo.save(role);
	}

	@Override
	public Utilisateur findUserByEmail(String email) {
		
		return userRepo.findByEmail(email);
	}

	@Override
	public Role findRoleByRoleName(String roleName) {
		return roleRepo.findByRoleName(roleName);
 
	}

	@Override
	public void addRoleToUser(String email, String roleName) {
		Utilisateur user = findUserByEmail(email);
		Role role = findRoleByRoleName(roleName);
		role.getUtilisateurs().add(user);
		user.getRoles().add(role);
		//userRepo.save(user);
	}
}
