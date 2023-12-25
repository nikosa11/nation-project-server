package com.example.qualco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import com.example.qualco.model.Continent;

public interface ContinentRepository extends JpaRepository<Continent, Long> {

}
