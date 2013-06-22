/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */


package com.ljbd.tour.maldives.website.master.controller;

import java.util.Map;

import java.text.SimpleDateFormat;
import java.util.Date;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.ljbd.common.support.BaseRestSpringController;
import com.ljbd.tour.common.enumtype.CompositionForum4MEnum;
import com.ljbd.tour.common.enumtype.MainPushEnum;
import com.ljbd.tour.maldives.facade.TourCompositionMaldivesService;
import com.ljbd.tour.maldives.manager.TourCompositionMaldivesManager;
import com.ljbd.tour.maldives.model.TourCompositionMaldives;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.web.scope.Flash;

import javax.annotation.Resource;
import java.util.*;


import cn.org.rapid_framework.util.*;
import cn.org.rapid_framework.web.util.*;
import cn.org.rapid_framework.page.*;
import cn.org.rapid_framework.page.impl.*;

import com.ljbd.tour.maldives.model.*;
import com.ljbd.tour.maldives.dao.*;
import com.ljbd.tour.maldives.service.*;
import com.ljbd.tour.maldives.model.query.*;

@Controller
@RequestMapping("/")
public class TourCompositionMaldivesController extends BaseRestSpringController<TourCompositionMaldives, java.lang.Integer> {
    protected static final String DEFAULT_SORT_COLUMNS = null;
    @Resource
    private TourCompositionMaldivesManager tourCompositionMaldivesManager;
    @Resource
    private TourCompositionMaldivesService tourCompositionMaldivesService;

    private final String LIST_ACTION = "redirect:/tourcompositionmaldives";

    /**
     * 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,注意大小写
     */
    public void setTourCompositionMaldivesManager(TourCompositionMaldivesManager manager) {
        this.tourCompositionMaldivesManager = manager;
    }

    /**
     * binder用于bean属性的设置
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }

    /**
     * 增加了@ModelAttribute的方法可以在本controller方法调用前执行,可以存放一些共享变量,如枚举值,或是一些初始化操作
     */
    @ModelAttribute
    public void init(ModelMap model) {
        model.put("now", new java.sql.Timestamp(System.currentTimeMillis()));
    }

    /**
     * 列表
     */
    @RequestMapping
    public String index(ModelMap model, TourCompositionMaldivesQuery query, HttpServletRequest request, HttpServletResponse response) {
        List<TourCompositionMaldives> tcms = tourCompositionMaldivesService.getTourCompositionMaldives4Master();
        Map<Integer, List<TourCompositionMaldives>> result = this.CollectionSplit(tcms);
        model.addAttribute("CF4M_I", result.get(CompositionForum4MEnum.CF4M_I.getKey()));
        model.addAttribute("CF4M_I_I", result.get(CompositionForum4MEnum.CF4M_I_I.getKey()));
        model.addAttribute("CF4M_II", result.get(CompositionForum4MEnum.CF4M_II.getKey()));
        model.addAttribute("CF4M_II_I", result.get(CompositionForum4MEnum.CF4M_II_I.getKey()));
        model.addAttribute("CF4M_III_I", result.get(CompositionForum4MEnum.CF4M_III_I.getKey()));
        model.addAttribute("CF4M_III_I_I", result.get(CompositionForum4MEnum.CF4M_III_I_I.getKey()));
        model.addAttribute("CF4M_III_II", result.get(CompositionForum4MEnum.CF4M_III_II.getKey()));
        model.addAttribute("CF4M_III_II_I", result.get(CompositionForum4MEnum.CF4M_III_II_I.getKey()));
        model.addAttribute("CF4M_III_III", result.get(CompositionForum4MEnum.CF4M_III_III.getKey()));
        model.addAttribute("CF4M_III_III_I", result.get(CompositionForum4MEnum.CF4M_III_III_I.getKey()));
        model.addAttribute("CF4M_IV", result.get(CompositionForum4MEnum.CF4M_IV.getKey()));
        model.addAttribute("CF4M_V", result.get(CompositionForum4MEnum.CF4M_V.getKey()));
        return "/index";
    }

