﻿/**
 * @desctiption   This file is generated by  code generation tool version 0.2 ^_^
 * @Created   2017-02-10
**/
package com.yh.hr.info.ver.unit.comm.facade;

import java.util.List;

import com.yh.component.taglib.TableTagBean;
import com.yh.hr.res.pb.dto.PbYnGwEmployInfoDTO;
import com.yh.hr.res.pb.service.PbYnGwEmployInfoService;
import com.yh.platform.core.exception.ServiceException;

public class PbYnGwEmployInfoFacade {

	private PbYnGwEmployInfoService pbYnGwEmployInfoService;

	public void setPbYnGwEmployInfoService(PbYnGwEmployInfoService pbYnGwEmployInfoService) {
		this.pbYnGwEmployInfoService = pbYnGwEmployInfoService;
	}

	/**
	 * 新增PbYnGwEmployInfo详细信息
	 * 
	 * @param 
	 * @return
	 * @throws ServiceException
	 */
	public void create(PbYnGwEmployInfoDTO pbYnGwEmployInfoDto) throws ServiceException {
		pbYnGwEmployInfoService.create(pbYnGwEmployInfoDto);
	}
	
	    /**
	 * 删除多PbYnGwEmployInfo信息
	 * 
	 * @param 
	 * @return
	 * @throws ServiceException
	 */
	public void delete(java.lang.Long pbYnGwEmployInfoId) throws ServiceException {
		pbYnGwEmployInfoService.delete(pbYnGwEmployInfoId);
	}



	/**
	 * 查找PbYnGwEmployInfo详细信息
	 * 
	 * @param 
	 * @return
	 * @throws ServiceException
	 */
	public PbYnGwEmployInfoDTO get(java.lang.Long pbYnGwEmployInfoId) throws ServiceException {
		return pbYnGwEmployInfoService.get(pbYnGwEmployInfoId);
	}
	
	/**
	 * 列出多条PbYnGwEmployInfo信息
	 * 
	 * @param 
	 * @return
	 * @throws ServiceException
	 */
	public List<PbYnGwEmployInfoDTO> find(TableTagBean ttb) throws ServiceException {
		return pbYnGwEmployInfoService.find(ttb);
	}
    
    /**
	 * 更新&修改PbYnGwEmployInfo详细信息
	 * 
	 * @param 
	 * @return
	 * @throws ServiceException
	 */
	public void update(PbYnGwEmployInfoDTO pbYnGwEmployInfoDto) throws ServiceException {
		pbYnGwEmployInfoService.update(pbYnGwEmployInfoDto);
	}
	public boolean checkStatus(PbYnGwEmployInfoDTO pbYnGwEmployInfoDto) throws ServiceException {
		return pbYnGwEmployInfoService.checkStatus(pbYnGwEmployInfoDto);
	}
	
	/**
	 * 根据人员id查询该人员所有的院内岗位聘任信息
	 * @param personOid
	 * @return
	 * @throws ServiceException
	 */
	public List<PbYnGwEmployInfoDTO> listPbYnGwEmployInfoByPersonOid(Long personOid) throws ServiceException{
		return pbYnGwEmployInfoService.listPbYnGwEmployInfoByPersonOid(personOid);
	}
}