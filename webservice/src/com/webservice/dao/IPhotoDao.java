package com.webservice.dao;

import com.webservice.entity.Photo;

public interface IPhotoDao {
	public Photo findPhotoByZPH(String zph);
}
