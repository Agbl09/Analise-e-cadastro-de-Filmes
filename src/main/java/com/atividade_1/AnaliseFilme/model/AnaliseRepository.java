package com.atividade_1.AnaliseFilme.model;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

@Repository
public interface AnaliseRepository extends JpaRepository<Analise, Integer>
{
    
}