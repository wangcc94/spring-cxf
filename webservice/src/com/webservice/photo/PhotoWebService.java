package com.webservice.photo;

import javax.annotation.Resource;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.webservice.photo.service.IPhotoService;
import com.webservice.utils.Config;
import com.webservice.utils.SpringContextUtil;

@Service("photoWebService")
@WebService(serviceName = "PhotoWebService", targetNamespace = "http://photo.webservice.com/")
public class PhotoWebService {

	@Resource
	private Config config;

	public String findPhoto(@WebParam(name = "key") String key,
			@WebParam(name = "serviceName") String serviceName,
			@WebParam(name = "way") String way) {
		IPhotoService service = SpringContextUtil.getBean(serviceName,
				IPhotoService.class);
		if (service != null) {
			if (way.toLowerCase().equals(config.getGmsfhm_key().toLowerCase())) {
				return service.findPhotoByGMSFHM(key);
			} else if (way.toLowerCase().equals(
					config.getZph_key().toLowerCase())) {
				return service.findPhotoByZPH(key);
			}
		}
		return "";
	}

	public String findPhotoByZPH(@WebParam(name = "key") String key,
			@WebParam(name = "serviceName") String serviceName,
			@WebParam(name = "way") String way) {
		IPhotoService service = SpringContextUtil.getBean(serviceName,
				IPhotoService.class);
		if (service != null) {
			return service.findPhotoByZPH(key);
		}
		return "";
	}

	public String findPhotoByGMSFHM(@WebParam(name = "key") String key,
			@WebParam(name = "serviceName") String serviceName) {
		IPhotoService service = SpringContextUtil.getBean(serviceName,
				IPhotoService.class);
		if (service != null) {
			return service.findPhotoByGMSFHM(key);
		}
		return "";
	}

}
