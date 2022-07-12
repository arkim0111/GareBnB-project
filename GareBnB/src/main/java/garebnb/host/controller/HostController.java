package garebnb.host.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import garebnb.common.common.CommandMap;
import garebnb.host.service.HostService;

@Controller
public class HostController {

	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="hostService")
	private HostService hostService;
	
	@ResponseBody
	@RequestMapping(value="/myPage/hostDetail.do" )
    public Map<String, Object> hostDetail(CommandMap commandMap) throws Exception{
		Map<String, Object> Json = new HashMap<String, Object>();
    	
		
    	return Json;
    }
	
	@ResponseBody
	@RequestMapping(value="/myPage/hostInfo.do" )
    public Map<String, Object> hostInfo(CommandMap commandMap) throws Exception{
		Map<String, Object> Json = new HashMap<String, Object>();
    	
		
    	return Json;
    }
	
	@ResponseBody
	@RequestMapping(value="/myPage/hostModifyForm.do" )
    public Map<String, Object> hostModifyForm(CommandMap commandMap) throws Exception{
		Map<String, Object> Json = new HashMap<String, Object>();
    	
		
    	return Json;
    }
	
	@ResponseBody
	@RequestMapping(value="/myPage/hostModify.do" )
    public Map<String, Object> hostModify(CommandMap commandMap) throws Exception{
		Map<String, Object> Json = new HashMap<String, Object>();
    	
		
    	return Json;
    }
	
	@ResponseBody
	@RequestMapping(value="/myPage/hostDelete.do" )
    public Map<String, Object> hostModifyDelete(CommandMap commandMap) throws Exception{
		Map<String, Object> Json = new HashMap<String, Object>();
    	
		
    	return Json;
    }
	
	@ResponseBody
	@RequestMapping(value="/admin/hostConfirmList.do" )
    public Map<String, Object> hostConfirmList(CommandMap commandMap) throws Exception{
		Map<String, Object> Json = new HashMap<String, Object>();
    	
		
    	return Json;
    }
	
	@ResponseBody
	@RequestMapping(value="/admin/hostConfirmDetail.do" )
    public Map<String, Object> hostConfirmDetail(CommandMap commandMap) throws Exception{
		Map<String, Object> Json = new HashMap<String, Object>();
    	
		
    	return Json;
    }
	
	@ResponseBody
	@RequestMapping(value="/admin/HostConfirm.do" )
    public Map<String, Object> HostConfirm(CommandMap commandMap) throws Exception{
		Map<String, Object> Json = new HashMap<String, Object>();
    	
		
    	return Json;
    }
	
	@ResponseBody
	@RequestMapping(value="/admin/hostConfirmDeny.do" )
    public Map<String, Object> hostConfirmDeny(CommandMap commandMap) throws Exception{
		Map<String, Object> Json = new HashMap<String, Object>();
    	
		
    	return Json;
    }
	
	
}
