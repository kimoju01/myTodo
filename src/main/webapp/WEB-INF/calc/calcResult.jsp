<%--
  Created by IntelliJ IDEA.
  User: Hyeju
  Date: 2023-08-31
  Time: 오후 7:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>NUM1 ${param.num1}</h1>  <!-- %{}은 EL(Expression Language) -->
    <h1>NUM2 ${param.num2}</h1>

    <!-- 웹의 파라미터는 모두 문자열이기 때문에 Integer.parseInt()가 필요하다 -->
    <h1>SUM ${Integer.parseInt(param.num1) + Integer.parseInt(param.num2)}</h1>
</body>
</html>
