package com.yh.hr.select.person.queryhelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.yh.hr.select.person.dto.PersonSelectDTO;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import com.yh.component.taglib.TableTagBean;
import com.yh.platform.core.dao.DaoUtil;
import com.yh.platform.core.exception.DataAccessFailureException;
import com.yh.platform.core.exception.ServiceException;
import com.yh.platform.core.util.DataConverUtils;
import com.yh.platform.core.util.StringMap;
import com.yh.platform.core.util.StringUtil;


public class PersonSelectQueryHelper {
	
	public static List<PersonSelectDTO> listPbpersonInfo(TableTagBean ttb) throws ServiceException {
		final HashMap<String, Object> hqlParams = new HashMap<String, Object>();
		StringBuffer hql = new StringBuffer();
	
		hql.append(" select ");
		hql.append("  jppi.person_oid ");
		hql.append(" , jppi.name ");
		hql.append(" , jppi.id_no ");
		hql.append(" , jppi.person_status ");
		hql.append(" , jppi.updated_date ");
		hql.append(" , juu.unit_name ");
		
		hql.append(" , jppa.s_position_type ");
		hql.append(" , jppa.s_position_level ");
		hql.append(" , jppa.m_position_type ");
		hql.append(" , jppa.m_position_level ");
		hql.append(" , jppa.ADMINISTRATIVE_DUTY_LEVEL ");
		hql.append(" , jppa.ADMINISTRATIVE_DUTY_ATTRIBUTE ");
		hql.append(" , jppi.UNIT_OID ");
		hql.append(" , jvp.is_verified ");//校核完成标示
		hql.append(" , jppi.created_by_code ");//是否为迁移数据标示
		
		
		//排序
		hql.append(", rank() over(partition by (");
		hql.append(" select jdi.display_order  from yha_dic_item jdi  where jdi.dic_item_code =jppa.Administrative_Duty_Level  and jdi.dic_type_oid = 1015 ");
		hql.append(" ) order by (");
		hql.append("  select jdi.display_order  from yha_dic_item jdi where jdi.dic_item_code = jppa.ADMINISTRATIVE_DUTY_ATTRIBUTE and jdi.dic_type_oid = 1028 ");
		hql.append(" ) asc) rk ");
		
		hql.append(" from ");
		hql.append("   yhc_ut_unit    juu ");
		hql.append(" , yhc_pb_person_info   jppi ");
		hql.append(" , jhi_ver_person       jvp ");
		hql.append(" , YHC_PB_PERSON_ATTACH jppa ");
		
		hql.append(" where  jppi.unit_oid = juu.unit_oid ");
		hql.append("  and   jppi.person_oid = jvp.person_oid(+)   ");
		hql.append("  and   jppi.person_oid = jppa.person_oid(+)");
		
		buildSQL(ttb.getCondition(), hql, hqlParams);
		
		if (ttb.getPageSize() != 0) {
			ttb.setTotal(DaoUtil.countWithSQLByCondition((new StringBuilder().append("select count(*) from (").append(hql).append(")").toString()), hqlParams));
		}
		List<Object[]> list =DaoUtil.listWithSQLByCondition(hql.toString(), 				
 				hqlParams, ttb.getPage(), ttb.getPageSize());
		return build(list);
	}
	private static void buildSQL(StringMap params, StringBuffer hql, HashMap<String, Object> hqlParams)  throws ServiceException 
	{
		String unitName = params.get("unitName");
		String personName =params.get("personName");
		String personType =params.get("personType");
		String personStatus =params.get("personStatus");
		String authUnits = params.get("authUnits");// 资源权限
		if(StringUtils.isNotEmpty(unitName)){
			
			hql.append("  and juu.unit_name like '").append(StringUtil.wrapPercent(unitName)).append("'");
		}
		
		if(StringUtils.isNotEmpty(personName)){
			
			hql.append("  and jppi.name like '").append(StringUtil.wrapPercent(personName)).append("'");
			
		}
		if(StringUtils.isNotEmpty(personType)){
			
			hql.append("  and jppi.person_type in(").append(personType).append(")");
			
		}
		if(StringUtils.isNotEmpty(personStatus)){
			
			hql.append("  and jppi.person_status in(").append(personStatus).append(")");
			
		}
		//权限控制
		hql.append(" and jppi.UNIT_OID in(").append(authUnits).append(") ");
	}
	private static List<PersonSelectDTO> build(List<Object[]> list) throws DataAccessFailureException,ServiceException
	{
		List<PersonSelectDTO> personSelectDTOList = new ArrayList<PersonSelectDTO>();		 
		if (CollectionUtils.isEmpty(list))
		{
			return personSelectDTOList;
		}
	    for (int i = 0; i < list.size(); i++)
		{
	    	Object[] task = list.get(i);
	    	PersonSelectDTO personSelectDTO  = new PersonSelectDTO();
	    	Long personOid = task[0] == null ? null:new Long(task[0].toString());
	    	String personName = DataConverUtils.toString(task[1]);
	    	String idNo = DataConverUtils.toString(task[2]);
	    	String personStatus = DataConverUtils.toString(task[3]);
	    	/*String updatedDate = DataConverUtils.toString(task[4]);*/
	    	String unitName = DataConverUtils.toString(task[5]);
	    	String sPositionType = DataConverUtils.toString(task[6]);
	    	String sPositionLevel = DataConverUtils.toString(task[7]);
	    	String mPositionType = DataConverUtils.toString(task[8]);
	    	String mPositionLevel = DataConverUtils.toString(task[9]);
	    	String administrativeDutyLevel = DataConverUtils.toString(task[10]);
	    	String administrativeDutyAttribute = DataConverUtils.toString(task[11]);
	    	String unitOid = DataConverUtils.toString(task[12]);
	    	String isVerified = DataConverUtils.toString(task[13]);
	    	String createdByCode = DataConverUtils.toString(task[14]);
	    	
	    	
	    	personSelectDTO.setCreatedByCode(createdByCode);//是否为迁移数据
	    	personSelectDTO.setIsVerified(isVerified);//是否校核完成
	    	personSelectDTO.setPersonOid(personOid);
	    	personSelectDTO.setName(personName);
	    	personSelectDTO.setIdNo(idNo);
	    	personSelectDTO.setPersonStatus(personStatus);
	    	personSelectDTO.setUnitName(unitName);
	    	personSelectDTO.setsPositionType(sPositionType);
	    	personSelectDTO.setsPositionLevel(sPositionLevel);
	    	personSelectDTO.setmPositionType(mPositionType);
	    	personSelectDTO.setmPositionLevel(mPositionLevel);
	    	personSelectDTO.setAdministrativeDutyLevel(administrativeDutyLevel);
	    	personSelectDTO.setUnitOid(Long.valueOf(unitOid));
	    	personSelectDTO.setAdministrativeDutyAttribute(administrativeDutyAttribute);
	    	personSelectDTOList.add(personSelectDTO);
	    	
		}
	    return personSelectDTOList;
	}    
	public static List<String> check( Long personOid) throws ServiceException {
		StringBuffer sql = new StringBuffer();
		sql.append(" select bf.flow_name from yhc_pt_person pp , yhc_bt_task t , yhd_bt_flow bf");
		sql.append(" where t.task_oid = pp.task_oid");
		sql.append(" and t.item_code = bf.flow_code(+)");
		sql.append(" and t.complete_time is  null");
		sql.append(" and pp.person_oid = "+personOid);
		List<String> list=DaoUtil.findWithSQL(sql.toString());
		return list;
	}
}
