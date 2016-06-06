package com.webservice.photo.dao;

public interface IPhotoDao {
	/**
	 * 根据照片号查找照片
	 * 
	 * @param zph
	 * @param bh
	 * @return
	 */
	String findPhotoByZPH(String zph);

	/**
	 * 根据身份证号查找照片
	 * 
	 * @param gmsfhm
	 * @param bh
	 * @return
	 */
	String findPhotoByGMSFHM(String gmsfhm);
	
	
}
