package org.example.spring_for_project.repositories;

import org.example.spring_for_project.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Можно добавить кастомные методы, например, поиск по email
    User findByEmail(String email);
}
