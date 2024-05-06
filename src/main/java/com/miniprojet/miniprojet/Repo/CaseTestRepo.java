package com.miniprojet.miniprojet.Repo;

import com.miniprojet.miniprojet.Model.CaseTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface CaseTestRepo extends JpaRepository<CaseTest, Long> {

    // Vous pouvez ajouter des méthodes supplémentaires spécifiques à votre besoin ici

}