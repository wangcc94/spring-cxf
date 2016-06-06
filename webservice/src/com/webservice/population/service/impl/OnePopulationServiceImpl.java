package com.webservice.population.service.impl;

import org.springframework.stereotype.Service;

@Service
public class OnePopulationServiceImpl extends AbstractPopulationService {

	public OnePopulationServiceImpl() {
		this.setBh("one");
	}

	@Override
	public String findPopulationByGMSFHM(String gmsfhm) {
		return "One-findPopulationByGMSFHM";
	}

}
