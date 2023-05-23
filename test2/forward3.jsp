<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*,sec01.ex01.*"
	
    pageEncoding="UTF-8"%>
<%
  request.setCharacterEncoding("utf-8");
	// 주소 정보 바인딩
	List membersList =new ArrayList();
	MemberBean m1= new MemberBean("lee","1234","이순신","lee@test.com");
	MemberBean m2= new MemberBean("hong","1234","홍길동","hong@test.com");
	membersList.add(m1);
	membersList.add(m2);
	request.setAttribute("membersList",membersList);

%>    

<html>
	<head>
	   <meta charset=”UTF-8">
	   <title>forward3</title>
	</head>
	<body>
		<!-- 포워딩 -->
	    <jsp:forward page="member3.jsp"></jsp:forward>
	</body>
</html>
