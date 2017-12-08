﻿/**
 * @desctiption   This file is generated by  code generation tool version 0.2 ^_^
 * @Created   2017-02-13
**/
package com.yh.hr.info.ver.unit.comm.web.action;

import com.yh.hr.info.ver.unit.comm.web.form.PbPunishmentInfoForm;
import jade.workflow.utils.ObjectUtil;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yh.component.taglib.TableTagBean;
import com.yh.hr.info.ver.unit.comm.facade.PbPunishmentInfoFacade;
import com.yh.hr.res.pb.dto.PbPunishmentInfoDTO;
import com.yh.platform.core.exception.ServiceException;
import com.yh.platform.core.util.BeanHelper;
import com.yh.platform.core.util.DateUtil;
import com.yh.platform.core.util.JSONHelper;
import com.yh.platform.core.util.NumberUtils;
import com.yh.platform.core.util.SpringBeanUtil;
import com.yh.platform.core.util.StringUtil;
import com.yh.platform.core.web.UserContext;
import com.yh.platform.core.web.action.BaseAction;

public class PbPunishmentInfoAction extends BaseAction {
	private PbPunishmentInfoFacade pbPunishmentInfoFacade = (PbPunishmentInfoFacade) SpringBeanUtil.getBean("pbPunishmentInfoFacade");

