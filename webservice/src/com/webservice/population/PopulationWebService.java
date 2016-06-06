package com.webservice.population;

import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.webservice.population.service.impl.AbstractPopulationService;

@Service("populationWebService")
@WebService(serviceName = "PopulationWebService", targetNamespace = "http://population.webservice.com/")
public class PopulationWebService {

	@Resource
	private Map<String, AbstractPopulationService> populationServiceMap;

	@WebMethod
	public String findPopulationByGMSFHM(@WebParam(name = "key") String gmsfhm,
			@WebParam(name = "bh") String bh) {
		if (populationServiceMap != null) {
			Set<String> keySet = populationServiceMap.keySet();
			for (String _key : keySet) {
				AbstractPopulationService populationService = populationServiceMap
						.get(_key);
				if (populationService.getBh() != null
						&& populationService.getBh().equals(bh)) {
					return populationService.findPopulationByGMSFHM(gmsfhm);
				}
			}
		}
		return "";
	}
}
