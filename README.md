<div align="center">
  
# 🐶 Spring-Project-GareBnB
`Spring + React 사이트`

## 🐱 프로젝트 소개
`에어비앤비를 참고하여 만든 개인 간의 반려동물 호텔링 서비스 예약 사이트입니다.`

## 📆 제작 기간
`2022년 6월 27일 ~ 8월 12일`

## 🧑‍🤝‍🧑 멤버 구성
- 김진 : 게시글 관리
- 구승회 : 회원가입, 로그인
- 🙂 **김아람 : 회원 관리**
- 이승아 : 예약 관리, 리뷰 관리
- 강호연 : QNA 관리, 신고 관리

## 💻 개발 환경
- java 11
- IDE : Eclipse, SQL Developer, VS Code
- Framework : Spring, Bootstrap, React
- Database : Oracle DB(11g)
- ORM : Mybatis

## 🔍 Overview

### 1. Main Page ( 마리&지역&날짜 등의 검색 조건에 따른 게시글 출력이 가능하다.)

<img width="900" height="500" alt="image" src="https://user-images.githubusercontent.com/78268037/208240723-954b0fde-908e-4674-bc7c-d2ce12552c72.png">

---
### 2. 게시글 리스트 페이지 ( 검색 조건에 따른 게시글 출력이 가능하다.)

<img width="900" height="500" alt="image" src="https://user-images.githubusercontent.com/78268037/208241151-c0ce888e-7ed1-4be8-bcee-3a8cd13ccced.png">

---
### 3. 게시글 상세 페이지 ( 게시글의 상세 내용, 후기 확인 페이지 - 예약 버튼 클릭 시 예약 페이지로 이동한다. )

<img width="800" height="450" alt="image" src="https://user-images.githubusercontent.com/78268037/208241201-8492caf5-f7e6-4005-90e2-6bc6845bf9c3.png">

---
### 4. 예약 페이지 ( 호스트 상세 정보 확인 페이지 -  예약 기간 및 요청 사항 등을 작성할 수 있다. )

<img width="400" alt="image" src="https://user-images.githubusercontent.com/78268037/208241369-6cfb11ee-23ff-406c-bc59-e74857531d81.png">

---
### 5. 예약 내역 페이지 ( 예약 내역 정보 확인 페이지 - 예약 상태 단계가 표시된다. )

<img width="700" height="700" alt="image" src="https://user-images.githubusercontent.com/78268037/208241417-73812cbb-7ad1-47ea-baaf-1b95c1f49256.png">

---
### 6. 이용 내역 페이지 ( 이용 내역 정보를 확인할 수 있는 페이지 -  리뷰 작성 및 호스트 신고가 가능하다. )

<img width="800" height="400" alt="image" src="https://user-images.githubusercontent.com/78268037/208241624-a0e6690f-629a-465c-8aaf-50471ea9c83c.png">

---
### 7. 호스트 전환 요청 페이지 ( 호스트 권한을 요청하는 페이지 - 정보 입력, API 이용한 주소 검색, 이미지 파일 등록이 가능하다. )

<img width="587" alt="image" src="https://user-images.githubusercontent.com/78268037/208242469-9853de1b-036b-4bc4-a27d-b5d037d88962.png">
<img width="523" alt="image" src="https://user-images.githubusercontent.com/78268037/208242472-4e65065a-0407-4953-99bb-02d6683fd35a.png">

---
### 8. QNA 페이지 ( 문의 내역 리스트 페이지 - QNA 입력/수정/삭제가 가능하다. )

<img width="800" height="400" alt="image" src="https://user-images.githubusercontent.com/78268037/208241767-9ffd306a-09f7-4fb1-8655-b9081e3ae1f7.png">

---
### 9. [관리자] 게시글 리스트 페이지 ( 전체 게시글 리스트 페이지 - 게시글 등록 상태에 따른 필터 기능이 있다. )

<img width="700" height="600" alt="image" src="https://user-images.githubusercontent.com/78268037/208241810-48b8258c-76c5-4a4b-a42b-c507aa0ddacd.png">

---
### 10. [관리자] 회원 관리 페이지 ( 전체 회원 리스트 페이지 - 아이디 또는 이름으로 회원 정보를 검색할 수 있다. )

<img width="800" height="400" alt="image" src="https://user-images.githubusercontent.com/78268037/208241860-ce009ddb-d2bc-49e1-80b1-7aae606f9545.png">

---
## 📝 ERD
<img width="700" alt="ERD" src="https://user-images.githubusercontent.com/78268037/208240335-576c20a5-e070-4f94-8ae5-b1415965a7b0.png">

## 🗞️ 요구사항 정의서

<img width="550" alt="요구사항명세서" src="https://user-images.githubusercontent.com/78268037/208242880-5ef4ddf5-fbcb-4a23-8fca-46ed97f47012.png">

## 📝 유스케이스 다이어그램 

### 1. 비회원
<img width="600" alt="ERD" src="https://user-images.githubusercontent.com/78268037/222959680-197c5fe2-fd5a-4ab3-8414-d459c1a868e5.png">

---
### 2. 일반회원
<img width="1000" alt="ERD" src="https://user-images.githubusercontent.com/78268037/222959901-7681c726-0766-4d41-8206-8b25277a8da4.png">

---
### 3. 호스트회원
<img width="1000" alt="ERD" src="https://user-images.githubusercontent.com/78268037/222960021-83874a1a-f44c-4461-ae40-44fdc816e526.png">

---
### 4. 관리자
<img width="1000" alt="ERD" src="https://user-images.githubusercontent.com/78268037/222960105-63779f9f-b154-4570-bbda-ddae2dd89555.png">

</div>

