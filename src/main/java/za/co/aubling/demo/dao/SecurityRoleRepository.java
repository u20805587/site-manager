package za.co.aubling.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.aubling.demo.domain.SecurityRole;

public interface SecurityRoleRepository extends JpaRepository<SecurityRole, String> {
}
