package garebnb.reservation.dao;

import java.util.List;
import java.util.Map;

public interface ReservationDAO {
	
	public List<Map<String, Object>> selectMemReserveList (Map<String,Object> map) throws Exception; //클라이언트가 보는 예약내역조회

	public List<Map<String, Object>> selectOneResComList (Map<String,Object> map) throws Exception; //클라이언트가 보는 이용내역
	
	public List<Map<String, Object>> selectReserve (Map<String,Object> map) throws Exception; //호스트가 보는 예약내역조회

	public void updateResReject(Map<String, Object> map) throws Exception; //예약거절사유 입력

	public void insertOneReserve(Map<String, Object> map) throws Exception; //상세페이지에서 예약요청

	public Map<String, Object> selectReserveDetail(Map<String, Object> map) throws Exception; //예약요청전 상세보기
}
