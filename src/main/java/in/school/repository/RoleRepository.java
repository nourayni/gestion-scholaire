package in.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.school.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByRoleName(String roleName);

}
