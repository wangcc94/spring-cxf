package com.webservice.photo.dao.impl;

import com.webservice.photo.dao.IPhotoDao;

public class OnePhotoDaoImpl implements IPhotoDao {

	@Override
	public String findPhotoByZPH(String zph) {
		return "One-findPhotoByZPH";
	}

	@Override
	public String findPhotoByGMSFHM(String gmsfhm) {
		return "One-findPhotoByGMSFHM";
	}

}
