package com.webservice.population.service.impl;

import com.webservice.population.service.IPopulationService;

public abstract class AbstractPopulationService implements IPopulationService {

	private String bh;

	@Override
	public abstract String findPopulationByGMSFHM(String gmsfhm);

	public String getBh() {
		return bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}

}
