import React, { useState, useEffect } from 'react';
import axios from 'axios';
// import { useParams } from 'react-router-dom';
import {useLocation} from 'react-router-dom';
 import Table from 'react-bootstrap/Table';
 import {Button,Form} from 'react-bootstrap';
// import Alert from 'react-bootstrap/Alert';


const AdminQnaDetail = () => {

    const location = useLocation();
    const qna_idx = location.state.QNA_IDX;
    //console.log(qna_idx);

    const [detail, setDetail] = useState([]);
    useEffect(() => {
      axios({ //통신으로 정보 받아오기 --memDetailQna.do 랑 겹침,,
              method : 'post' ,
              url : '/GareBnB/mypage/memDetailQna.do' ,
              contentType:"application/json;charset=UTF-8",
              params : {
                  QNA_IDX : qna_idx
              }
          }).then(Response => {
              console.log(Response.data);
              setDetail(Response.data);
              //응답이 들어왔을 때 SetQnaList 함수를 사용해서 
              //response의 data를 detail의 정보로 변경
          });
      },[]);  



      //-------comment 업데이트
      const [qnaUpdate , setQnaUpdate] = useState({
        comment : ''
      });

      const handleChange = (e) => { //이벤트 e 선언 폼의 text들이 change 될 때마다 e의 값이 넘어감
        const {name,value} = e.target
        setQnaUpdate ({
          ...qnaUpdate, //...기존의 qnaUpdate 값에
        [name]:value
        })
        //console.log(form); //form 얘한테 comment가 담겨있음
      };
      
      //입력 버튼 클릭 시 update 실행해주는 함수 (레벨 미답변->답변완료
     
      const adminUpdateQna = (e) => { 
        e.preventDefault();
        axios({
        method : 'post',
        url : '/GareBnB/Admin/qnaComment.do',
        contentType:"apllication/json; charset=UTF-8",
        params : {
          QNA_COMMENT : (qnaUpdate.comment),  //입력된 값이 넘어가야함
          QNA_IDX : qna_idx
        }
      }).then(Response => {
        console.log(Response.data);
        setQnaUpdate(Response.data);
      });
      window.location.reload();
      }


      // QNA_답변 폼  
      const state = detail.QNA_STATE;
      //console.log(state);
      const CommentForm =() => {
        return(
        <div className='commentF'>
        <Form onSubmit={adminUpdateQna}>
        <Form.Group controlId="formBasicEmail">
        <Form.Label>답변하기</Form.Label>
        <Form.Control type="text" placeholder="답변내용을 등록하세요" 
        onChange={handleChange} name="comment" value={qnaUpdate.comment} />
      </Form.Group>

      <Button variant="primary" type="submit">
        입력하기
      </Button>
      </Form>
      </div>
        )
      }


  
     return (
    
    

    <div className='container'>
      <hr/>
      <h1>상세보기</h1>
      <hr/>

      <Table width="500px" height="30px" >
          <tbody>
            <tr>
              <td width="100px" color='black'>IDX</td>
              <td width="400px">{detail.QNA_IDX}</td>
            </tr>
            <tr>
              <td width="100px">ID</td>
              <td width="400px">{detail.QNA_ID}</td>
            </tr>
            <tr>
              <td width="100px">TITLE</td>
              <td width="400px">{detail.QNA_TITLE}</td>
            </tr>
            <tr>
              <td width="100px">CONTENT</td>
              <td width="400px">{detail.QNA_CONTENT}</td>
            </tr>
            <tr>
              <td width="100px">STATE</td>
              <td width="400px">{detail.QNA_STATE}</td>
            </tr>
            <tr>
              <td width="100px">DATE</td>
              <td width="400px">{detail.QNA_DATE}</td>
            </tr> 
          </tbody>
                
      </Table> 

{/* QNA_STATE 값이 0인경우에만 나오게,, 아니면 TEXTAREA로 */}
    <div>
     {state==='미답변' ? <h1><CommentForm/></h1>:
      <>
      <label htmlFor="exampleTextarea" class="form-label mt-4"><h3>문의답변</h3></label>
      <div className="card border-success mb-3">
        <div className="card-body">
          <p className="card-text">{detail.QNA_COMMENT}</p>
        </div>
      </div>
      <div className="col text-center">
      <button type="submit" className="btn btn-primary float-right" >수정</button>
      </div>
      </>
      }
      </div>  
    </div>          
  );
};

export default AdminQnaDetail;