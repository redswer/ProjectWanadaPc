# Wanada PC
컴퓨터 / 부품 소개 사이트


## 🖥️ 프로젝트 소개
다나와 PC 를 참고해 만든 Spring boot / Thyemleaf 프로젝트


## 🕰️ 개발 기간
* 1차 (JSP) : 24.10.10 ~ 24.10.26
* 2차 (Spring Boot (Thymeleaf) / DB) : 23.11.18 ~ 23.12.19


### 🧑‍🤝‍🧑 멤버 구성
 - Team Leader : 안진혁 - index, pc 상세 페이지 , 상품 검색, 마이 페이지
 - Sub Leader : 김현규 - 상품 상세 페이지, 카테고리 별 상품 페이지
 - Team Member 1 : 서광제 - 커뮤니티
 - Team Member 2 : 조유남 - 로그인, 회원가입, 회원정보 수정


### ⚙️ 개발 환경
 - `Java 17`
 - **IDE** : STS 4.26.0
 - **Framework** : Spring Boot (Thymleaf)
 - **Database** : Oracle


## 📌 주요 기능
#### Index 페이지 - <a href="">상세보기(WIKI)</a>
 - 이미지 슬라이드
 - 네비게이션 메뉴
 - 검색
#### Pc 상세 페이지 - <a href="">상세보기(WIKI)</a>
 - Pc 정보 (DB 의 상품 테이블들을 참조하여 Pc 테이블 생성)
 - Pc 의 부품 상세 정보 팝업 창으로 표시
#### 검색 페이지 - <a href="">상세보기(WIKI)</a>
 - 상품 정보 검색
 - 커뮤니티 글 검색
#### 마이 페이지 - <a href="">상세보기(WIKI)</a>
 - 회원정보 수정
 - 내가 쓴 글

#### 로그인 - <a href="">상세보기(WIKI)</a>
 - DB 의 정보와 비교
 - 로그인 시 session 생성
#### 회원가입 - <a href="">상세보기(WIKI)</a>
 - 유효성 검사
 - ID 중복체크
 - 패스워드 인코딩
#### 회원정보수정 - <a href="">상세보기(WIKI)</a>
 - 비밀번호 확인 후 페이지 이동

#### 상품 상세 페이지 - <a href="">상세보기(WIKI)</a>
 - 제품 목록
 - 카탈로그
 - 가격 및 이미지

#### 커뮤니티 - <a href="">상세보기(WIKI)</a>
 - 글 작성, 읽기, 수정, 삭제 (CRUD)
 - 글 작성, 수정, 삭제는 로그인 시 가능
