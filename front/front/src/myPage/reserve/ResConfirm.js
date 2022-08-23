import axios from 'axios';
import { useEffect } from 'react';
import { useLocation, useNavigate} from 'react-router-dom';

const ReserveConfirm =() => {

    const location = useLocation();
    const navigate = useNavigate();
        useEffect(()=>{
            console.log(location)
        axios({
            method : 'post' ,
            url : '/GareBnB/mypage/ResConfirm.do' ,
            contentType:"application/json;charset=UTF-8",
            params : {
                RES_IDX : location.state.res_idx
            }
        }).then(Response => {
            navigate('/myPage/ReserveListPage');
        })
    },[])
        

    
}
export default ReserveConfirm;