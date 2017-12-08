﻿/**
 * @desctiption   This file is generated by  code generation tool version 0.2 ^_^
 * @Created   2017-02-10
**/
package com.yh.hr.info.ver.unit.comm.facade;

import java.util.List;

import com.yh.component.taglib.TableTagBean;
import com.yh.hr.res.pb.dto.PbEducationTrainingInfoDTO;
import com.yh.hr.res.pb.service.PbEducationTrainingInfoService;
import com.yh.platform.core.exception.ServiceException;

public class PbEducationTrainingInfoFacade {

	private PbEducationTrainingInfoService pbEducationTrainingInfoService;

	public void setPbEducationTrainingInfoService(PbEducationTrainingInfoService pbEducationTrainingInfoService) {
		this.pbEducationTrainingInfoService = pbEducationTrainingInfoService;
	}

	/**
	 * 新增PbEducationTrainingInfo详细信息
	 * 
	 * @param 
	 * @return
	 * @throws ServiceException
	 */
	public void create(PbEducationTrainingInfoDTO pbEducationTrainingInfoDto) throws ServiceException {
		pbEducationTrainingInfoService.create(pbEducationTrainingInfoDto);
	}
	
	    /**
	 * 删除多PbEducationTrainingInfo信息
	 * 
	 * @param 
	 * @return
	 * @throws ServiceException
	 */
	public void delete(java.lang.Long pbEducationTrainingInfoId) throws ServiceException {
		pbEducationTrainingInfoService.delete(pbEducationTrainingInfoId);
	}



	/**
	 * 查找PbEducationTrainingInfo详细信息
	 * 
	 * @param 
	 * @return
	 * @throws ServiceException
	 */
	public PbEducationTrainingInfoDTO get(java.lang.Long pbEducationTrainingInfoId) throws ServiceException {
		return pbEducationTrainingInfoService.get(pbEducationTrainingInfoId);
	}
	
	/**
	 * 列出多条PbEducationTrainingInfo信息
	 * 
	 * @param 
	 * @return
	 * @throws ServiceException
	 */
	public List<PbEducationTrainingInfoDTO> find(TableTagBean ttb) throws ServiceException {
		return pbEducationTrainingInfoService.find(ttb);
	}
    
    /**
	 * 更新&修改PbEducationTrainingInfo详细信息
	 * 
	 * @param 
	 * @return
	 * @throws ServiceException
	 */
	public void update(PbEducationTrainingInfoDTO pbEducationTrainingInfoDto) throws ServiceException {
		pbEducationTrainingInfoService.update(pbEducationTrainingInfoDto);
	}
	
	/**
	 * 根据人员id查询该人员所有的PbEducationTrainingInfo记录
	 * @param personOid
	 * @return
	 * @throws ServiceException
	 */
	public List<PbEducationTrainingInfoDTO> listPbEducationTrainingInfoByPersonOid(Long personOid) throws ServiceException{
		return pbEducationTrainingInfoService.listPbEducationTrainingInfoByPersonOid(personOid);
	}

}