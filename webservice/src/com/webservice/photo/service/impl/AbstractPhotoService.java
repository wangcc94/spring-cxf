package com.webservice.photo.service.impl;

import com.webservice.photo.service.IPhotoService;

public abstract class AbstractPhotoService implements IPhotoService {

	private String serviceName;

	public AbstractPhotoService(String serviceName) {
		this.serviceName = serviceName;
	}

	@Override
	public abstract String findPhotoByZPH(String zph);

	@Override
	public abstract String findPhotoByGMSFHM(String gmsfhm);

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}