    /*
* 将数据结果差分成页面可识别jie
* */
    private Map<Integer, List<TourCompositionMaldives>> CollectionSplit(List<TourCompositionMaldives> args) {
        Map<Integer, List<TourCompositionMaldives>> result = new HashMap<Integer, List<TourCompositionMaldives>>();
        List<TourCompositionMaldives> tcms_cf4m_i = new ArrayList<TourCompositionMaldives>();
        List<TourCompositionMaldives> tcms_cf4m_i_i = new ArrayList<TourCompositionMaldives>();
        List<TourCompositionMaldives> tcms_cf4m_ii = new ArrayList<TourCompositionMaldives>();
        List<TourCompositionMaldives> tcms_cf4m_ii_i = new ArrayList<TourCompositionMaldives>();
        List<TourCompositionMaldives> tcms_cf4m_iii = new ArrayList<TourCompositionMaldives>();
        List<TourCompositionMaldives> tcms_cf4m_iii_i = new ArrayList<TourCompositionMaldives>();
        List<TourCompositionMaldives> tcms_cf4m_iii_i_i = new ArrayList<TourCompositionMaldives>();
        List<TourCompositionMaldives> tcms_cf4m_iii_ii = new ArrayList<TourCompositionMaldives>();
        List<TourCompositionMaldives> tcms_cf4m_iii_ii_i = new ArrayList<TourCompositionMaldives>();
        List<TourCompositionMaldives> tcms_cf4m_iii_iii = new ArrayList<TourCompositionMaldives>();
        List<TourCompositionMaldives> tcms_cf4m_iii_iii_i = new ArrayList<TourCompositionMaldives>();
        List<TourCompositionMaldives> tcms_cf4m_iv = new ArrayList<TourCompositionMaldives>();
        List<TourCompositionMaldives> tcms_cf4m_v = new ArrayList<TourCompositionMaldives>();
        Map<Integer, Integer> flag = new HashMap<Integer, Integer>();
        for (TourCompositionMaldives tcm : args) {
            if (CompositionForum4MEnum.CF4M_I.getKey() == tcm.getForum() && tcm.getMainPush() == MainPushEnum.MP_YES.getKey()) {
                tcms_cf4m_i.add(tcm);
            }
            if (CompositionForum4MEnum.CF4M_I.getKey() == tcm.getForum() && tcm.getMainPush() == MainPushEnum.MP_NO.getKey()) {
                tcms_cf4m_i_i.add(tcm);
            }
            if (CompositionForum4MEnum.CF4M_II.getKey() == tcm.getForum() && tcm.getMainPush() == MainPushEnum.MP_YES.getKey()) {
                tcms_cf4m_ii.add(tcm);
            }
            if (CompositionForum4MEnum.CF4M_II.getKey() == tcm.getForum() && tcm.getMainPush() == MainPushEnum.MP_NO.getKey()) {
                tcms_cf4m_ii_i.add(tcm);
            }

            if (CompositionForum4MEnum.CF4M_III.getKey() == tcm.getForum()) {
                //tcms_cf4m_iii.add(tcm);
                if (flag.get(tcm.getTourHotelId()) == null) {
                    flag.put(tcm.getTourHotelId(), tcm.getTourHotelId());
                }

                int insterFlag = 0;
                insterFlag = flag.size();
                if(tcms_cf4m_iii_i !=null&&tcms_cf4m_iii_i.size()!=0){
                    if (tcms_cf4m_iii_i.get(0).getTourHotelId() == tcm.getTourHotelId()) {
                        insterFlag = 1;
                    }
                }
                if(tcms_cf4m_iii_i_i !=null&&tcms_cf4m_iii_i_i.size()!=0){
                    if (tcms_cf4m_iii_i_i.get(0).getTourHotelId() == tcm.getTourHotelId()) {
                        insterFlag = 1;
                    }
                }
                if(tcms_cf4m_iii_ii !=null&&tcms_cf4m_iii_ii.size()!=0){
                    if (tcms_cf4m_iii_ii.get(0).getTourHotelId() == tcm.getTourHotelId()) {
                        insterFlag = 2;
                    }
                }
                if(tcms_cf4m_iii_ii_i !=null&&tcms_cf4m_iii_ii_i.size()!=0){
                    if (tcms_cf4m_iii_ii_i.get(0).getTourHotelId() == tcm.getTourHotelId()) {
                        insterFlag = 2;
                    }
                }
                if(tcms_cf4m_iii_iii !=null&&tcms_cf4m_iii_iii.size()!=0){
                    if (tcms_cf4m_iii_iii.get(0).getTourHotelId() == tcm.getTourHotelId()) {
                        insterFlag = 3;
                    }
                }
                if(tcms_cf4m_iii_iii_i !=null&&tcms_cf4m_iii_iii_i.size()!=0){
                    if ( tcms_cf4m_iii_iii_i.get(0).getTourHotelId() == tcm.getTourHotelId()) {
                        insterFlag = 3;
                    }
                }

                if (tcm.getMainPush() == MainPushEnum.MP_YES.getKey()) {
                    if (insterFlag == 1||insterFlag ==0) {
                        tcms_cf4m_iii_i.add(tcm);
                    }
                    if (insterFlag == 2) {
                        tcms_cf4m_iii_ii.add(tcm);
                    }
                    if (insterFlag == 3) {
                        tcms_cf4m_iii_iii.add(tcm);
                    }
                } else {
                    if (insterFlag == 1||insterFlag ==0) {
                        tcms_cf4m_iii_i_i.add(tcm);
                    }
                    if (insterFlag == 2) {
                        tcms_cf4m_iii_ii_i.add(tcm);
                    }
                    if (insterFlag == 3) {
                        tcms_cf4m_iii_iii_i.add(tcm);
                    }
                }


            }
            if (CompositionForum4MEnum.CF4M_IV.getKey() == tcm.getForum()) {
                tcms_cf4m_iv.add(tcm);
            }
            if (CompositionForum4MEnum.CF4M_V.getKey() == tcm.getForum()) {
                tcms_cf4m_v.add(tcm);
            }
        }
        result.put(CompositionForum4MEnum.CF4M_I.getKey(), tcms_cf4m_i);
        result.put(CompositionForum4MEnum.CF4M_I_I.getKey(), tcms_cf4m_i_i);
        result.put(CompositionForum4MEnum.CF4M_II.getKey(), tcms_cf4m_ii);
        result.put(CompositionForum4MEnum.CF4M_II_I.getKey(), tcms_cf4m_ii_i);

        result.put(CompositionForum4MEnum.CF4M_III_I.getKey(), tcms_cf4m_iii_i);
        result.put(CompositionForum4MEnum.CF4M_III_I_I.getKey(), tcms_cf4m_iii_i_i);
        result.put(CompositionForum4MEnum.CF4M_III_II.getKey(), tcms_cf4m_iii_ii);
        result.put(CompositionForum4MEnum.CF4M_III_II_I.getKey(), tcms_cf4m_iii_ii_i);
        result.put(CompositionForum4MEnum.CF4M_III_III.getKey(), tcms_cf4m_iii_iii);
        result.put(CompositionForum4MEnum.CF4M_III_III_I.getKey(), tcms_cf4m_iii_iii_i);



        result.put(CompositionForum4MEnum.CF4M_IV.getKey(), tcms_cf4m_iv);
        result.put(CompositionForum4MEnum.CF4M_V.getKey(), tcms_cf4m_v);
        return result;
    }
}

