package com.webservice.photo.service.impl;

import com.webservice.photo.dao.IPhotoDao;

public class WebServicePhotoServiceImpl extends AbstractPhotoService {
	private IPhotoDao photoDao;

	public WebServicePhotoServiceImpl(String serviceName) {
		super(serviceName);
	}

	@Override
	public String findPhotoByZPH(String zph) {
		return photoDao.findPhotoByZPH(zph);
	}

	@Override
	public String findPhotoByGMSFHM(String gmsfhm) {
		return photoDao.findPhotoByGMSFHM(gmsfhm);
	}

	public IPhotoDao getPhotoDao() {
		return photoDao;
	}

	public void setPhotoDao(IPhotoDao photoDao) {
		this.photoDao = photoDao;
	}

}
