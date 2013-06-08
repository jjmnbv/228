package com.ljbd.ocrs.website.erp.web.controller;

import cn.org.rapid_framework.page.*;
import cn.org.rapid_framework.page.Page;
import cn.org.rapid_framework.page.impl.*;
import cn.org.rapid_framework.util.*;
import cn.org.rapid_framework.web.scope.Flash;
import cn.org.rapid_framework.web.util.*;
import com.ljbd.ocrs.rentalcar.domain.common.Org;
import com.ljbd.ocrs.rentalcar.domain.example.Example;
import com.ljbd.ocrs.rentalcar.domain.query.ExampleQuery;
import com.ljbd.ocrs.rentalcar.facade.example.ExampleFacade;
import com.ljbd.ocrs.rentalcar.manager.example.ExampleManager;
import com.ljbd.common.util.springmvc.BaseRestSpringController;
import com.ljbd.ocrs.rentalcar.facade.example.ExampleFacade;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Controller
@RequestMapping("/example")
public class ExampleController extends BaseRestSpringController<Example, Integer> {
	//默认多列排序,example: username desc,createTime asc
	protected static final String DEFAULT_SORT_COLUMNS = null;
	@Resource
	private ExampleFacade exampleFacade;

	private final String LIST_ACTION = "redirect:/example";

	/**
	 * 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,注意大小写
	 **/
	public void setExampleFacade(ExampleFacade manager) {
		this.exampleFacade = manager;
	}

	/** binder用于bean属性的设置 */
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


	/** 列表 */
	 @RequestMapping(value = "", method = RequestMethod.GET)
	public String index(ModelMap model, ExampleQuery query,@RequestParam(value = "ajax", required = false) Boolean ajax) {
		Page page = this.exampleFacade.findPage(query);
		 if (Boolean.TRUE.equals(ajax)) {
            return "example/example-index-ajax";
        }
		model.addAllAttributes(toModelMap(page, query));
         model.addAttribute("org", Org.Unknown);
		return "/example/example-index";
	}


	/** 显示 */
	@RequestMapping(value="/{id}" , method = RequestMethod.GET)
	public String show(ModelMap model,@PathVariable Integer id) throws Exception {
		Example example = (Example)exampleFacade.getById(id);
		model.addAttribute("example",example);
		return "/example/example-show";
	}


	/** 进入新增 */
	@RequestMapping(value="/new", method = RequestMethod.GET)
	public String editNew(ModelMap model,Example example) throws Exception {
		model.addAttribute("example",example);
		return "/example/example-new";
	}


	/** 保存新增,@Valid标注spirng在绑定对象时自动为我们验证对象属性并存放errors在BindingResult  */
	@RequestMapping(method=RequestMethod.POST)
	public String create(ModelMap model,@Valid Example example,BindingResult errors,HttpServletRequest request,HttpServletResponse response) throws Exception {
		if(errors.hasErrors()) {
			return  "/example/example-new";
		}

		exampleFacade.save(example);
		Flash.current().success(CREATED_SUCCESS); //存放在Flash中的数据,在下一次http请求中仍然可以读取数据,error()用于显示错误消息
		return LIST_ACTION;
	}

	/** 编辑 */
	@RequestMapping(value="/{id}/edit", method = RequestMethod.GET)
	public String edit(ModelMap model,@PathVariable Integer id) throws Exception {
		Example example = (Example)exampleFacade.getById(id);
		model.addAttribute("example",example);
		return "/example/example-edit";
	}

	/** 保存更新,@Valid标注spirng在绑定对象时自动为我们验证对象属性并存放errors在BindingResult  */
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public String update(ModelMap model,@PathVariable Integer id,@Valid Example example,BindingResult errors) throws Exception {
		if(errors.hasErrors()) {
			return "/example/example-edit";
		}

		exampleFacade.update(example);
		Flash.current().success(UPDATE_SUCCESS);
		return LIST_ACTION;
	}

	/** 删除 */
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public String delete(ModelMap model,@PathVariable Integer id) {
		exampleFacade.removeById(id);
		Flash.current().success(DELETE_SUCCESS);
		return LIST_ACTION;
	}

	/** 批量删除 */
	@RequestMapping(method=RequestMethod.DELETE)
	public String batchDelete(ModelMap model,@RequestParam("items") Integer[] items) {
		for(int i = 0; i < items.length; i++) {
			exampleFacade.removeById(items[i]);
		}
		Flash.current().success(DELETE_SUCCESS);
		return LIST_ACTION;
	}

}