	/**
	 * 列出所有 PbPunishmentInfo信息
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward listPbPunishmentInfo(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		TableTagBean ttb = TableTagBean.getFromRequest(request);
		if (request.getMethod().equals("POST")) {
	        @SuppressWarnings("rawtypes")
			Map map = BeanUtils.describe(form);
	        ttb.getCondition().copyFrom(map, true);
	    } else {
	        BeanUtils.populate(form, ttb.getCondition());
	        request.setAttribute("pbPunishmentInfoForm", form);
	    }
        try {
	        pbPunishmentInfoFacade.find(ttb);
	        request.setAttribute("list", ttb.getList());
        } catch (Exception se) {
			this.handleException(request, se, null);
			return mapping.findForward("fail");
		}
        return mapping.findForward("success");
	}
	
	/**
	 * 查找单个PbPunishmentInfo信息
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward show(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String punishmentOid = request.getParameter("punishmentOid");
        if (StringUtil.isBlank(punishmentOid)) {
            punishmentOid = ObjectUtil.getValue(request.getAttribute("punishmentOid"), String.class);
        }
		try {
            if (StringUtils.isEmpty(punishmentOid)) {
				throw new ServiceException("error.pk.invalid", "pbPunishmentInfo punishmentOid is null");
			}
            PbPunishmentInfoDTO pbPunishmentInfoDto = pbPunishmentInfoFacade.get(ObjectUtil.getValue(punishmentOid, java.lang.Long.class));
			if (null == pbPunishmentInfoDto) {
				throw new ServiceException(null, "查询不到相关信息");
			}
			PbPunishmentInfoForm pbPunishmentInfoForm = BeanHelper.copyProperties(pbPunishmentInfoDto, PbPunishmentInfoForm.class);
			request.setAttribute("pbPunishmentInfoForm", pbPunishmentInfoForm);
            request.setAttribute("punishmentOid", punishmentOid);
		} catch (Exception se) {
			this.handleException(request, se, "punishmentOid=" + punishmentOid);
			return mapping.getInputForward();
		}
		return mapping.findForward("success");
	}

	/**
	 * 跳转到 PbPunishmentInfo信息添加页面
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward goCreate(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		//参数校验，可根据实际情况修改
		String personOid = request.getParameter("personOid");
		String urlId = request.getParameter("urlId");
		try
		{
			if(StringUtils.isEmpty(personOid))
			{
				throw new ServiceException("personOid is null");
			}
			request.setAttribute("personOid", personOid);
			request.setAttribute("urlId", urlId);
		}
		catch(Exception se)
		{
			this.handleException(request, se, null);
			return mapping.getInputForward();
		}
		return mapping.findForward(FORWARD_SUCCESS);
	}

	/**
	 * 添加 PbPunishmentInfo信息
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward create(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (this.isCancelled(request)) {
			return mapping.findForward("cancel");
		}
		String personOid = request.getParameter("personOid");
		PbPunishmentInfoForm pbPunishmentInfoForm = (PbPunishmentInfoForm) form;
		try {
			if(StringUtils.isEmpty(personOid))
			{
				throw new ServiceException("personOid is null");
			}
			PbPunishmentInfoDTO pbPunishmentInfoDto = BeanHelper.copyProperties(pbPunishmentInfoForm, PbPunishmentInfoDTO.class);
			pbPunishmentInfoDto.setPersonOid(NumberUtils.longValue(personOid));
			pbPunishmentInfoDto.setCreateBy(UserContext.getLoginUserID());
			pbPunishmentInfoDto.setCreateName(UserContext.getLoginUserName());
			pbPunishmentInfoDto.setCreateDate(DateUtil.now());
			pbPunishmentInfoFacade.create(pbPunishmentInfoDto);
			response.getWriter().write(JSONHelper.fromObject(true, null).toString());
		} catch (Exception se) {
			this.handleException(request, se, null);
			response.getWriter().write(JSONHelper.fromObject(false, StringUtils.defaultIfEmpty(se.getMessage(), "修改失败")).toString());
		}

		return null;
	}


	/**
	 * 跳转到 PbPunishmentInfo信息修改（编辑）页面前的查询回显
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward goUpdate(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		if(this.isCancelled(request)) {
			return mapping.findForward("cancel");
		}

        String urlId = request.getParameter("urlId");
        String punishmentOid = request.getParameter("punishmentOid");

		try {
            if (StringUtils.isBlank(punishmentOid)) {
				throw new ServiceException("error.pk.invalid", "pbPunishmentInfo punishmentOid is null");
			}
            PbPunishmentInfoDTO pbPunishmentInfoDto = pbPunishmentInfoFacade.get(ObjectUtil.getValue(punishmentOid, java.lang.Long.class));
			if (null == pbPunishmentInfoDto) {
				throw new ServiceException("error.object.notfound", "pbPunishmentInfo not found by punishmentOid");
			}
			PbPunishmentInfoForm pbPunishmentInfoForm = BeanHelper.copyProperties(pbPunishmentInfoDto, PbPunishmentInfoForm.class);
			request.setAttribute("urlId", urlId);
			request.setAttribute("pbPunishmentInfoForm", pbPunishmentInfoForm);
//            request.setAttribute("punishmentOid", punishmentOid);
		} catch (Exception se) {
			this.handleException(request, se, "punishmentOid=" + punishmentOid);
			return mapping.getInputForward();
		}
		return goUpdateView(mapping, form, request, response);
	}

	/**
	 * 跳转到 PbPunishmentInfo信息修改（编辑）页面
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
    public ActionForward goUpdateView(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        //add jsp init values
        @SuppressWarnings("unused")
		PbPunishmentInfoForm pbPunishmentInfoForm = (PbPunishmentInfoForm) form;
        return mapping.findForward("success");
    }

	/**
	 * 更新 PbPunishmentInfo信息
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ActionForward update(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		if(this.isCancelled(request)) {
			return mapping.findForward("cancel");
		}
//        String punishmentOid = request.getParameter("punishmentOid");
		PbPunishmentInfoForm pbPunishmentInfoForm = (PbPunishmentInfoForm) form;
		try {
//            if (StringUtils.isBlank(punishmentOid)) {
//				throw new ServiceException("error.pk.invalid", "pbPunishmentInfo punishmentOid is null");
//			}
//			if(StringUtils.isEmpty(personOid))
//			{
//				throw new ServiceException("personOid is null");
//			}
			PbPunishmentInfoDTO pbPunishmentInfoDto = new PbPunishmentInfoDTO();
			BeanHelper.copyProperties(pbPunishmentInfoForm, pbPunishmentInfoDto);
			pbPunishmentInfoDto.setUpdateBy(UserContext.getLoginUserID());
			pbPunishmentInfoDto.setUpdateName(UserContext.getLoginUserName());
			pbPunishmentInfoDto.setUpdateDate(DateUtil.now());
			pbPunishmentInfoFacade.update(pbPunishmentInfoDto);
			response.getWriter().write(JSONHelper.fromObject(true, null).toString());
		} catch (Exception se) {
			this.handleException(request, se, pbPunishmentInfoForm);
			response.getWriter().write(JSONHelper.fromObject(false, StringUtils.defaultIfEmpty(se.getMessage(), "修改失败")).toString());
		}

		return null;
	}



	/**
	 * 删除 PbPunishmentInfo信息
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
    public ActionForward delete(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
           String punishmentOid = request.getParameter("punishmentOid");
        try {
           if(StringUtils.isEmpty(punishmentOid))
			{
				throw new ServiceException(null, "punishmentOid is null");
			}
            pbPunishmentInfoFacade.delete(ObjectUtil.getValue(punishmentOid, java.lang.Long.class));
            response.getWriter().write(JSONHelper.fromObject(true, null).toString());
        } catch (Exception se) {
            this.handleException(request, se, "punishmentOid=" + punishmentOid);
            return mapping.getInputForward();
        }
        return null;
    }

}