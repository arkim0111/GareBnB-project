package garebnb.reservation.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import garebnb.common.common.CommandMap;
import garebnb.reservation.service.ReservationService;

@Controller
public class ReservationController {
	
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="ReservationService")
	private ReservationService reservationService;
	
	//클라이언트가 보는 예약내역 조회
	@ResponseBody
	@RequestMapping(value="/mypage/memReserveList")
	public List<Map<String,Object>> memReserveList(CommandMap commandMap) throws Exception{
		return reservationService.selectMemReserveList(commandMap.getMap());
	}
	
	//클라이언트가 보는 이용내역 조회
	@ResponseBody
	@RequestMapping(value="/mypage/memuseList")
	public List<Map<String,Object>> memUseList(CommandMap commandMap) throws Exception{
		return reservationService.selectOneResComList(commandMap.getMap());

	}
	
	//호스트가 보는 예약내역 조회
	@ResponseBody
	@RequestMapping(value="/host/mypage/resList")
	public List<Map<String,Object>> resList(CommandMap commandMap) throws Exception{
		return reservationService.selectReserve(commandMap.getMap());
	}
	
	//호스트가 예약거절사유입력
	@ResponseBody
    @RequestMapping(value= "/host/mypage/resRejectPut") 
    public void resRejectPut(CommandMap commandMap) throws Exception {
        reservationService.updateResReject(commandMap.getMap());
    }
	
	//예약 요청 보내기 
	@ResponseBody
    @RequestMapping(value= "/mypage/resRequest") 
    public String resRequest(CommandMap commandMap) throws Exception {
        reservationService.insertOneReserve(commandMap.getMap());
        return "";
    }
	
	//예약 요청 상세보기
	@ResponseBody
	@RequestMapping(value="/mypage/resRequestDetail")
	public Map<String, Object> resRequestDetail(CommandMap commandMap) throws Exception{
		
    	return reservationService.selectReserveDetail(commandMap.getMap());
	}
}

















