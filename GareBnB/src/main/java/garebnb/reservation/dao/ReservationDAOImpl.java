package garebnb.reservation.dao;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("ReservationDAO")
public class ReservationDAOImpl implements ReservationDAO{
	
	protected Log log = LogFactory.getLog(ReservationDAO.class);
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	protected void printQueryId(String queryId) {
		if(log.isDebugEnabled()) {
			log.debug("\t QueryId \t:  " + queryId);
		}
	}
	//클라이언트가 보는 예약내역조회
	 @Override
	    public List<Map<String, Object>> selectMemReserveList(Map<String, Object> map) throws Exception {
	        // TODO Auto-generated method stub
	        return sqlSession.selectList("reservation.selectMemReserveList", map);
	 }
	 
	 //클라이언트가 보는 이용내역
	 @Override
	    public List<Map<String, Object>> selectOneResComList(Map<String, Object> map) throws Exception {
	        // TODO Auto-generated method stub
	        return sqlSession.selectList("reservation.selectOneResComList", map);
	    }
	 
	 //호스트가 보는 예약내역조회
	 @Override
	    public List<Map<String, Object>> selectReserve(Map<String, Object> map) throws Exception {
	        // TODO Auto-generated method stub
	        return sqlSession.selectList("reservation.selectReserve", map);
	    }
	 
	 //예약거절사유 입력
	 @Override
	 public void updateResReject(Map<String, Object> map) throws Exception{
			sqlSession.update("reservation.updateResReject", map);
		}
	 
	 //상세페이지에서 예약요청
	 public void insertOneReserve(Map<String, Object> map) throws Exception{
			sqlSession.insert("reservation.insertOneReserve", map);
		}
	 
	 //예약요청전 상세보기
	 @SuppressWarnings("unchecked")
	    @Override
	    public Map<String, Object> selectReserveDetail(Map<String, Object> map) throws Exception {
	        // TODO Auto-generated method stub
	        return (Map<String , Object>) sqlSession.selectOne("reservation.selectReserveDetail", map);
	    }

}
