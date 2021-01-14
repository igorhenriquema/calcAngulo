package com.harmo.calculoanguloapi.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CalcAnguloRepositoryExtended<T, ID extends Serializable> 
	extends JpaRepository<T, ID> {
		public List<T> findByHourAndMinute(int hora, int minutos);	
}
