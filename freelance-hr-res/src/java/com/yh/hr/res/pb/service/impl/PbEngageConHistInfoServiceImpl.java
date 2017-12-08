/**
 * @desctiption   This file is generated by  code generation tool version 0.2 ^_^
 * @Created   2017-02-13
**/
package com.yh.hr.res.pb.service.impl;

import com.yh.component.taglib.TableTagBean;
import com.yh.hr.res.pb.bo.PbEngageConHistInfo;
import com.yh.hr.res.pb.dto.PbEngageConHistInfoDTO;
import com.yh.hr.res.pb.queryhelper.PbEngageConHistInfoQueryHelper;
import com.yh.hr.res.pb.service.PbEngageConHistInfoService;
import com.yh.platform.core.dao.DaoUtil;
import com.yh.platform.core.exception.ServiceException;
import com.yh.platform.core.util.BeanHelper;
import com.yh.platform.core.util.StringMap;

import jade.workflow.utils.ObjectUtil;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PbEngageConHistInfoServiceImpl implements PbEngageConHistInfoService {
	public void create(PbEngageConHistInfoDTO pbEngageConHistInfoDto) throws ServiceException {
		PbEngageConHistInfo pbEngageConHistInfo = new PbEngageConHistInfo();
		BeanHelper.copyProperties(pbEngageConHistInfoDto, pbEngageConHistInfo);
        pbEngageConHistInfo.save();
	}

	public PbEngageConHistInfoDTO get(java.lang.Long pbEngageConHistInfoId) throws ServiceException {
        return BeanHelper.copyProperties(DaoUtil.get(PbEngageConHistInfo.class, pbEngageConHistInfoId),PbEngageConHistInfoDTO.class);
	}
    
	public void update(PbEngageConHistInfoDTO pbEngageConHistInfoDto) throws ServiceException {

		PbEngageConHistInfo pbEngageConHistInfo = new PbEngageConHistInfo();
		BeanHelper.copyProperties(pbEngageConHistInfoDto, pbEngageConHistInfo);
		pbEngageConHistInfo.update();
	}
    
	public void delete(java.lang.Long pbEngageConHistInfoId) throws ServiceException {
      DaoUtil.get(PbEngageConHistInfo.class, pbEngageConHistInfoId).delete();
	}
    
	public List<PbEngageConHistInfoDTO> find(TableTagBean ttb) throws ServiceException {
        StringBuilder hql = new StringBuilder();
        HashMap<String, Object> hqlParams = new HashMap<String, Object>();
        buildHQL(ttb.getCondition(), hql, hqlParams);
        String order = ttb.getOrderBy();
        if (order != null) {
            if (ttb.getAsc()) {
                hql.append(" order by " + order + " asc");
            } else {
                hql.append(" order by " + order + " desc");
            }
        }
        List<PbEngageConHistInfo> list = DaoUtil.listByCondition(hql.toString(), hqlParams, ttb.getPage() * ttb.getPageSize(), ttb.getPageSize());
        List<PbEngageConHistInfoDTO> dtoList = new ArrayList<PbEngageConHistInfoDTO>();
		if(!CollectionUtils.isEmpty(list))
		{
			for(PbEngageConHistInfo bo : list)
			{
				PbEngageConHistInfoDTO dto = new PbEngageConHistInfoDTO();
				BeanHelper.copyProperties(bo, dto);
				dtoList.add(dto);
			}
		}
        ttb.setList(list);
        ttb.setTotal(DaoUtil.countByCondition("select count(*) "+hql, hqlParams));
        return dtoList;
	}

    public void buildHQL(StringMap params, StringBuilder hql, HashMap<String, Object> hqlParams) throws ServiceException {
        hql.append("from PbEngageConHistInfo where 1=1");
        String personOid = params.getAsStringEmptyNull("personOid");
        if (personOid != null){
           	hql.append(" and personOid = :personOid");
           	try{
           		hqlParams.put("personOid", ObjectUtil.getValue(personOid, java.lang.Long.class));
        	} catch (jade.workflow.exception.ServiceException e) {
			e.printStackTrace();
			}
        }
        String contractNo = params.getAsStringEmptyNull("contractNo");
        if (contractNo != null){
           hql.append(" and contractNo like :contractNo");
           hqlParams.put("contractNo", "%"+contractNo.trim()+"%");
        }
        String contractType = params.getAsStringEmptyNull("contractType");
        if (contractType != null){
           hql.append(" and contractType like :contractType");
           hqlParams.put("contractType", "%"+contractType.trim()+"%");
        }
        String changeType = params.getAsStringEmptyNull("changeType");
        if (changeType != null){
           hql.append(" and changeType like :changeType");
           hqlParams.put("changeType", "%"+changeType.trim()+"%");
        }
   }
public boolean checkContractNo(PbEngageConHistInfoDTO pbEngageConHistInfoDto) throws ServiceException {
		
		return PbEngageConHistInfoQueryHelper.checkContractNo(pbEngageConHistInfoDto);
	}

    /**
     * ����Աid���Ҹ���Ա�ĺ�ͬ��ʷ��Ϣ
     * @param personOid
     * @return
     * @throws ServiceException
     */
    public List<PbEngageConHistInfoDTO> listPbEngageConHistInfoByPersonOid(Long personOid) throws ServiceException {
        return PbEngageConHistInfoQueryHelper.listPbEngageConHistInfoByPersonOid(personOid);
    }

	public void deleteByPersonOid(Long personOid) throws ServiceException {
		PbEngageConHistInfoQueryHelper.deleteByPersonOid(personOid);
	}

}