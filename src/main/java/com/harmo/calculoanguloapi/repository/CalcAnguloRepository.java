package com.harmo.calculoanguloapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harmo.calculoanguloapi.entity.CalcAngulo;

@Repository
public interface CalcAnguloRepository extends JpaRepository<CalcAngulo, Long>{
	
}
