package in.school.service;

import in.school.model.Role;
import in.school.model.Utilisateur;

public interface AppService {
	Utilisateur adduser(Utilisateur user);
	Role addRole(Role role);
	Utilisateur findUserByEmail(String email);
	Role findRoleByRoleName(String roleName);
	void addRoleToUser(String email,String roleName);

}
