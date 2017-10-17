package com.aakbulak.repositories;

import com.aakbulak.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Alper AKBULAK<alper.akbulak@indbilisim.com.tr>
 * @since 0.0.16
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByName(String name);
}
