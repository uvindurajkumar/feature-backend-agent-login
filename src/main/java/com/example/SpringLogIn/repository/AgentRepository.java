package com.example.SpringLogIn.repository;

import com.example.SpringLogIn.domain.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long> {
    Agent findByUsernameAndPassword(String username, String password);
}
