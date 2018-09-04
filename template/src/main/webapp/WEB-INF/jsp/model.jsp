<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>index</title>
  <style>
    *{
      padding: 0;
      margin: 0;
    }
  </style>
</head>

<body>
  <!-- 输出普通字符 -->
  <h1>${title}</h1>
  <br/>

  <!-- 输出List -->
  <h1>书籍列表</h1>
  <ul>
    <c:forEach items="${bookList}" var="node">
      <li>
          <c:out value="${node}"></c:out>
      </li>
    </c:forEach>
  </ul>
  <br/>
  <br/>

  <!-- 输出Map -->
  <c:forEach items="${map}" var="node">
    <p>
      姓名：<c:out value="${node.key}"></c:out>
      住址：<c:out value="${node.value}"></c:out>
    </p>
  </c:forEach>
</body>

</html>