FakeBook API
============
* Users
	* 사용자 등록
	* 사용자 확인 
	* 사용자 삭제
* TimeLines
	* 실시간 타임라인 목록
	* 프로필 타임라인 목록
	* 타임라인 작성
	* 타임라인 수정
	* 타임라인 삭제
	* 타임라인 좋아요 추가
	* 타임라인 좋아요 삭제
	* 타임라인 보기
* Comments
	* 댓글 목록
	* 댓글 작성
	* 댓글 삭제
* Friends 
	* 친구 목록
	* 친구 요청
	* 친구 요청 수락
	* 친구 요청 거절
	* 친구 삭제
	* 친구 검색


Users
---------
> ### 사용자 등록
>> 사용자를 등록할 수 있습니다.

#### [Request]
<pre>
POST /user
De HTTP/1.1 
Host : localhost
</pre>

| 키		 	      | 설명 		   		| 타입		   |
| ----------      | :--------- 		| :----------  | 
| username        | 유저 이름       	| String       | 
| userid    	  | 유저 아이디       	| String       | 
| userpassword    | 유저 비밀번호		| String       | 


#### [Response]

| 리턴 값		      | 설명 		   					| 
| ----------      | :--------- 					| 
| 0        		  | 아이디 중복 및 등록 실패       	| 
| 1 	   	  	  | 등록 성공       				| 

<hr>

> ### 사용자 확인
>> 사용자가 존재하는 사용자인지 확인할 수 있다.

#### [Request]
<pre>
GET /user/check
De HTTP/1.1 
Host : localhost
</pre>

| 키		 	      | 설명 		   		| 타입		   |
| ----------      | :--------- 		| :----------  | 
| userid    	  | 유저 아이디       	| String       | 
| userpassword    | 유저 비밀번호		| String       | 


#### [Response]

| 수신		      | 설명 		   								| 
| ----------      | :--------- 								| 
| 성공        	  | 사용자의 데이터가 JSON형식으로 날라온다       	| 
| 실패 	   	  	  | 아무것도 안온다.       						|

<hr>

> ### 사용자 삭제
>> 사용자가 삭제할 수 있다.

#### [Request]
<pre>
DELETE /user/{id}
De HTTP/1.1 
Host : localhost
</pre>

| 키		 	      | 설명 		   		| 타입		   |
| ----------      | :--------- 		| :----------  | 
| id	     	  | 사용자 PK       	| String       | 