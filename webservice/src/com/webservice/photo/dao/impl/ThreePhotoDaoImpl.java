package com.webservice.photo.dao.impl;

import javax.annotation.Resource;

import org.apache.commons.codec.binary.Base64;

import com.webservice.entity.Photo;
import com.webservice.photo.dao.IPhotoDao;

public class ThreePhotoDaoImpl implements IPhotoDao {
	@Resource
	private com.webservice.dao.IPhotoDao photoDao;
	private Base64 base64 = new Base64();

	@Override
	public String findPhotoByZPH(String zph) {
		Photo photo = photoDao.findPhotoByZPH(zph);
		if (photo != null && photo.getContext() != null) {
			return base64.encodeToString(photo.getContext());
		}
		return "";
	}

	@Override
	public String findPhotoByGMSFHM(String gmsfhm) {
		// TODO Auto-generated method stub
		return null;
	}

}
