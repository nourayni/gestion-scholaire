package in.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.school.model.Cours;

public interface CoursRepository extends JpaRepository<Cours, Long> {

}
