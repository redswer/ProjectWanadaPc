# Wanada PC
컴퓨터 / 부품 소개 사이트


## 🖥️ 프로젝트 소개
다나와 PC 를 참고해 만든 Spring boot / Thyemleaf 프로젝트


## 🕰️ 개발 기간
* 1차 (JSP) : 24.10.10 ~ 24.10.26
* 2차 (Spring Boot (Thymeleaf) / DB) : 23.11.18 ~ 23.12.19


### 🧑‍🤝‍🧑 멤버 구성
 - Team Leader : 안진혁 - index, pc 상세 페이지 , 상품 검색
 - Sub Leader : 김현규 - 로그인, 회원가입, 회원정보 수정, Id 찾기, Pw 찾기, 마이 페이지
 - Team Member 1 : 서광제 - 메인 페이지, 이벤트/쿠폰, 공지사항/문의
 - Team Member 2 : 조유남 - 상품 리스트, 카테고리별 상품, 배송 정보


### ⚙️ 개발 환경
 - `Java 11`
 - **IDE** : STS 3.9.9
 - **Framework** : SpringBoot 2.7.17, React (JSX)
 - **Database** : mySQL 8.0.25


## 📌 주요 기능
#### 메인 페이지 - <a >상세보기(WIKI)</a>
 - 이미지 슬라이드
 - 네비게이션 메뉴
 - 검색

#### 로그인 - <a href="https://github.com/redswer/finalProject/wiki/Login">상세보기(WIKI)</a>
 - DB 의 정보와 비교
 - ID 찾기, PW 찾기 (새로운 PW 메일로 전송)
 - 로그인 시 쿠키 및 세션 생성
 - ajax / axios 이용하여 유효성 검사
#### 회원가입 - <a href="https://github.com/redswer/finalProject/wiki/Join_Membership">상세보기(WIKI)</a>
 - 카카오 주소 API 연동
 - 유효성 검사
 - ID 중복체크
#### 마이 페이지 - <a >상세보기(WIKI)</a>
 - 회원정보 / 주소지 관리
 - 주문 / 배송 조회
 - 결제수단 관리
 - 고객센터
 - 장바구니 / 찜 목록
 - 내가 쓴 글

#### 상세 페이지 - <a >상세보기(WIKI)</a>
 - 카테고리 별 분류
 - 사이드 메뉴
 - 제품 검색
#### 결제 페이지 - <a >상세보기(WIKI)</a>
 - 결제수단 선택
 - 주소지 관리
 - 쿠폰 적용
#### 문의 및 공지사항 - <a >상세보기(WIKI)</a>
 - 글 작성, 읽기, 수정, 삭제 (CRUD)

#### 관리자 페이지 - <a >상세보기(WIKI)</a>
 - 상품 등록
