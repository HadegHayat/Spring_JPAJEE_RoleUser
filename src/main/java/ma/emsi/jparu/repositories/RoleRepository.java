package ma.emsi.jparu.repositories;

import ma.emsi.jparu.entities.Role;
import ma.emsi.jparu.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByRoleName(String roleName);
}
