﻿/**
 * @desctiption   This file is generated by  code generation tool version 0.2 ^_^
 * @Created   2017-02-10
 */
package com.yh.hr.res.pb.service;

import java.util.List;

import com.yh.component.taglib.TableTagBean;
import com.yh.hr.res.pb.dto.PbEducationTrainingInfoDTO;
import com.yh.platform.core.exception.ServiceException;


public interface PbEducationTrainingInfoService {
	/**
	 * 新增PbEducationTrainingInfo信息
	 * @param 
	 * @throws ServiceException
	 */
	public void create(PbEducationTrainingInfoDTO pbEducationTrainingInfoDto) throws ServiceException;

	/**
	 * 获取PbEducationTrainingInfo信息
	 * @param 
	 * @throws ServiceException
	 */
	public PbEducationTrainingInfoDTO get(java.lang.Long pbEducationTrainingInfoId) throws ServiceException;
    
	/**
	 * 修改PbEducationTrainingInfo信息
	 * @param 
	 * @throws ServiceException
	 */    
	public void update(PbEducationTrainingInfoDTO pbEducationTrainingInfoDto) throws ServiceException;

	/**
	 * 删除PbEducationTrainingInfo信息
	 * @param 
	 * @throws ServiceException
	 */    
	public void delete(java.lang.Long pbEducationTrainingInfoId) throws ServiceException;
    
	/**
	 * 查询所有PbEducationTrainingInfo信息
	 * @param 
	 * @throws ServiceException
	 */
	public List<PbEducationTrainingInfoDTO> find(TableTagBean ttb) throws ServiceException;

	/**
	 * 根据人员id查询该人员所有的PbEducationTrainingInfo记录
	 * @param personOid
	 * @return
	 * @throws ServiceException
	 */
	public List<PbEducationTrainingInfoDTO> listPbEducationTrainingInfoByPersonOid(Long personOid) throws ServiceException;

      
}
