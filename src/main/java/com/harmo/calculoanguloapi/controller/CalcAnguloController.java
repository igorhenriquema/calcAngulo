package com.harmo.calculoanguloapi.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.harmo.calculoanguloapi.repository.CalcAnguloRepository;
import com.harmo.calculoanguloapi.entity.CalcAngulo;

@RestController
public class CalcAnguloController {
	
	@Autowired
	private CalcAnguloRepository _calcAnguloRepository;
	
	@RequestMapping(value = "/calculo", method = RequestMethod.GET)
	public List<CalcAngulo> Get() {
		return _calcAnguloRepository.findAll();
	}
	
	@RequestMapping(value = "/calculo/{id}", method = RequestMethod.GET)
	public ResponseEntity<CalcAngulo> GetById(@PathVariable(value = "id") long id) {
		Optional<CalcAngulo> calcAngulo = _calcAnguloRepository.findById(id);
		if (calcAngulo.isPresent())
			return new ResponseEntity<CalcAngulo>(calcAngulo.get(), HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(value = "/calcAngulo/{hora}/{minutos}", method = RequestMethod.GET)
	public CalcAngulo Post(@Validated @RequestBody CalcAngulo calcangulo) {
		
		Optional<CalcAngulo> calcAngulo = _calcAnguloRepository.findById(id);
		
		
		//private int minutos = CalcAngulo.this.getMinutos();
		//private int horas = CalcAngulo.this.getHora();
		//CalcAngulo calcAngulo = _calcAnguloRepository.findAll();	
		//CalcAngulo.this.setData(new Date());
		//minutos = (6 * minutos);
		//horas = (30 * horas) + (minutos/2);
		//CalcAngulo.this.setAngulo(horas - minutos);
		return _calcAnguloRepository.save(calcangulo);
	}
	
}
