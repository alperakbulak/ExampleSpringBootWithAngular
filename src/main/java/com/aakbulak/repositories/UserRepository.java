package com.aakbulak.repositories;

import com.aakbulak.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Alper AKBULAK<alper.akbulak@indbilisim.com.tr>
 * @since 0.0.16
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByName(String name);
}
